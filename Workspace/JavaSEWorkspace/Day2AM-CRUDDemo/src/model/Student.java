package model;

import java.util.Date;

public class Student implements Comparable<Student> {

	private String name;
	private String matricNumber;
	private Date dob;
	private String nickName;
	private double fee;

	public Student(String name, String matricNumber, Date dob, String nickName, double fee) {
		super();
		this.name = name;
		this.matricNumber = matricNumber;
		this.dob = dob;
		this.nickName = nickName;
		this.fee = fee;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMatricNumber() {
		return matricNumber;
	}

	public void setMatricNumber(String matricNumber) {
		this.matricNumber = matricNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", matricNumber=" + matricNumber + ", dob=" + dob + ", nickName=" + nickName
				+ ", fee=" + fee + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricNumber == null) ? 0 : matricNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (matricNumber == null) {
			if (other.matricNumber != null)
				return false;
		} else if (!matricNumber.equals(other.matricNumber))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.fee == o.getFee())
			//this.name.compareTo(o.getName()))
			return 0;
		else {
			if (this.fee < o.getFee())
				return -1;
			else
				return +1;
		}
	}

}
