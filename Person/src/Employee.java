import java.sql.Date;


public class Employee extends Person{
	
	private String office;
	private double salary;
	private MyDate date;

	public Employee(String name, String address, String phone, String email,String office, double salary, MyDate date) {
		super(name, address, phone, email);
		this.salary=salary;
		this.office=office;
		this.date=date;

	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " " + this.getName();
	}	



}
