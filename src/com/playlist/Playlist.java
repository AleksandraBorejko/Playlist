package com.playlist;

import java.util.LinkedList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> playList;

    public Playlist(String name) {
        this.name = name;
        this.playList = new LinkedList<>();
    }

    public List<Song> getPlayList() {
        return playList;
    }

    public String getName() {
        return name;
    }

    private Song findSong(String title, Album album) {
        for (Song checkedSong : album.getAlbum()) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(String title, Album album) {
        Song checkedSong = findSong(title, album);

        if (checkedSong != null) {
            this.playList.add(checkedSong);
            return true;
        }
        System.out.println("There is no " + title + " song on the list");
        return false;
    }

    public boolean addToPlaylist(int trackNumber, Album album) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < album.getAlbum().size())) {
            this.playList.add(album.getAlbum().get(index));
            return true;
        }
        System.out.println("There's no track nr: " + trackNumber + " on the list.");
        return false;
    }

    public void printPlaylist() {
        System.out.println("*******************************");
        System.out.println("Playlist " + this.name);
        for (Song song : this.playList) {
            System.out.println(song);
        }
        System.out.println("*******************************");
    }
}
