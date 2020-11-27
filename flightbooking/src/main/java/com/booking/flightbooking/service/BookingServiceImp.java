package com.booking.flightbooking.service;


import com.booking.flightbooking.entity.BookingBean;
import com.booking.flightbooking.exception.FBException;
import com.booking.flightbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImp implements BookingService {

    @Autowired
    BookingRepository bookingRepository;
    
   public boolean createBooking(BookingBean bean){
	   
	   if(bookingRepository.save(bean) != null) {
       	bean.getbId();
       	return true;
		}
		else {
			throw new FBException("Failed to add Booking-in Info");
		}

    }

   public void cancelBooking(int bId){
       bookingRepository.deleteById(bId);

    }

    public BookingBean getBookingInfo(int bId) {
      return bookingRepository.findById(bId).get();
    }
}
