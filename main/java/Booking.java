

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOKING")
public class Booking {

	
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)

		@Column(name="BOOKING_ID")
		private int bId;
		
		
		@Column(name="BREAKFAST")
		private String breakfast;
		
		
		@Column(name="ROOM_ID")
		private int roomId;
		
		
		@Column(name="TOTAL_CHARGE")
		private double totalCharge;
		
		
		@Column(name="CUSTOMER_ID")
		private int custId;
		
		
		@Column(name="START_DATE")
		private Date startDate;
		
		@Column(name="END_DATE")
		private Date endDate;
		
		public Booking(int bId, String breakfast, int roomId, double totalCharge, int custId, Date startDate,Date endDate) {
			super();
			this.bId = bId;
			this.breakfast = breakfast;
			this.roomId = roomId;
			this.totalCharge = totalCharge;
			this.custId = custId;
			this.startDate=startDate;
			this.endDate=endDate;
		}

		public Booking() {
			// TODO Auto-generated constructor stub
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

		
		




		

}
