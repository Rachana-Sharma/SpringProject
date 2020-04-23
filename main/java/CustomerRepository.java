

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>{

	Customer save(Customer cust);

	
	
	
	
}
