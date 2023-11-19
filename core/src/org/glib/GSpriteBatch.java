package org.glib;

import java.util.List;

import java.util.Map;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GSpriteBatch
{
	private SpriteBatch spriteBatch;
	
	public GSpriteBatch()
	{
		spriteBatch = new SpriteBatch();
	}
	
	public void dispose()
	{
		spriteBatch.dispose();
	}
	
	public void draw(List<GTexture> textures, Map<GTexture, Integer> x, Map<GTexture, Integer> y)
	{
		spriteBatch.begin();
		for (GTexture texture : textures)
		{
			spriteBatch.draw(texture.getTexture(), x.get(texture), y.get(texture));
		}
		spriteBatch.end();
	}
	
	public SpriteBatch getTexture()
	{
		return spriteBatch;
	}
	
	public void setTexture(SpriteBatch spriteBatch)
	{
		this.spriteBatch = spriteBatch;
	}
}
