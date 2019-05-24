package com.example.cardview;

public class Album {
    String Name;
    int NumOfSongs;
    int thumbnail;

   public Album(){

    }

    public Album(String name, int numOfSongs, int thumbnail) {
        Name = name;
        NumOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumOfSongs() {
        return NumOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        NumOfSongs = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
