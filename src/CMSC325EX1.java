import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Iterator;
import java.awt.geom.Line2D;
import javax.swing.JPanel;
import java.awt.geom.GeneralPath;

public class CMSC325EX1 extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Call methods to draw
		Graphics2D g2d = (Graphics2D) g;
		//circle
		g2d.setColor(Color.yellow);
		Ellipse2D head = new Ellipse2D.Double((this.getWidth()-200)/2,(this.getHeight()-200)/2,200,200);
		g2d.fill(head);
		g2d.draw(head);
		//balls for heart eyes
		g2d.setColor(Color.red);
		Ellipse2D eye1 = new Ellipse2D.Double((this.getWidth()-100)/2,(this.getHeight()-125)/2,20,20);
		Ellipse2D eye2 = new Ellipse2D.Double((this.getWidth()+50)/2,(this.getHeight()-125)/2,20,20);
		g2d.fill(eye1);
		g2d.fill(eye2);
		g2d.draw(eye1);
		g2d.draw(eye2);
		
		Ellipse2D eye3 = new Ellipse2D.Double((this.getWidth()-60)/2,(this.getHeight()-125)/2,20,20);
		Ellipse2D eye4 = new Ellipse2D.Double((this.getWidth()+90)/2,(this.getHeight()-125)/2,20,20);
		g2d.fill(eye3);
		g2d.fill(eye4);
		g2d.draw(eye3);
		g2d.draw(eye4);
		
		//triangles for heart eyes
		int x1Points[] = {(this.getWidth()-100)/2, (this.getWidth()-20)/2, (this.getWidth()-60)/2};
		int y1Points[] = {(this.getHeight()-100)/2, (this.getHeight()-100)/2, (this.getHeight()-30)/2};
		int x2Points[] = {(this.getWidth()+50)/2, (this.getWidth()+130)/2, (this.getWidth()+90)/2};
		int y2Points[] = {(this.getHeight()-100)/2, (this.getHeight()-100)/2, (this.getHeight()-30)/2};
		
		GeneralPath triOne = 
		        new GeneralPath(GeneralPath.WIND_EVEN_ODD,
		                        x1Points.length);
		triOne.moveTo(x1Points[0], y1Points[0]);

		for (int index = 1; index < x1Points.length; index++) {
		        triOne.lineTo(x1Points[index], y1Points[index]);
		};
		GeneralPath triTwo = 
		        new GeneralPath(GeneralPath.WIND_EVEN_ODD,
		                        x1Points.length);
		triTwo.moveTo(x2Points[0], y2Points[0]);

		for (int index = 1; index < x1Points.length; index++) {
		        triTwo.lineTo(x2Points[index], y2Points[index]);
		};
		
		triOne.closePath();
		triTwo.closePath();
		
		g2d.draw(triOne);
		g2d.draw(triTwo);
		g2d.fill(triOne);
		g2d.fill(triTwo);
		//mouth
		g2d.setColor(Color.black);
		Arc2D mouth = new Arc2D.Double((this.getWidth()-100)/2,(this.getHeight()-100)/2,100,100,0,-180,Arc2D.OPEN);
		g2d.fill(mouth);
		g2d.draw(mouth);
		//tongue
		g2d.setColor(Color.pink);
		Arc2D tongue = new Arc2D.Double((this.getWidth()-50)/2,(this.getHeight()+50)/2,50,50,0,-180,Arc2D.OPEN);
		g2d.fill(tongue);
		g2d.draw(tongue);
		
		Rectangle2D tongue2 = new Rectangle2D.Double((this.getWidth()-50)/2,(this.getHeight()+20)/2,50,45);
		g2d.fill(tongue2);
		g2d.draw(tongue2);
		
	}

	// Method to draw an Ellipse
	private void drawEllipse(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		Ellipse2D e = new Ellipse2D.Double(5, 10, 80, 130);
		g2d.setColor(Color.red);
		g2d.draw(e);
	}

	// Method to draw a Line
	private void drawLine(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		Line2D myLine = new Line2D.Double(150, 150, 150, 250);
		g2d.setColor(Color.blue);
		g2d.draw(myLine);
	}

	// Method to draw a Circle
	private void drawCircle(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		Ellipse2D myCircle = new Ellipse2D.Double(200, 100, 75, 75);
		g2d.setColor(Color.black);
		g2d.draw(myCircle);
	}

	// Method to draw a Rectangle
	private void drawRect(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		Rectangle2D myRect = new Rectangle2D.Double(300, 30, 50, 50);

		g2d.setColor(Color.blue);
		g2d.draw(myRect);
	}

}