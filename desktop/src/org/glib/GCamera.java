package org.glib;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class GCamera 
{
	private OrthographicCamera camera;
	
	public GCamera(float viewWidth, float viewHeight)
	{
		camera = new OrthographicCamera(viewWidth, viewHeight);
	}
	
	public void lookAt(Vector2 worldCoords)
	{
		camera.lookAt(new Vector3(worldCoords.x, worldCoords.y, 20));
	}
	
	public void rotate(Vector2 rotVec, float angle)
	{
		camera.rotate(new Vector3(rotVec.x, rotVec.y, 0), angle);
	}
	
	public void translate(Vector2 pos)
	{
		camera.translate(pos);
	}
	
	public void update()
	{
		camera.update();
	}
	
	public OrthographicCamera getCamera()
	{
		return camera;
	}
	
	public void setCamera(OrthographicCamera camera)
	{
		this.camera = camera;
	}
}
