package workshop;

public class Facility {

	private String name;
	private String description;
	
	
	public Facility(String name) {
		this.name=name;
	}
	
	public Facility(String name,String description) {
		this.name=name;
		this.description=description;
	}

	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void show(){
		if (description ==null){
			System.out.println(name);
		}
		else 
			System.out.print(name +"(" + description +")");
	}
	
}
