package sinus;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**
 * Dies ist die Hauptklasse des Sinusprogramms, welche das Programmfenster oeffnet.
 * 
 * @author Lukas Schramm
 * @version 1.0
 *
 */
public class Sinus {
	
	/**Programmfenster*/
	private JFrame frame1 = new JFrame("Sinus");
	
	public Sinus() {
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setPreferredSize(new Dimension(720,225));
		frame1.setResizable(false);
		Container cp = frame1.getContentPane();
		cp.setLayout(new GridLayout());
		cp.add(new SinusPanel());
		
		frame1.pack();
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Sinus();
	}
}