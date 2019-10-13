package com.rs.hotels;
import org.springFramework.data.repository.CRUDRepository;


public interface CustomerRepository extends CrudRepository<Customer,integer>{

	Customer save(Customer cust);

	
	
	
	
}
