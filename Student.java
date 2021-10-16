package week3.day1;

public class Student  extends Department{
	public void studentName() {
System.out.println("StudentName");
	}
	public void studentDept() {
System.out.println("StudentDept");
	}
	public void studentId() {
System.out.println("StudentId");
	}
	public static void main(String[] args) {
		
		Department d =new Department();
		d.collegeName();
		d.collegeCode();
		d.collegeRank();
		Student s = new Student();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
		
	}
}
