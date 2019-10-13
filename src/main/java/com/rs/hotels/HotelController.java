package com.rs.hotels;


import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HotelController {

	
	
		@Autowired
		RoomRepository roomRepo;
		
		@Autowired
		BookingRepository bookRepo;
		
		@Autowired
		CustomerRepository customerRepo;
		
		
		HotelService hs=new HotelService();
		
/* to save and check customer details*/
		@RequestMapping
		@ResponseBody
		public ResponseEntity<?> addCustDetails(@RequestParam String custName,@RequestParam int custId ){
			Customer cust=new Customer();
			cust.setCustName(custName);
			cust.setCustId(custId);
			

			if(hs.saveCustDetails(cust)!=null)
			{
			return Request.CreateResponse(HttpStatus.OK, cust); 
			}
			else
			return Request.CreateResponse(HttpStatus.NOT_FOUND,"customer not found");	
		}
		
		
/*find available rooms*/
		@GetMapping("/rooms")
		Room checkAvailableRooms(@PathVariable String available)
		{
			return RoomRepository.findByAvailable(available);
		}
		
/*calculate bill*/
		@RequestMapping("/")
		public double calculateBill( @PathVariable int bId, @PathVariable double roomPrice,@PathVariable String breakfast,@PathVariable double totalCharge) {
			hs.billing(bId, roomPrice, breakfast,totalCharge);
		return totalCharge;
		}
		
		
/*delete booking*/
		@DeleteMapping("/bookings/{bId}")
		void deleteBooking(@PathVariable int bId){
			hs.cancelBooking(bId);
			
		}
		
	}

