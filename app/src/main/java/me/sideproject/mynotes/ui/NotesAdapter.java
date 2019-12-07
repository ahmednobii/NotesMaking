package me.sideproject.mynotes.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import me.sideproject.mynotes.R;
import me.sideproject.mynotes.model.Note;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {
    private List<Note> list ;

    public NotesAdapter(List<Note> list) { //Consttuctor for  intiializing  the list
        this.list = list;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new NotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static  class NotesViewHolder extends RecyclerView.ViewHolder {
TextView title ;
FloatingActionButton floatingActionButton ;
    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);
    title = itemView.findViewById(R.id.textView) ;
floatingActionButton = itemView.findViewById(R.id.floatingActionButton) ;
    }
}

}
