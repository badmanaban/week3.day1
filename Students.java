package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println(id);
		System.out.println(name);
	}

	public void getStudentInfo(String emailId, long phoneNumber) {
		System.out.println(phoneNumber);
		System.out.println(emailId);
	}
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(8);
		obj.getStudentInfo(8, "Bathu");
		obj.getStudentInfo("jdbathu@pec.edu", 9751093613l);
		
	}
}
