

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/hotel")
public class Project2Controller {

	@Autowired
	RoomRepository roomRepo;

	@Autowired
	BookingRepository bookRepo;

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	Project2Service hs = new Project2Service();
	

	
	
	/**
	 *  to save and check customer details
	 * @param addCustRequest
	 * 
	 * @return ResponseEntity<?>
	 */
	@RequestMapping("/Customer")
	@ResponseBody
	public ResponseEntity<?> addCustDetails(@RequestBody  AddCustomerRequest addCustRequest) {
		

		if (hs.saveCustDetails(addCustRequest) != null) {
			return new ResponseEntity(HttpStatus.OK);
		} else
//return new ResponseEntity(HttpStatus.NOT_FOUND,"Customer notund);
			return new ResponseEntity(HttpStatus.NOT_FOUND	);
	}

	
	/**
	 * find all available rooms by date/date range
	 * 
	 * @param findAvailableRoomsRequest
	 * @return availableRooms
	 */
	@GetMapping("/Room")
	public FindAvailableRoomsResponse returnAvailableRooms(@RequestBody FindAvailableRoomsRequest findAvailableRoomsRequest ) {
		
		FindAvailableRoomsResponse availableRooms=hs.getAvailableRooms(findAvailableRoomsRequest);
		return availableRooms;
	}

	
	/**   create booking and billing
	 * @param BillingAndBookingRequest billingAndBookingRequest
	 * 
	 * @return BillingAndBookingResponse 
	 */
	@RequestMapping("/Booking")
	public BillingAndBookingResponse calculateBill(@RequestBody BillingAndBookingRequest billingAndBookingRequest) {
		return hs.billingAndBooking(billingAndBookingRequest);
		
	}

	
	/**   cancel booking
	 * @param bId
	 */
	@DeleteMapping("/bookings/{bId}")
	void deleteBooking(@PathVariable int bId) {
		hs.cancelBooking(bId);
		
	}

}
