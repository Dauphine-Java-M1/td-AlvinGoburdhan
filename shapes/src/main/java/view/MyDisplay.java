package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.Shape;
import Model.World;

public class MyDisplay extends JPanel implements Observer {
	private World w;
	
	
	/*@Override
	protected void paintComponent(Graphics g) {
		g.drawLine(10, 10, 10, 10);
	}
	*/
	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		draw();
		
	}
	
	public MyDisplay() {
		
		for (Shape s : shape ) { 
			s.draw();
		}
	}

	public World getW() {
		return w;
	}

	public void setW(World w) {
		this.w = w;
	}

	
	protected void paintComponent(Graphics g) {
		for(Shape shape : World.getShapeList()) {
			shape.draw(g);
		}
	
	
	
}