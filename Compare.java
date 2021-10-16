package week3.day1;

public class Compare {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		if (str3 == str4) {
			System.out.println(" Same text");
		} else
			System.out.println("Diff text");

		System.out.println("***");
	}

}
/*You should not use == (equality operator) to compare these strings because they compare the reference of the string,
i.e. whether they are the same object or not. On the other hand, equals() method compares whether the value of the 
strings is equal, and not the object itself.*/