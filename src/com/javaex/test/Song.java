package com.javaex.test;
	// Shop 클래스와 연동
public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getTrack() {
		return track;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.println(artist + ", " + title + " (" + album + ", " + year + ", " + track + "번, " + composer + " 작곡)");
	}
	
	public void showInfo(String title, String artist) {
		String message = String.format("%s, %s (%s, %d, %d번, %s 작곡) ",artist, title, album, year, track, composer); 
		System.out.println(message);
	}
	
	
}
