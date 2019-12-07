package me.sideproject.mynotes.viewmodels;

import android.content.Context;



import java.util.List;

import me.sideproject.mynotes.model.Note;
import me.sideproject.mynotes.repository.MainRepo;

public class ViewModel   extends androidx.lifecycle.ViewModel {
  private   MainRepo mainRepo  ;
public  void set(Context context) {
    mainRepo = new MainRepo(context) ;

}
    public  void insertNote (Note note) {
mainRepo.insertNote(note);
    }
    public List<Note> getNotes() {
return mainRepo.getNotes();
   }
    public void deleteNote (int id) {
         mainRepo.deleteNote(id);
    }
    public  Note getNoteById (int id) {
        return   mainRepo.getNoteById(id) ;

    }

}
