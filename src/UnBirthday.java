import javax.swing.JOptionPane;

public class UnBirthday {

	
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("What Month were you born? (type in the number e.g. '08')");
		String b = JOptionPane.showInputDialog("What day of that month were you born(number)");
		if (a.equals("07") && b.equals("23")) {
			JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy UnBirthday! yay?");
		}
		
	}
}
