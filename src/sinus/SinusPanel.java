package sinus;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Dies ist die Zeichenklasse des Projekts Sinus, welche den Graphen graphisch darstellt.
 * 
 * @author Lukas Schramm
 * @version 1.0
 *
 */
public class SinusPanel extends JPanel {
	
	/**Intervall zum Zeichnen*/
	private int[] intervall = {-360,360};
	/**Menge an x-Positionen*/
	private int[] x = new int[Math.abs(intervall[0])+Math.abs(intervall[1])];
	/**Menge an y-Positionen*/
	private int[] y = new int[Math.abs(intervall[0])+Math.abs(intervall[1])];
	
	public SinusPanel() {
		calculatePoints();
		repaint();
	}
	
	/**
	 * Diese Methode berechnet die Positionen der Punkte auf dem Graphen.
	 */
	private void calculatePoints() {
		for(int i=0;i<x.length;i++) {
			y[i] = 100-(int)Math.round(Math.sin(Math.toRadians(i))*100);
			x[i] = i;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(Math.abs(intervall[0]), 0, Math.abs(intervall[0]), 200);
		g.drawLine(0, 100, x.length, 100);
		g.drawPolyline(x, y, x.length);
	}
}