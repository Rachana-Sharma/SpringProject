package com.rs.hotels;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class Service {

	
	@Autowired
	private RoomRepository roomRepo;
	
	@Autowired 
	private CustomerRepository customerRepo;
	
	@Autowired
	private BookingRepository bookingRepo;
	

	public Service()
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
		
		
/*delete booking*/	
	public void cancelBooking(int bId)
	{
			bookingRepo.deleteById(bId);
	}
		
		
	}

