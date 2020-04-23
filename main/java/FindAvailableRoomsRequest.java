

import java.util.Date;

/**
 * @author 1735959
 *
 */
public class FindAvailableRoomsRequest {

	private Date startDate;
	private Date endDate;
	
	/**
	 * @param startDate
	 * @param endDate
	 */
	public FindAvailableRoomsRequest(Date startDate, Date endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	
	public FindAvailableRoomsRequest() {
		super();
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
