package workshop;

import java.util.Date;

public class Booking {
	private Member m;
	private Facility f;
	private Date startDate;
	private Date endDate;

	public Member getM() {
		return m;
	}

	public Facility getF() {
		return f;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Booking(Member m, Facility f, Date startDate, Date endDate) {
		super();
		this.m = m;
		this.f = f;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Boolean overlap(Booking another){
		Boolean result = false;
		if( this.f.getName() == another.f.getName() && (this.getStartDate().before(another.getEndDate()) 
				|| this.getEndDate().after(another.getStartDate())) ){
			result = true;
						
		}
		
		System.out.println(result);
		return result;

	}
	
	public String toString(){
		return this.getM().getFirstName() + this.getF().getName() + this.startDate.toString() + this.endDate.toString();
	}

}
