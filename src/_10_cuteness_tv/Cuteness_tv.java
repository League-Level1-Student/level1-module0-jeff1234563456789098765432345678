package _10_cuteness_tv;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv {
	JButton  Lbutton = new JButton();
	JButton  Rbutton = new JButton();
	JButton  Mbutton = new JButton();
public static void main(String[] args) {
	
}
public void actionPerformed(ActionEvent e) {
	
	JButton buttonClicked = (JButton) e.getSource();
	if(buttonClicked.equals(Rbutton)) {
		showDucks();
		
	}
		if(buttonClicked.equals(Lbutton)) {
			showFrog();
			
		}else {
			showFluffyUnicorns();
			}
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
		frame.setTitle("click on any of the button to have a funny video!");
		Mbutton.addActionListener((ActionListener) this);
		Lbutton.addActionListener((ActionListener) this);
		Rbutton.addActionListener((ActionListener) this);
		
		
		
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
