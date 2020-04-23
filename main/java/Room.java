

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rachana Sharma
 *
 */
@Entity
@Table(name="ROOM")
public class Room {

	@Id
	@Column(name="ROOM_ID")
	private int roomId;
	
	
	@Column(name="ROOM_TYPE")
	private String roomType;
	
	
	@Column(name="ROOM_PRICE")
	private double roomPrice;
	
	@Column(name="ROOM_STATUS")
	private String roomStatus;
	
	
	@Column(name="BOOKING_ID")
	private int bId;

	public Room(int roomId, String roomType, double roomPrice, int bId, String roomStatus) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomStatus = roomStatus;
		this.bId = bId;
	}

	public Room() {
		// TODO Auto-generated constructor stub
	}

	

	
	
	
	/**
	 * @return the roomId
	 */
	public int getRoomId() {
		return roomId;
	}

	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return the roomType
	 */
	public String getRoomType() {
		return roomType;
	}

	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	/**
	 * @return the roomPrice
	 */
	public double getRoomPrice() {
		return roomPrice;
	}

	/**
	 * @param roomPrice the roomPrice to set
	 */
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	/**
	 * @return the roomStatus
	 */
	public String getRoomStatus() {
		return roomStatus;
	}

	/**
	 * @param roomStatus the roomStatus to set
	 */
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	/**
	 * @return the bId
	 */
	public int getbId() {
		return bId;
	}

	/**
	 * @param bId the bId to set
	 */
	public void setbId(int bId) {
		this.bId = bId;
	}

	
}
