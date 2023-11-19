package org.glib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.badlogic.gdx.ApplicationAdapter;

public class GRenderer extends ApplicationAdapter
{
	private List<GTexture> textures;
	private Map<GTexture, Integer> x;
	private Map<GTexture, Integer> y;
	private GSpriteBatch spriteBatch;
	
	public void addTexture(GTexture texture, int x, int y)
	{
		textures.add(texture);
		this.x.put(texture, x);
		this.y.put(texture, y);
	}
	
	public void deleteTexture(GTexture texture)
	{
		textures.remove(textures.indexOf(texture));
		x.remove(texture);
		y.remove(texture);
	}
	
	@Override
	public void create()
	{
		spriteBatch = new GSpriteBatch();
		textures = new ArrayList<GTexture>();
		
		x = new HashMap<GTexture, Integer>();
		y = new HashMap<GTexture, Integer>();
	}

	@Override
	public void render()
	{	
		spriteBatch.draw(textures, x, y);
	}
	
	@Override
	public void dispose()
	{
		spriteBatch.dispose();
		
		for (GTexture texture : textures)
		{			
			texture.dispose();
		}
	}
	
	public void setSpriteBatch(GSpriteBatch spriteBatch)
	{
		this.spriteBatch = spriteBatch;
	}
}
