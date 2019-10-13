package com.rs.hotels;

import org.Framework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking,integer>  {

	void deleteById(int bId);
	
	
}
