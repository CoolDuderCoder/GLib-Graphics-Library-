package org.glib;

import com.badlogic.gdx.graphics.Color;

public class GColor 
{
	private Color color;
	
	public GColor(float r, float g, float b, float a)
	{
		this.color = new Color(r, g, b, a);
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public void setColor(float r, float g, float b, float a)
	{
		this.color = new GColor(r, g, b, a).getColor();
	}
}
