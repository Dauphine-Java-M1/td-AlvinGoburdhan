package view;

import java.awt.Graphics;

import Model.Line;
import Model.Circle;
import Model.Point;

public class DrawableLine implements Drawable {

	Line bl;

	public DrawableLine(Line bl) {
		this.bl = bl;
	}
	
	@Override
	public void draw(Graphics g) {
		if(bl.nbPoints()==0) {
			return;
		}
		for(int i=0; i+1<bl.nbPoints(); i++) {
			g.drawLine(bl.getPointList().get(i).getX(), bl.getPointList().get(i).getY(), bl.getPointList().get(i+1).getX(), bl.getPointList().get(i+1).getY());
		}
		
	}
}


