package me.sideproject.mynotes;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import me.sideproject.mynotes.model.Note;
import me.sideproject.mynotes.ui.NotesAdapter;
import me.sideproject.mynotes.util.Dummy;
import me.sideproject.mynotes.viewmodels.ViewModel;

public class MainActivity extends AppCompatActivity {
RecyclerView  recyclerView ;
List <Note> noteList ;
   FloatingActionButton floatingActionButton ;
    ViewModel viewModel ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        floatingActionButton = findViewById(R.id.fab) ;

recyclerView = findViewById(R.id.recView) ;
noteList = Dummy.getList() ;

   //     ViewModelProvider.AndroidViewModelFactory viewModelFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication());

    viewModel = ViewModelProviders.of(this).get(ViewModel.class) ;
    viewModel.set(this);
    viewModel.insertNote(new Note ("Title","First Note in DB"));
    }
    Intent i ;
    @Override
    protected void onStart() {
        super.onStart();
        i= new Intent(this ,EditActivtity.class) ;

        NotesAdapter adapter = new NotesAdapter(noteList) ;
        recyclerView.setAdapter(adapter);
floatingActionButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(i);
    }
});

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
