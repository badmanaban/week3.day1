package week3.day1;

public class Desktop extends Computer {

	private void desktopSize() {
		System.out.println("This is desktopSize");
	}

	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}

}
