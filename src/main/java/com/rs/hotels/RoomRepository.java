package com.rs.hotels;
import org.springFramework.data.repository.CrudRepository;

public interface RoomRepository<integer> extends CrudRepository<Room,integer>{

	
	static Room findByAvailable(String available) {
		// TODO Auto-generated method stub
		return null;
	}

	Room findAll(String available);

	
	
	
		
		/*public void searchRoom(String available){
			
			 @Query("select * from Room r,Booking b where r.available='Yes' AND b.startDate>'12-FEB-2019'   AND b.endDate<'1-MAR-2019';",
			     nativeQuery = true)
			     findRoomByAvailabilty(@Param("available")String available);

			 
		//}
	}*/
}
