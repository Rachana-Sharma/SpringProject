


public class AddCustomerRequest {

	private int custId;
	private String custName;
	
	public AddCustomerRequest(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public AddCustomerRequest() {
		super();
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	
}
