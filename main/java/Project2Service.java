

//import java.time.temporal.ChronoUnit.DAYS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Project2Service {

	@Autowired
	private RoomRepository roomRepo;

	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private BookingRepository bookingRepo;

	public Project2Service() {

	}

	
	/**   	to save and check customer details 

	 * @param cust
	 * @return savedDetails
	 */
	public Customer saveCustDetails(AddCustomerRequest addCustRequest) {

		Customer cust = new Customer();
		cust.setCustName(addCustRequest.getCustName());
		cust.setCustId(addCustRequest.getCustId());
		return customerRepo.save(cust);
		
	}

	
	
	/**
	 *   to find all available room by date/date range
	 * @param findAvailableRoomsRequest
	 * @return findAvailableRoomsResponse
	 */
	public FindAvailableRoomsResponse getAvailableRooms(FindAvailableRoomsRequest findAvailableRoomsRequest)
	{
		FindAvailableRoomsResponse findAvailableRoomsResponse=new FindAvailableRoomsResponse();
		
		findAvailableRoomsResponse.setRoomResponse(roomRepo.findAllAvailableRooms(findAvailableRoomsRequest.getStartDate(),findAvailableRoomsRequest.getEndDate() ));
		return findAvailableRoomsResponse;
	   

	}
	
	
	
	
	/**
	 * to create booking and billing
	 * 
	 * @param billingAndBookingRequest
	 * @return BillingAndBookingResponse billingAndBookingResponse
	 */
	public BillingAndBookingResponse billingAndBooking(BillingAndBookingRequest billingAndBookingRequest) {
		
		String a = "yes";
		String b = "no";
		double breakfastCharge = 1000;
		double bill = 0.0;
		
		
		Booking booking = new Booking();
		BillingAndBookingResponse billingAndBookingResponse=new BillingAndBookingResponse();
		
		FindAvailableRoomsRequest findAvailableRooms=new FindAvailableRoomsRequest();
		findAvailableRooms.setStartDate(billingAndBookingRequest.getStartDate());
		findAvailableRooms.setEndDate(billingAndBookingRequest.getEndDate());
		
		FindAvailableRoomsResponse availableRooms=getAvailableRooms(findAvailableRooms);
		int flag=0;
		Room room=null;
		for(int i=0; i<=availableRooms.getRoomResponse().size(); i++)
		{
			if(availableRooms.getRoomResponse().get(i).getRoomId()==billingAndBookingRequest.getRoomId()) {
				room=availableRooms.getRoomResponse().get(i);
				flag=1;
			break;
			}
		}
		//long noOfDays = DAYS.between(billingAndBookingRequest.getStartDate(), billingAndBookingRequest.getEndDate());
		
        if(flag==1) {
		if (billingAndBookingRequest.getBreakfast().equals(a)) {
			bill = /*noOfDays**/ (room.getRoomPrice() + breakfastCharge);
		} else {
			bill = /*noOfDays**/room.getRoomPrice();
		}
		booking.setRoomId(billingAndBookingRequest.getRoomId());
		booking.setBreakfast(billingAndBookingRequest.getBreakfast());
		booking.setTotalCharge(bill);
		booking.setCustId(billingAndBookingRequest.getCustId());
		booking.setStartDate(billingAndBookingRequest.getStartDate());
		booking.setEndDate(billingAndBookingRequest.getEndDate());

	
		if(bookingRepo.save(booking) != null) {
		roomRepo.changeRoomStatus( billingAndBookingRequest.getRoomId(), "unavailable");
		
		billingAndBookingResponse.setbId(booking.getbId());
		billingAndBookingResponse.setCustId(booking.getCustId());
		billingAndBookingResponse.setRoomId(booking.getRoomId());
		billingAndBookingResponse.setBreakfast(booking.getBreakfast());
		billingAndBookingResponse.setStartDate(booking.getStartDate());
		billingAndBookingResponse.setEndDate(booking.getEndDate());
		billingAndBookingResponse.setTotalCharge(booking.getTotalCharge());
		
		}
		
		
    }
        return billingAndBookingResponse;
	}


	
	 
	
	/**   to cancel booking
	 * @param bId
	 */
	public void cancelBooking(int bId) {
		
		bookingRepo.deleteById(bId);
		//roomRepo.changeRoomStatus(bookingRepo.findOne(bId).getRoomId() , "available");
	}

}
