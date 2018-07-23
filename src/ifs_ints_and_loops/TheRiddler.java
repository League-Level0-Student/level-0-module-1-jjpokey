package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String a = JOptionPane.showInputDialog("If you drop a yellow hat in the Red Sea, what does it become?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (a.equals("wet")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	JOptionPane.showMessageDialog(null, "+1 Points!");
	score += 1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong! The answer is wet!");
}
//next question
String b = JOptionPane.showInputDialog("It looks green, it opens red. What you eat is red, but what you spit out is black. What is it?");

if (b.equals("watermelon")) {
JOptionPane.showMessageDialog(null, "Correct!");
JOptionPane.showMessageDialog(null, "+1 Points!");
score += 1;
}
else {
JOptionPane.showMessageDialog(null, "Wrong! The answer is watermelon!");
}
JOptionPane.showMessageDialog(null, "Your final score is " + score);
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

