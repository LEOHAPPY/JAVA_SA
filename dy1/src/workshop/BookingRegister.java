package workshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class BookingRegister {

	private HashMap<Facility,ArrayList<Booking>> register =
			new HashMap<Facility,ArrayList<Booking>>();
	
	public BookingRegister() {
		
	}
	
	public void addBooking(Member m,Facility f,Date startDate,Date endDate){
		try {
			Booking b=new Booking(m, f, startDate, endDate);
			ArrayList<Booking> bookingList =register.get(f);
			if (bookingList==null){
					bookingList=new ArrayList<Booking>();
					register.put(f, bookingList);
			}
			for (Booking booking : bookingList) {
				if(booking.overlap(b)){
					throw new BadBookingException("overlap booking.");
				}
			}
			register.put(f, bookingList);
		} catch (BadBookingException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<Booking> getBookings(Facility f,Date startDate,Date endDate){
		//retrieve from hashmap
		ArrayList<Booking> bookList = register.get(f);
		
		//wanna specified bookList
		//so start with an empty list:
		ArrayList<Booking> selected=new ArrayList<Booking>();
		
		//create a Iterator from the booklist retrieved from hashmap
		Iterator<Booking> bookIterator = bookList.iterator();
		
		//a loop to use conditions
		while(bookIterator.hasNext()){
			Booking b = bookIterator.next();
			if(b.getStartDate().before(endDate) && b.getEndDate().after(startDate) ){
				//if qualified add to the blank list
				selected.add(b);
			}
		}
		
		//return what you want to get from the Hashmap
		return selected;
	}
	
	// how to remove the booking from hashMap!!!!
	public ArrayList<Booking> removeBooking(Booking b){
		ArrayList<Booking> currentBookList = new ArrayList<Booking>();
		currentBookList = register.get(b.getF());
		
		if (currentBookList != null){
			currentBookList.remove(b);
		}
		return currentBookList;
	}
}
