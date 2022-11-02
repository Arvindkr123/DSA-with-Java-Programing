public class Student {
	private String name;
	private int rollno;

	public Student(String name, int rollno) {
		this.name = name;
		if(rollno<=0){
			throw new IllegalArgumentException("Invalid argument");
		}
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		Student student = new Student("Arvind Kumar",1);
		System.out.println(student.name);
		System.out.println(student.rollno);
	}
}