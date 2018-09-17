
public class PiggyBank {
	
	final private int PENNY = 1;
	final private int NICKLE = 5;
	final private int DIME = 10;
	final private int QUARTER = 25;
	private int amtPen;
	private int amtNic;
	private int amtDim;
	private int amtQuart;
	
	public PiggyBank(int aP, int aN, int aD, int aQ) {
		
		amtPen = aP;
		amtNic = aN;
		amtDim = aD;
		amtQuart = aQ;
		
	}
	
	public void setAmtPen(int aSP){
		
		amtPen = aSP;
		
	}
	
	public void setAmtNic(int aSP){
		
		amtNic = aSP;
		
	}
	
	public void setAmtDim(int aSP){
		
		amtDim = aSP;
		
	}
	
	public void setAmtQuart(int aSP){
		
		amtQuart = aSP;
		
	}
	
	public int getAmtPen(){
		
		return amtPen;
		
	}
	
	public int getAmtNic(){
		
		return amtNic;
		
	}

	public int getAmtDim(){
	
	return amtDim;
	
	}

	public int getAmtQuart(){
	
	return amtQuart;
	
	}
	
	public double getTotal(){
		
		double total = ((getAmtPen() * PENNY) + (getAmtNic() * NICKLE) + (getAmtDim() * DIME) + (getAmtQuart() * QUARTER));
		
		total = total / 100;
		
		return total;
		
	}
	
	public String toString() {
		
		return ("Pennies: " + getAmtPen() + "\nNickels: " + getAmtNic() + "\nDimes: " + getAmtDim() + "\nQuarters: " + getAmtQuart() + "\nTotal Value: $" + getTotal());
		
	}

}
