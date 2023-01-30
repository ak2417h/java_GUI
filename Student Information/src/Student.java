
public class Student {
	public String studentInfo,firstname,lastname,gradelevel;
	private int grade;
	
	public Student(String id,String first,String last,int grade,String gradelvl) {
		studentInfo = id;
		firstname = first;
		lastname = last;
		gradelevel = gradelvl;
		this.grade= grade; 
	}
	
	public String getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(String studentInfo) {
		this.studentInfo = studentInfo;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGradelevel() {
		return gradelevel;
	}
	public void setGradelevel(String gradelevel) {
		this.gradelevel = gradelevel;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String toString() {
		return studentInfo + " " + firstname + " " + lastname + " " + gradelevel + " " + grade;
	}
	
}
