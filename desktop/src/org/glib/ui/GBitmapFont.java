package org.glib.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class GBitmapFont 
{
	private BitmapFont bitmapFont;
	
	public GBitmapFont(String filepath)
	{
		bitmapFont = new BitmapFont(Gdx.files.internal(filepath));
	}
	
	public BitmapFont getBitmapFont()
	{
		return bitmapFont;
	}
	
	public void setBitmapFont(BitmapFont bitmapFont)
	{
		this.bitmapFont = bitmapFont;
	}
}
