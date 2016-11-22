package workshop;

import javax.swing.plaf.synth.SynthStyle;

public class Person {
	protected String surName;
	protected String firstName;
	protected String secondName;
	
	public Person(String surName, String firstName, String secondName)
	{
		this.surName = surName;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	//any shotcut to overloading?
	public Person(String surName, String firstName) 
	{
//		this.surName = surName;
//		this.firstName = firstName;
		this(surName,firstName,null);
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
		System.out.println(this);
		
	}
	
	public String toString(){
		String fullName;
		if(secondName == null)
		{
			fullName = firstName +" "+surName;
		}
		else
			fullName = firstName +" " + secondName + " "+ surName;
		return fullName;
	}
	
	
	
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
	

}


