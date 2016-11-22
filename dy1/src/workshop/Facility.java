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
		System.out.println(this);
	}
	
	public String toString(){
		String output = "";
		if (description ==null){
			output = name;
		}
		else 
			output = name +"(" + description +")";
		return output;
	}
	
}
