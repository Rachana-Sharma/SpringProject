

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingAndBookingResponse {

	@JsonProperty("bookingId")
	private int bId;
	
	@JsonProperty("customerId")
	private	int custId;
	
	@JsonProperty("roomId")
	private int roomId;
	
	@JsonProperty("breakfast")
	private String breakfast;
	
	@JsonProperty("bookingStartDate")
	private Date startDate;
	
	@JsonProperty("bookingEndDate")
	private Date endDate;
	
	@JsonProperty("totalBill")
	private double totalCharge;
	
	
	
	/**
	 * @param bId
	 * @param custId
	 * @param roomId
	 * @param breakfast
	 * @param startDate
	 * @param endDate
	 * @param totalCharge
	 */
	public BillingAndBookingResponse(int bId, int custId, int roomId, String breakfast, Date startDate, Date endDate,
			double totalCharge) {
		super();
		this.bId = bId;
		this.custId = custId;
		this.roomId = roomId;
		this.breakfast = breakfast;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalCharge = totalCharge;
	}



	/**
	 * 
	 */
	public BillingAndBookingResponse() {
		super();
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



	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}



	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
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
	 * @return the breakfast
	 */
	public String getBreakfast() {
		return breakfast;
	}



	/**
	 * @param breakfast the breakfast to set
	 */
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}



	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}



	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}



	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	/**
	 * @return the totalCharge
	 */
	public double getTotalCharge() {
		return totalCharge;
	}



	/**
	 * @param totalCharge the totalCharge to set
	 */
	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}
	
	
	
}
