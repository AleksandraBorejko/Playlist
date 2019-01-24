package com.playlist;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> album;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.album = new ArrayList<>();
    }

    public List<Song> getAlbum() {
        return album;
    }

    private boolean addSong(Song song) {
        if (song == null) {
            return false;
        } else if (this.album.contains(song)) {
            System.out.println("Song " + song.getTitle() + " is already on the list.");
            return false;
        } else {
            this.album.add(song);
        }
        return true;
    }

    public boolean addSongs(Song... songs) {
        for (int i = 0; i < songs.length; i++) {
            addSong(songs[i]);
        }
        return true;
    }

    public void printAlbum(){
        for (Song song : this.album) {
            System.out.println(song);
        }
    }
}
