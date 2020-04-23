

import java.util.Date;

public class BillingAndBookingRequest {

	private	int custId;
	private int roomId;
	private String breakfast;
	private Date startDate;
	private Date endDate;
	
	
	public BillingAndBookingRequest(int custId, int roomId, String breakfast, Date startDate, Date endDate) {
		super();
		this.custId = custId;
		this.roomId = roomId;
		this.breakfast = breakfast;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public BillingAndBookingRequest() {
		super();
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public int getRoomId() {
		return roomId;
	}


	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}


	public String getBreakfast() {
		return breakfast;
	}


	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
}
