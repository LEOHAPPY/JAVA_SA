package workshop;

public class Member extends Person {

	private int memberNumber;

	public Member(String surName, String firstName, String secondName, int memberNumber) {
		super(surName, firstName, secondName);
		this.memberNumber = memberNumber;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public String toString(){
		String fullName;
		if(secondName == null)
		{
			fullName = memberNumber + "--" + firstName +" "+surName;
		}
		else
			fullName = memberNumber + "--" + firstName +" " + secondName + " "+ surName;
		return fullName;
	}
}