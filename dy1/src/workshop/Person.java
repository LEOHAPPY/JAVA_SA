package workshop;

public class Person {
	private String surName;
	private String firstName;
	private String secondName;
	
	public Person(String surName, String firstName, String secondName)
	{
		this.surName = surName;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public String getSurName()
	{	
		return surName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getSecondName()
	{
		return secondName;
	}
	
	public void show()
	{
		if(secondName == null)
		{
			System.out.println(firstName +" "+surName);
		}
		else
			System.out.println(firstName +" " + secondName + " "+ surName);
	
		
	}
	
	
	
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
	

}


