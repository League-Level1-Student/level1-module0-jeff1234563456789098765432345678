package _10_cuteness_tv;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv {
	JButton  Lbutton = new JButton();
	JButton  Rbutton = new JButton();
	JButton  Mbutton = new JButton();
public static void main(String[] args) {
	
}
	public void run() {
		Frame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		panel.add(Mbutton);
		panel.add(Lbutton);
		panel.add(Rbutton);
		frame.setSize(150, 150);
		
		
		
	}

}
