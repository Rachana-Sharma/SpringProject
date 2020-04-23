

import java.util.List;

public class FindAvailableRoomsResponse {

	private List<Room> roomResponse;

	/**
	 * @param roomResponse
	 */
	public FindAvailableRoomsResponse(List<Room> roomResponse) {
		super();
		this.roomResponse = roomResponse;
	}

	
	
	public FindAvailableRoomsResponse() {
		super();
		
	}

	/**
	 * @return the roomResponse
	 */
	public List<Room> getRoomResponse() {
		return roomResponse;
	}

	/**
	 * @param roomResponse the roomResponse to set
	 */
	public void setRoomResponse(List<Room> roomResponse) {
		this.roomResponse = roomResponse;
	}
	
	
	
	
}
