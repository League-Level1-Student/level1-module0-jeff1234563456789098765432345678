package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageProducer;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jack_In_The_Box implements ActionListener {
	JButton button = new JButton();
	int score = 0;
	public  Jack_In_The_Box() { 
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setTitle("Surprise");
		frame.setVisible(true);
		
		button.addActionListener(this);
		frame.add(button);
		button.setText("Surprise!");
		frame.pack();
		
		
		
	}
	private void playSound(String soundFile) { 
	    try {
	        AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	        sound.play();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
public static void main(String[] args) {
	
	
	 
	 }

private void showPicture(String fileName) {
    try {
        JLabel imageLabel = createLabelImage(fileName);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(imageLabel);
        frame.setVisible(true);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private JLabel createLabelImage(String fileName) {
	try {
            URL imageURL = getClass().getResource(fileName);
            if (imageURL == null) {
	       System.err.println("Could not find image " + fileName);
	       return new JLabel();
            } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
            }
        } catch (Exception e) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
} 
@Override
public void actionPerformed(ActionEvent e) {
	score++;
	if(score==5) {
	
			showPicture("jackInTheBox.png");
		playSound("homer-woohoo.wav"); 
	}
	
}

public void run() {
	// TODO Auto-generated method stub
	
}
}

