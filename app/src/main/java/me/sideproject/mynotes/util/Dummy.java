package me.sideproject.mynotes.util;

import java.util.ArrayList;
import java.util.List;

import me.sideproject.mynotes.model.Note;

public class Dummy {
  private static List<Note> listDummy =  new ArrayList<>() ;
    public static List<Note> getList () {
        listDummy.add(new Note (1,"First Note","Hi this the first note")) ;
        listDummy.add(new Note (2,"Second Note","Hi this the first note")) ;
        listDummy.add(new Note (3,"Third Note","Hi this the first note")) ;
        listDummy.add(new Note (4,"Forth Note","Hi this the first note")) ;
        listDummy.add(new Note (5,"FifthNote","Hi this the first note")) ;


    return listDummy ;
    }

}
