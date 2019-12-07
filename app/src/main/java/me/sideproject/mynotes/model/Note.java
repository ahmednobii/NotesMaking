package me.sideproject.mynotes.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity (tableName = "NoteTable")
public class Note {
    @PrimaryKey (autoGenerate = true)
    private int id ;
    @ColumnInfo
    private String title ;
    @ColumnInfo
    private  String content ;

    public Note() {
    }

    public Note(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
@Ignore
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Ignore
    public int getId() {
        return id;
    }
    @Ignore
    public void setId(int id) {
        this.id = id;
    }
    @Ignore
    public String getTitle() {
        return title;
    }
    @Ignore
    public void setTitle(String title) {
        this.title = title;
    }
    @Ignore
    public String getContent() {
        return content;
    }
    @Ignore
    public void setContent(String content) {
        this.content = content;
    }
}
