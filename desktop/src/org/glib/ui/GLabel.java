package org.glib.ui;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public class GLabel 
{
	private Label label;
	
	public GLabel(String labelText)
	{
		label = new Label(labelText, new LabelStyle());
	}
	
	public Label getLabel()
	{
		return label;
	}
	
	public void setLabel(Label label)
	{
		this.label = label;
	}
}
