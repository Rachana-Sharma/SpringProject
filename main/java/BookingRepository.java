


import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface BookingRepository extends CrudRepository<Booking,Integer>  {

	void deleteById(int bId);

	Object getAvailableRooms(FindAvailableRoomsRequest any);
	
	
}
