

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
@Repository
public interface RoomRepository extends CrudRepository<Room, Integer> {

	/*static Room findByAvailable(String available) {
		
		return null;
	}*/

	//Room findAll(int roomId);

	@Query("select * from Room r where r.roomStatus='available' AND r.bId NOT IN(select bId from Booking b where (b.startDate BETWEEN (:startDate AND :endDate)) OR (b.endDate BETWEEN (:startDate AND :endDate)) OR (b.startDate <= :startDate AND b.endDate >= :endDate);")
	 List<Room> findAllAvailableRooms(@Param("startDate") Date startDate,@Param("endDate") Date endDate);

	
	@Query("UPDATE Room set roomStatus= :roomStatus AND bId = null where roomId= :roomId;")
	public void changeRoomStatus(@Param("roomId") int roomId,@Param("roomStatus") String roomStatus);
	
}
