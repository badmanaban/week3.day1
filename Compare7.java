package week3.day1;

public class Compare7 {

	public static void main(String[] args) {
		String str1 = "I am Learning Java";
		String str2 = "I am learning java";
		System.out.print("Using == operator : ");
		if (str1 == str2) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		System.out.print("Using equals : ");
		if (str1.equals(str2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		System.out.print("Using equalsignorecase : ");
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

}
