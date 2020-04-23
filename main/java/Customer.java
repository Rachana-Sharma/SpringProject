

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="CUSTOMER_ID")
	private int custId;
	
	
	@Column(name="CUSTOMER_NAME")
    private String custName;
    
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
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
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	
	
		
		
		
}
