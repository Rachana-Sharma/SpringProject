package com.rs.hotels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HotelService {

	
	@Autowired
	private RoomRepository roomRepo;
	
	@Autowired 
	private CustomerRepository customerRepo;
	
	@Autowired
	private BookingRepository bookingRepo;
	

	public HotelService()
	{
		
	}
	
		
/* to save and check customer details*/	
	public Customer saveCustDetails(Customer cust)
	{
			
			Customer savedDetails=customerRepo.save(cust);
			return savedDetails;
	}
		
	
/*to create booking*/
	public Room createBooking(String available)
	{
		 return roomRepo.findAll(available); 
	}
		
/*calculate bill*/
	public double billing(int bId, double roomPrice,String breakfast,double totalCharge) {
		Booking booking=new Booking();
		Room room=new Room();
		String a="yes";
		String b="no";
		double breakfastCharge=1000;
		double bill=0.0;
		
		if(booking.getBreakfast().equals(a))
		{
			bill=room.getRoomPrice()+breakfastCharge;
		}
		else if(booking.getBreakfast().equals(b))
		{
			bill=room.getRoomPrice();
		}
		booking.setTotalCharge(bill);
		return totalCharge;
	}
		
/*delete booking*/	
	public void cancelBooking(int bId)
	{
			bookingRepo.deleteById(bId);
	}
		
		
	}

