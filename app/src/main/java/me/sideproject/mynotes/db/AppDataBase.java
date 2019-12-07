package me.sideproject.mynotes.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import me.sideproject.mynotes.dao.NoteDAO;
import me.sideproject.mynotes.model.Note;
//Singleton Instance DataBase
@Database(entities = {Note.class},version = 1)
public abstract class AppDataBase extends RoomDatabase{
    private static volatile  AppDataBase appDataBase ;
   public AppDataBase() {

   }
   public abstract  NoteDAO getDao () ;
    public static AppDataBase getInstance(Context context) {
AppDataBase temp = appDataBase ;

       if (temp != null ) {
           return temp ;
       }
         temp = Room.databaseBuilder(context.getApplicationContext(),AppDataBase.class, "Notes.db").build() ;

       appDataBase = temp ;

   return temp ;}

}
