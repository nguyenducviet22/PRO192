/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Song implements Comparable<Song> {

    private String name;
    private int duration;

    public Song() {
    }

    public Song(String name, int duration) {
        if (this.duration < 1) {
            this.duration = 1;
            this.name = name.toUpperCase();
        } else {
            this.name = name;
            this.duration = duration;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format("%s,%d", name, duration);
    }

    @Override
    public int compareTo(Song o) {
        return this.name.substring(0, 1).compareTo(o.name.substring(0, 1));
    }

    
}
