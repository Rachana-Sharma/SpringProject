package com.rs.hotels;

public class Controller {

	package com.example.demo.content;

	import java.util.List;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.bind.annotation.Controller;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class MainController{
		
		@Autowired
		RoomRepository roomRepo;
		
		@Autowired
		BookingRepository bookRepo;
		
		@Autowired
		CustomerRepository customerRepo;
		
		
		MainService ms=new MainService();
		
		/* to save and check customer details*/
		@RequestMapping
		@ResponseBody
		public ResponseEntity<?> addCustDetails(@RequestParam String custName,@RequestParam int custId ){
			Customer cust=new Customer();
			cust.setCustName(custName);
			cust.setCustId(custId);
			

			if(ms.saveCustDetails(cust)!=null)
			{
			return Request.CreateResponse(HttpStatusCode.OK, cust); 
			}
			else
			return Request.CreateResponse(HttpStatusCode.NotFound,"customer not found");	
		}
		
		
		@GetMapping("/rooms")
		Room checkAvailableRooms(@PathVariable String avialable)
		{
			return RoomRepo.findByAvailable(available);
		}
		
		/*delete booking*/
		@DeleteMapping("/bookings/{bId}")
		void deleteBooking(@PathVariable int bId){
			ms.cancelBooking(bId);
		}
		
	}
}
