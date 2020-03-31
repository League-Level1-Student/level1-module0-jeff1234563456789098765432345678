package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener{ 
	  
	        public void showButton() { 
	            System.out.println("Button clicked");
	            JFrame frame = new JFrame();
	            frame.setVisible(true);   
	            JButton button = new JButton();
	            frame.add(button);
	            button.addActionListener((ActionListener) this);
	            frame.pack(); 
	              
	        }
	        
	        

			private void actionPerformed() {
				
				
			}


			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Woohoo!");
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
}
	    

