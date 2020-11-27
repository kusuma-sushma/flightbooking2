package com.booking.flightbooking.repository;

import org.springframework.stereotype.Repository;
import com.booking.flightbooking.entity.BookingBean;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface BookingRepository extends CrudRepository<BookingBean, Integer> {

}
