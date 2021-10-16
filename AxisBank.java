package week3.day1;

public class AxisBank extends BankInfo  {
	@Override
	public void deposit() {
		System.out.println("Deposit from child");
	}
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
	}
}
