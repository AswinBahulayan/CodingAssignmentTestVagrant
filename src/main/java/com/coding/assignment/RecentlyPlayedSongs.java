package com.coding.assignment;

import java.util.*;


/*
 * 1.Declare variables
 *      int capacity
 *      Map<String,LinkedList<String>> to store list of songs and user as key
 * 2.The method play has two parameters user and song
 * 3.if the user does not exist in the map then insert the user as key with value as a new LinkedList
 * 4.Then get the LinkedList mapped to the user and insert the song to the tail of the LinkedList
 * 5.if song already exist then remove it from the list
 * 6.continue the same until LinkedList size is less than the capacity
 * 7.create a method to return List for a specific user.
 * 8.if no user exists then return an empty list.*/
/**
 * @author Aswin Bahulayan
 * Date 07-11-2023
 * playSong(String,String) -> add songs to a specific user
 * getPlayedSong(String) -> return the songs played by a user*/
public class RecentlyPlayedSongs {
    private int capacity=0;
    private Map<String, LinkedList<String>> userSongs=null;
    public RecentlyPlayedSongs(int capacity) {
        this.capacity = capacity;
        this.userSongs = new HashMap<>();
    }

    /**
    * @author Aswin Bahulayan
     * Date 07-11-2023*/
    public void playSong(String user, String song) {
        if (!userSongs.containsKey(user)) {
            userSongs.put(user, new LinkedList<>());
        }
        LinkedList<String> playlist = userSongs.get(user);
        playlist.remove(song);
        playlist.addLast(song);
        if (playlist.size() > capacity) {
            playlist.removeFirst();
        }
    }

    /**
     * @author Aswin Bahulayan
     * Date 07-11-2023*/
    public List<String> getPlayedSongs(String user) {
        if (userSongs.containsKey(user)) {
            return userSongs.get(user);
        } else {
            return new ArrayList<>();
        }
    }
}