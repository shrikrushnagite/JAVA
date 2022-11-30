package com.jspiders.musicplayer.song;

public class Song {
     int id;
     String songName;
     String singerName;
     String movieName;
     String composer;
     String Lyricist;
      Double duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getComposer() {
		
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getLyricist() {
		return Lyricist;
	}
	public void setLyricist(String lyricist) {
		Lyricist = lyricist;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", singerName=" + singerName + ", movieName=" + movieName
				+ ", composer=" + composer + ", Lyricist=" + Lyricist + ", duration=" + duration + "]";
	}
	
}
