package org.glib;

public class DesktopLauncher 
{

	public static void main(String[] args) {
		GRenderer renderer = new GRenderer();
		
		renderer.addTexture(new GTexture("badlogic.png"), 0, 0);
		
		GWindow window = new GWindow(renderer, "Game", 100, 100);
	}

}
