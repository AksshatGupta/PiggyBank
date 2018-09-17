
import java.util.Scanner;;

public class PiggyBankScanner {

	public static void main(String[] args) {
		
		System.out.println("Piggy Bank");
		
		int amtPen, amtNic, amtDim, amtQuart;
		
		int amtPen2, amtNic2, amtDim2, amtQuart2;
		
		@SuppressWarnings("resource")
		Scanner bank = new Scanner (System.in);
		
		System.out.println("How many pennies do you have?");
		amtPen = bank.nextInt();
		
		System.out.println("How many nickels do you have?");
		amtNic = bank.nextInt();
		
		System.out.println("How many dimes do you have?");
		amtDim = bank.nextInt();
		
		System.out.println("How many quarters do you have?");
		amtQuart = bank.nextInt();
		
		PiggyBank one = new PiggyBank(amtPen, amtNic, amtDim, amtQuart);
		
		System.out.println(one);
		
		System.out.println("\nHow many pennies do you have?");
		amtPen2 = bank.nextInt();
		
		System.out.println("How many nickels do you have?");
		amtNic2 = bank.nextInt();
		
		System.out.println("How many dimes do you have?");
		amtDim2 = bank.nextInt();
		
		System.out.println("How many quarters do you have?");
		amtQuart2 = bank.nextInt();
		
		PiggyBank two = new PiggyBank(amtPen2, amtNic2, amtDim2, amtQuart2);
		
		System.out.println(two);
		
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
		
		System.out.println("\n" + one);
		System.out.println("\n" + two);
		
	}

}