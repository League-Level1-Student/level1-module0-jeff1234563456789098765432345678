package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sound_Effects_Machine implements ActionListener {
	
	
	JButton  Lbutton = new JButton();
	JButton  Rbutton = new JButton();
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	     
	}
	

public static void main(String[] args) {
	
Sound_Effects_Machine sound = new Sound_Effects_Machine();
sound.run();
	

	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	
	JButton buttonClicked = (JButton) e.getSource();
	if(buttonClicked.equals(Rbutton)) {
		playSound("bark.wav");
		
	}
		if(buttonClicked.equals(Lbutton)) {
			playSound("saw.wav");
			
		}
		
	}


public void run() {
	Frame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	frame.setVisible(true);
	
	panel.add(Lbutton);
	panel.add(Rbutton);
	frame.setSize(150, 150);
	Lbutton.setText("Sawing Wood");
	Rbutton.setText("Dog Barking");
	Lbutton.addActionListener(this);
	Rbutton.addActionListener(this);
	

	
}


	
}

