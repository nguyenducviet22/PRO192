
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class SongList extends TreeSet<Song>{
    public void addSong(Song song){
        this.add(new Song(song.getName(), song.getDuration()));
    }
    
    public Song getSongMaxDuration(){
        int maxDu = 0;
        for (Song s : this) {
            if (maxDu < s.getDuration()){
                maxDu = s.getDuration();
            }
        }
        Song song = null;
        for (Song s : this) {
            if (s.getDuration() == maxDu)
                song = s;
        }
        return song;
    }
}
