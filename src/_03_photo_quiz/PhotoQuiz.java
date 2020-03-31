package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String image = "https://thumbs-prod.si-cdn.com/rtkp3HcECC3xlPiOGvSnR1M5Rag=/fit-in/1600x0/filters:focal(1471x1061:1472x1062)/https://public-media.si-cdn.com/filer/b6/30/b630b48b-7344-4661-9264-186b70531bdc/istock-478831658.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component imageHolder = null;
		// 3. use the "createImage()" method below to initialize your Component
		imageHolder=createImage(image);
		// 4. add the image to the quiz window
			quizWindow.add(imageHolder);
		// 5. call the pack() method on the quiz window
				quizWindow.pack(); 
		// 6. ask a question that relates to the image
				String a = JOptionPane.showInputDialog("Where in India is this wonder of the world");
		// 7. print "CORRECT" if the user gave the right answer
				if(a.contentEquals("Agra")) {
					System.out.println("CORRECT");
				
		// 8. print "INCORRECT" if the answer is wrong
				}else {
					System.out.println("INCORRECT");
				}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
				quizWindow.remove(imageHolder);
		// 10. find another image and create it (might take more than one line
		// of code)
				String secondImage = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/IN-GJ.svg/250px-IN-GJ.svg.png";	
				Component secondImageHolder = null;
				secondImageHolder=createImage(secondImage);
				// 11. add the second image to the quiz window
				quizWindow.add(secondImageHolder);

		// 12. pack the quiz window
				quizWindow.pack();

		// 13. ask another question
				String b = JOptionPane.showInputDialog("What state in India is this");
		// 14+ check answer, say if correct or incorrect, etc.
				if(b.contentEquals("Gujrat")) {
					System.out.println("CORRECT");
				}else {
					System.out.println("INCORRECT");
				}

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
