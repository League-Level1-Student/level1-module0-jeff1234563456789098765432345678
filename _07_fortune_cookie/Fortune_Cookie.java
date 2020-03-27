package _07_fortune_cookie;

import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie {
	  
	        public void showButton() { 
	            System.out.println("Button clicked ");
	            JFrame frame = new JFrame();
	            frame.setVisible(true);   
	            JButton button = new JButton();
	            frame.add(button);
	            frame.pack();
	            button.addActionListener((ActionListener) this);
	            actionPerformed();
	            int rand = new Random().nextInt(5);
	            if(rand == 1) {
	            	JOptionPane.showMessageDialog(null, "You will find a nickel on the ground the following days....");
	            }
	            if(rand == 2) {
	            	JOptionPane.showMessageDialog(null, "You will become a lucky person in the following days");}
	        
	        if(rand ==3) {
	        JOptionPane.showMessageDialog(null, "Some guy on the street will want to marry you");
	        }else {
	        	JOptionPane.showMessageDialog(null, "You will find a homless man in downtown L.A");
	        }
	        }
	        

			private void actionPerformed() {
				
				JOptionPane.showMessageDialog(null, "Woohoo!");
			}
}
	    

