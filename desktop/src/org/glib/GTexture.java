package org.glib;

import com.badlogic.gdx.graphics.Texture;

public class GTexture 
{
	private Texture texture;
	
	public GTexture(String filepath)
	{
		texture = new Texture(filepath);
	}
	
	public void dispose()
	{
		texture.dispose();
	}
	
	public Texture getTexture()
	{
		return texture;
	}
	
	public void setTexture(Texture texture)
	{
		this.texture = texture;
	}
	
	public void setTexture(String filepath)
	{
		this.texture = new Texture(filepath);
	}
}
