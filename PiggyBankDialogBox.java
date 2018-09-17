import javax.swing.JOptionPane;

public class PiggyBankDialogBox {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Piggy Bank");
		
		String amtPenText, amtNicText, amtDimText, amtQuartText;
		int amtPen, amtNic, amtDim, amtQuart;
		
		String amtPenText2, amtNicText2, amtDimText2, amtQuartText2;
		int amtPen2, amtNic2, amtDim2, amtQuart2;
		
		
		amtPenText = JOptionPane.showInputDialog("How many pennies do you have?");
		amtPen = Integer.parseInt(amtPenText);
		
		amtNicText = JOptionPane.showInputDialog("How many nickels do you have?");
		amtNic = Integer.parseInt(amtNicText);
		
		amtDimText = JOptionPane.showInputDialog("How many dimes do you have?");
		amtDim = Integer.parseInt(amtDimText);
		
		amtQuartText = JOptionPane.showInputDialog("How many quarters do you have?");
		amtQuart = Integer.parseInt(amtQuartText);
		
		PiggyBank one = new PiggyBank(amtPen, amtNic, amtDim, amtQuart);
		
		JOptionPane.showMessageDialog(null, one);
		
		amtPenText2 = JOptionPane.showInputDialog("How many pennies do you have?");
		amtPen2 = Integer.parseInt(amtPenText2);
		
		amtNicText2 = JOptionPane.showInputDialog("How many nickels do you have?");
		amtNic2 = Integer.parseInt(amtNicText2);
		
		amtDimText2 = JOptionPane.showInputDialog("How many dimes do you have?");
		amtDim2 = Integer.parseInt(amtDimText2);
		
		amtQuartText2 = JOptionPane.showInputDialog("How many quarters do you have?");
		amtQuart2 = Integer.parseInt(amtQuartText2);
		
		PiggyBank two = new PiggyBank(amtPen2, amtNic2, amtDim2, amtQuart2);
		
		JOptionPane.showMessageDialog(null, two);
		
		amtPen = amtPen + amtPen2;
		amtPen2 = amtPen2 - amtPen2;
		
		amtNic = amtNic + amtNic2;
		amtNic2 = amtNic2 - amtNic2;
		
		amtDim = amtDim + amtDim2;
		amtDim2 = amtDim2 - amtDim2;
		
		amtQuart = amtQuart + amtQuart2;
		amtQuart2 = amtQuart2 - amtQuart2;
		
		one.setAmtPen(amtPen);
		two.setAmtPen(amtPen2);
		
		one.setAmtNic(amtNic);
		two.setAmtNic(amtNic2);
		
		one.setAmtDim(amtDim);
		two.setAmtDim(amtDim2);
		
		one.setAmtQuart(amtQuart);
		two.setAmtQuart(amtQuart2);
		
		JOptionPane.showMessageDialog(null, one);
		JOptionPane.showMessageDialog(null, two);
		
	}

}