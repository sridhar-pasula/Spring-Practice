package spring_ioc_container.constructor_injection;

public class Student {

	private String name;
	private String gender;
	private String college;
	private double percentage;
	public Student(String name, String gender, String college, double percentage) {
		super();
		this.name = name;
		this.gender = gender;
		this.college = college;
		this.percentage = percentage;
	}
	
	public void studentDetails() {
		System.out.println(name);
		System.out.println(gender);
		System.out.println(college);
		System.out.println(percentage);
	}
	
	
	
}
