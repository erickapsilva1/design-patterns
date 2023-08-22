package flyweight;

import org.jfugue.player.Player;

import java.util.List;

public class Piano {

    public void play(List<Note> music){

        Player player = new Player();

        StringBuilder musicInNotes = new StringBuilder();
        for(Note note : music){
            musicInNotes.append(note.symbol() + " ");
        }

        System.out.println(musicInNotes.toString());

        player.play(musicInNotes.toString());

    }

}
