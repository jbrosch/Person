
public class Student extends Person{
	
	final private String class_year;
	
	public Student(String name, String address, String phone, String email, String class_year) {
		super(name, address, phone, email);
		this.class_year=class_year;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " " + this.getName();
	}	

}
