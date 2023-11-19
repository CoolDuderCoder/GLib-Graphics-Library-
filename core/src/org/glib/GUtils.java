package org.glib;

import com.badlogic.gdx.utils.ScreenUtils;

public class GUtils 
{
	public static void clearScreen(GColor color)
	{
		ScreenUtils.clear(color.getColor());
	}
}
