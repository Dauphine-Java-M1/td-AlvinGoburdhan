package view;

import java.awt.Graphics;

import Model.Circle;

public class DrawableCircle implements Drawable {
	
	private final Circle c;
	
	public DrawableCircle(Circle c) {
		this.c = c;
	}

	public void draw(Graphics g) {
		int radius = (int) c.getRayon();
		g.drawOval(c.getCentre().getX()-radius/2, c.getCentre().getY()-radius/2, radius, radius);}

}


}