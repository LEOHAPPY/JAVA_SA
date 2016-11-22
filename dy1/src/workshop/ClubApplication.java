package workshop;

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

	public static void main(String[] args) {
		
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
		
		Booking b1 = new Booking(m1, f1, new Date(2016,11,12), new Date(2016,11,20));
		Booking b2 = new Booking(m2, f1, new Date(2016,11,19), new Date(2016,12,1));
		
	    b2.overlap(b1);
	    
	    System.out.println(b1);
	    System.out.println(b2);
		
	}

	
}



