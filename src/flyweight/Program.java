package flyweight;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        MusicalNotes notes = new MusicalNotes();

        List<Note> music = Arrays.asList(
                notes.capture("C"),
                notes.capture("D"),
                notes.capture("E"),
                notes.capture("F"),
                notes.capture("F"),
                notes.capture("F")
        );

        Piano piano = new Piano();
        piano.play(music);

    }



}
