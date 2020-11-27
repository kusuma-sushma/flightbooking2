package com.booking.flightbooking.service;

import com.booking.flightbooking.entity.BookingBean;

public interface BookingService {

   public  boolean createBooking(BookingBean bean);

    public void cancelBooking(int bId);

    public BookingBean getBookingInfo(int bId);

}
