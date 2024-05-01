package com.my.testproject;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> playlist = new ArrayList<>();
//    private Music music;
//    private String name;
//    private int volume;

    public MusicPlayer(List<Music> playlist) {
        this.playlist = playlist;
    }

    public MusicPlayer() {}

    public void setPlaylist(List<Music> playlist) {
        this.playlist = playlist;
    }

    public List<Music> getPlaylist() {
        return playlist;
    }

    public void playMusic() {
        for (Music m : playlist) {
            System.out.println("Playing: " + m.getSong());
        }
    }
}
