=====package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		
	
	// 2. ask the user for a sentence
	String sentence = JOptionPane.showInputDialog("give me a sentence");
   speak(sentence);
	
	// 4. repeat steps 2 and 3 a lot of times
for (int i = 0; i < args.length; i++) {
	
}
   
   
	}

	
	
   
   
   
   
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
