package main.forwardkinematics;

import java.awt.Color;

import com.hk.math.FloatMath;
import com.hk.math.vector.Vector2F;

import main.G2D;

public class Segment
{
	public final Vector2F a, b;
	public final float length;
	public float angle;
	
	public Segment(float x, float y, float length)
	{
		this.a = new Vector2F(x, y);
		this.length = length;
		b = new Vector2F();
		
		update();
	}
	
	public void calculateEnd()
	{
		float dx = length * FloatMath.cos(angle);
		float dy = length * FloatMath.sin(angle);
		b.set(a);
		b.addLocal(dx, dy);
	}
	
	public void update()
	{
		calculateEnd();
	}
	
	public void show(G2D g2d)
	{
		g2d.pushMatrix();
		g2d.enable(G2D.G_CENTER | G2D.G_FILL);
		g2d.rotateR(angle, (a.x + b.x) / 2F, (a.y + b.y) / 2F);
		g2d.setColor(new Color(1F, 1F, 1F, 0.7F));
		g2d.drawRectangle((a.x + b.x) / 2F, (a.y + b.y) / 2F, length * 1.1F, 10);
		g2d.disable(G2D.G_CENTER | G2D.G_FILL);
		g2d.popMatrix();
	}
}
