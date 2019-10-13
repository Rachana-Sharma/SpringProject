package com.rs.hotels;

public class Booking {

	
	
		private int bId;
		private String breakfast;
		private int roomId;
		private double totalCharge;
		private int custId;
		
		public Booking(int bId, String breakfast, int roomId, double totalCharge, int custId) {
			super();
			this.bId = bId;
			this.breakfast = breakfast;
			this.roomId = roomId;
			this.totalCharge = totalCharge;
			this.custId = custId;
		}

		public Booking() {
			// TODO Auto-generated constructor stub
		}

		public int getbId() {
			return bId;
		}

		public void setbId(int bId) {
			this.bId = bId;
		}

		public String getBreakfast() {
			return breakfast;
		}

		public void setBreakfast(String breakfast) {
			this.breakfast = breakfast;
		}

		public int getRoomId() {
			return roomId;
		}

		public void setRoomId(int roomId) {
			this.roomId = roomId;
		}

		public double getTotalCharge() {
			return totalCharge;
		}

		public void setTotalCharge(double totalCharge) {
			this.totalCharge = totalCharge;
		}

		public int getCustId() {
			return custId;
		}

		public void setCustId(int custId) {
			this.custId = custId;
		}
		

}
