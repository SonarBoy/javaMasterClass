package com.Arrays;

public class Song {
	private String title;
	private double duration;
	
	public Song(String t, double d) {
		this.title = t;
		this.duration = d;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	@Override
	public String toString() {
		return  this.title + ": " + this.duration;
	}
}
