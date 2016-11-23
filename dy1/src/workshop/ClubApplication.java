package workshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClubApplication {
	
//	static Person leo;
//	
//	public ClubApplication() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		leo = new Person("lisu","chao","");
//		leo.show();
//	}	
	
	
	public ClubApplication() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) throws BadBookingException, ParseException {
		
//		Person leo = new Person("lisu","chao","");
//		Person leo1 = new Person("leo", "chao");
//		leo1.show();
//		Facility fa = new Facility("Macbook pro","13' 16GB 512GB 2.9hz");
//		fa.show();
//		Facility fa1 =new Facility("Macbook air");
//		fa1.show();
		
		Person p1 = new Person("liu", "chao",null);
		Person p2 = new Person("chen", "ying",null);
		Person p3 = new Person("lee","sa","afsfa");
		
		Club c = new Club();
		Member m1 = c.addMember(p1);
		Member m2 = c.addMember(p2);
		Member m3 = c.addMember(p3);
		
		c.showMembers();
		System.out.println("\n");
		
		c.removeMember(3);
		c.showMembers();
		System.out.println("\n");
		
		Facility f1 = new Facility("Macbook pro","13' 16GB 512GB 2.9hz");
		Facility f2 = new Facility("Macbook pro3","15' 16GB 512GB 5.9hz");
		
		c.addFacility(f1);
		c.addFacility(f2);
		c.showFacilities();
		System.out.println("\n");
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("d-MMM-yyyy H:mm");
		Booking booking=new Booking(m1,f1,dateFormat.parse("23-Nov-2016 16:00"),dateFormat.parse("30-Nov-2016 16:00")); 
		System.out.println(booking);
		
		Booking b1,b2;
		try {
			b1 = new Booking(m1, f1, dateFormat.parse("10-Nov-2016 16:00"),dateFormat.parse("20-Nov-2016 16:00"));
			b2 = new Booking(m2, f1, dateFormat.parse("23-Nov-2016 16:00"),dateFormat.parse("30-Nov-2016 16:00"));
		    b2.overlap(b1);
		    
		    System.out.println(b1);
		    System.out.println(b2);
		} catch (BadBookingException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		
	}

	
}



