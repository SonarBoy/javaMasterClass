package com.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album() {
		
	}
	 
	public Album(String n, String a) {
		this.name = n; 
		this.artist = a; 
		this.songs = new ArrayList<Song>();
	}

	private Song findSong(String title) {
		
		
		for(Song songToFind: songs) {
			if(songToFind.getTitle().equals(title)) {
				return songToFind;
			}
		}
		
		return null;
	}
	
	public boolean addSong(String title, double duration) {
		
		if(findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}else {
			System.out.println("Couldnt add Song.");
			return false;
		}
		
	}
	
	public boolean addToPlayList(String title, LinkedList playlist) {
		
		Song x = findSong(title);
		
		if(x == null) {
			System.out.println("Song was not found in the album.");
			return false;
		}
		
		ListIterator<Song> songIterator = playlist.listIterator();
		
		while(songIterator.hasNext()) {
			
			if(songIterator.next().getTitle().equals(x.getTitle())){
				
				System.out.println("Song was already in the playlist.");
				return false;
				
			}
			
		}
		
		playlist.add(x);
		return true;
		
		
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList playlist) {
		
		if(trackNumber > songs.size() || (trackNumber - 1) >= songs.size()) {
			System.out.println("Song was not in the album.");
			return false;
		}
		
		Song x;
		if(trackNumber - 1 < 0) {
			x = songs.get(trackNumber);
		}else {
			x = songs.get(trackNumber - 1);
		}
		
		
		ListIterator<Song> songIterator = playlist.listIterator();
		
		while(songIterator.hasNext()) {
			if(songIterator.next().getTitle().equals(x.getTitle())) {
				System.out.println("Song was already in the playlist.");
				return false;
			}
		}
		
		playlist.add(x);
		return true;
	}
	
}