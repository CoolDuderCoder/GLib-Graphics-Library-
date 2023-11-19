package org.glib;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class GWindow
{
	private static final int FOREGROUND_FPS = 60;
	
	private GRenderer renderer;
	
	private String title;
	private int width;
	private int height;
	
	public GWindow(GRenderer renderer, String title, int width, int height)
	{
		this.renderer = renderer;
		this.title = title;
		this.width = width;
		this.height = height;
		
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle(title);
		config.setForegroundFPS(FOREGROUND_FPS);
		
		Lwjgl3Application app3 = new Lwjgl3Application(renderer, config);
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
}