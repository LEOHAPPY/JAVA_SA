package workshop;

import java.text.SimpleDateFormat;
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

	public Booking(Member m, Facility f, Date startDate, Date endDate) throws BadBookingException{
		super();
		this.m = m;
		this.f = f;
		this.startDate = startDate;
		this.endDate = endDate;
	    		
		String error="";
		if(m==null){
			error="invalid member";
		}
		else if (f==null){
			error="invalid facility";
		}
		else if (startDate==null || endDate==null){
			error="invalid date";
		}
		else if (startDate.after(endDate)||endDate.before(startDate)){
			error="overlap date";
		}
		
		if (error!=""){
			throw new BadBookingException(error);
		}
		
	}

	public Boolean overlap(Booking another){
		Boolean result = false;
		if( this.f.getName() == another.f.getName() && (this.getStartDate().before(another.getEndDate()) 
				|| this.getEndDate().after(another.getStartDate())) ){
			result = true;
						
		}
		
//		System.out.println(result);
		return result;

	}
	
	SimpleDateFormat dateFormat=new SimpleDateFormat("d-MMM-yyyy H:mm");
	public String toString(){
		return this.getM().getFirstName() + this.getF().getName() + dateFormat.format(startDate) + dateFormat.format(endDate);
	}

}
