package com.coding.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RecentlyPlayedSongsTest {
    @Test
    public void test(){
        RecentlyPlayedSongs songs=new RecentlyPlayedSongs(3);
        songs.playSong("user1","S1");
        songs.playSong("user1","S2");
        songs.playSong("user1","S3");
        songs.playSong("user1","S4");
        Assert.assertEquals(Arrays.asList("S2", "S3", "S4"),songs.getPlayedSongs("user1"));
    }

    @Test
    public void test1(){
        RecentlyPlayedSongs songs=new RecentlyPlayedSongs(3);
        songs.playSong("user1","S1");
        songs.playSong("user1","S2");
        songs.playSong("user1","S3");
        songs.playSong("user1","S4");
        songs.playSong("user1","S3");
        songs.playSong("user2","S3");
        songs.playSong("user2","S4");
        songs.playSong("user2","S5");
        songs.playSong("user2","S3");
        songs.playSong("user2","S6");
        Assert.assertEquals(Arrays.asList("S2","S4","S3"),songs.getPlayedSongs("user1"));
        Assert.assertEquals(Arrays.asList("S5","S3","S6"),songs.getPlayedSongs("user2"));
    }

    @Test
    public void test2(){
        RecentlyPlayedSongs songs=new RecentlyPlayedSongs(4);
        songs.playSong("user1","S1");
        songs.playSong("user1","S2");
        songs.playSong("user1","S3");
        songs.playSong("user1","S4");
        songs.playSong("user1","S3");
        songs.playSong("user1","S5");
        songs.playSong("user1","S6");
        songs.playSong("user1","S4");
        Assert.assertEquals(Arrays.asList("S3","S5","S6","S4"),songs.getPlayedSongs("user1"));
    }
}
