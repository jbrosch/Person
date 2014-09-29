import java.sql.Date;


public class Staff extends Employee {
	
	private String title;
	
	public Staff(String name, String address, String phone, String email, String office, double salary, MyDate date, String title) {
		super(name, address, phone, email, office, salary, date);
		this.title=title;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " " + this.getName();
	}	

}
