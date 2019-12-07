package me.sideproject.mynotes.repository;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;

import me.sideproject.mynotes.db.AppDataBase;
import me.sideproject.mynotes.model.Note;

public class MainRepo {
    private AppDataBase appDataBase ;
    public MainRepo (Context context) {
        appDataBase =  AppDataBase.getInstance(context) ;
    }
public  void insertNote (Note note) {
        appDataBase.getDao().addNote(note);

}
public List<Note> getNotes() {

        return appDataBase.getDao().getNotes() ;
}
public void deleteNote (int id) {
        appDataBase.getDao().deleteNote(id);
}
public  Note getNoteById (int id) {
return   appDataBase.getDao().getNoteById(id) ;

}
}
