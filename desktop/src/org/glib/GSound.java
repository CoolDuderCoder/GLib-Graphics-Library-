package org.glib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class GSound 
{
	private Sound sound;
	
	public GSound(String filepath)
	{
		sound = Gdx.audio.newSound(Gdx.files.internal(filepath));
	}
	
	public void play()
	{
		sound.play();
	}
	
	public void stop()
	{
		sound.stop();
	}
	
	public void dispose()
	{
		sound.dispose();
	}
	
	public Sound getSound()
	{
		return sound;
	}
	
	public void setSound(Sound sound)
	{
		this.sound = sound;
	}
}
