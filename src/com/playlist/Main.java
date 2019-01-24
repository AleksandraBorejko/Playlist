package com.playlist;

public class Main {
    public static void main(String[] args) {
        Song one = new Song("Don't Panic", 2.17);
        Song two = new Song("Shiver", 4.59);
        Song three = new Song("Spies", 5.18);
        Song four = new Song("Sparks", 3.47);
        Song five = new Song("Yellow", 4.29);
        Song six = new Song("Trouble", 4.30);
        Song seven = new Song("Parachutes", 0.46);
        Song eight = new Song("High Speed", 4.14);
        Song nine = new Song("We Never Change", 4.09);
        Song ten = new Song("Everything's Not Lost", 7.15);

        Album parachutes = new Album("Parachutes", "Coldplay");
        parachutes.addSongs(one, two, three, four, five, six, seven, eight, nine, ten);


        one = new Song("Always in My Head", 3.36);
        two = new Song("Magic", 4.45);
        three = new Song("Ink", 3.48);
        four = new Song("True Love", 4.05);
        five = new Song("Midnight", 4.54);
        six = new Song("Another's Arms", 3.54);
        seven = new Song("Oceans", 5.21);
        eight = new Song("A Sky Full of Stars", 4.28);
        nine = new Song("O", 7.46);

        Album ghostStories = new Album("Ghost Stories","Coldplay");
        ghostStories.addSongs(one, two, three, four, five, six, seven, eight, nine);


        Playlist playlist = new Playlist("Walk");
        playlist.addToPlaylist("Magic", ghostStories);
        playlist.addToPlaylist("Oceans", ghostStories);
        playlist.addToPlaylist(2, parachutes);
        playlist.addToPlaylist(10, parachutes);
        playlist.addToPlaylist(1, parachutes);
        playlist.addToPlaylist(3,parachutes);

        Menu menu = new Menu();
        menu.play(playlist);






    }




}
