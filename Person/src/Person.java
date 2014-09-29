
public class Person {
	
	private String name, address, phone, email;
	
	public Person(String name, String address, String phone, String email){
		this.setName(name);
		this.address = address;
		this.phone = phone;
		this.email= email;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " " + this.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

}
