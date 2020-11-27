package com.booking.flightbooking.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
//@Table (name = "Booking")
public class BookingBean {

    @Id
    @GeneratedValue
    @Column
    int bId;
	@Column
    int flightId;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    String gender;
    @Column
    boolean checkIn;

    public BookingBean() {

    }

    public BookingBean(int bId, int flightId, String firstName, String lastName, String gender, boolean checkIn) {
		super();
		this.bId = bId;
		this.flightId = flightId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.checkIn = checkIn;
	}


    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }
}
