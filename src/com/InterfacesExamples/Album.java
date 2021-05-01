package com.InterfacesExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
	
	private String name;
	private String artist;
	private SongList songs;
	
	public Album() {
		
	}
	
	public Album(String n, String a) {
		this.name = n;
		this.artist = a;
		this.songs = new SongList();
	}


	
	public boolean addSong(String title, double duration) {
		
		return	this.songs.add(new Song(title, duration));
		
	}
	
	public boolean addToPlayList(String title, LinkedList playlist) {
		
		Song x = this.songs.findSong(title);
		
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
		
//		if(trackNumber > this.songs.size() || (trackNumber - 1) >= songs.size()) {
//			System.out.println("Song was not in the album.");
//			return false;
//		}
//		
//		Song x;
//		if(trackNumber - 1 < 0) {
//			x = this.songs.findSong(trackNumber);
//		}else {
//			x = this.songs.findSong(trackNumber - 1);
//		}
		
		
		Song x = this.songs.findSong(trackNumber);
		
		if(x == null) {
			System.out.println("Song was not found in the album.");
			return false;
		}
		
//		ListIterator<Song> songIterator = playlist.listIterator();
//		
//		while(songIterator.hasNext()) {
//			if(songIterator.next().getTitle().equals(x.getTitle())) {
//				System.out.println("Song was already in the playlist.");
//				return false;
//			}
//		}
		
		playlist.add(x);
		return true;
	}
	
	public class SongList{
		private ArrayList<Song> songs;
		
		public SongList() {
			this.songs = new ArrayList<Song>();
		}
		
		public boolean add(Song song) {
			if(songs.contains(song)) {
				return false;
			}
			
			this.songs.add(song);
			return true;
		}
	
		private Song findSong(String title) {
			for(Song checkedSong: this.songs) {
				if(checkedSong.getTitle().equals(title)) {
					return checkedSong;
				}
			}
			
			return null;
		}
		
		public Song findSong(int trackNumber) {
			int index = trackNumber - 1;
			
			if((index >= 0) && (index < songs.size())) {
				return songs.get(index);
			}
			
			return null;
		}
		
	}
		
}