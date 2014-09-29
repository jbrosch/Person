import java.sql.Date;


public class Faculty extends Employee{
	
	private String officeHours;
	private String rank;

	public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate date,String officeHours, String rank) {
		super(name, address, phone, email, office, salary, date);
		this.officeHours=officeHours;
		this.rank=rank;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " " + this.getName();
	}	

}
