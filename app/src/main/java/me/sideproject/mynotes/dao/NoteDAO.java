package me.sideproject.mynotes.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import me.sideproject.mynotes.model.Note;
@Dao
public interface NoteDAO {
    //Main
    @Query("SELECT * FROM notetable")
    public List<Note> getNotes () ;

//Second if i want to edit
    @Query("SElECT * FROM  NoteTable WHERE id LIKE :id")
    public Note getNoteById(int id) ;
//new Note
    @Insert
    public void addNote(Note note) ;

    //Delete Note
    @Query("DELETE  FROM notetable where id like :id")
    public void deleteNote (int id) ;


}
