package org.glib.ui;

import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

public class GTextButton 
{
	private TextButton button;
	
	public GTextButton(String buttonText)
	{
		button = new TextButton(buttonText, new TextButtonStyle());
	}
	
	public TextButton getButton()
	{
		return button;
	}
	
	public void setButton(TextButton button)
	{
		this.button = button;
	}
}
