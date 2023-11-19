package org.glib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class GMusic 
{
	private Music music;
	
	public GMusic(String filepath)
	{
		this.music = Gdx.audio.newMusic(Gdx.files.internal(filepath));
	}
	
	public void play()
	{
		music.play();
	}
	
	public void stop()
	{
		music.stop();
	}
	
	public void dispose()
	{
		music.dispose();
	}
	
	public void setLooping(boolean loop)
	{
		music.setLooping(loop);
	}
	
	public Music getMusic()
	{
		return music;
	}
	
	public void setMusic(Music music)
	{
		this.music = music;
	}
}
