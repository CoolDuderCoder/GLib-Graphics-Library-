package org.glib.ui;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class GTextureAtlas 
{
	private TextureAtlas textureAtlas;
	
	public GTextureAtlas(String filepath)
	{
		textureAtlas = new TextureAtlas(filepath);
	}
	
	public TextureAtlas getTextureAtlas()
	{
		return textureAtlas;
	}
	
	public void setTextureAtlas(TextureAtlas textureAtlas)
	{
		this.textureAtlas = textureAtlas;
	}
}
