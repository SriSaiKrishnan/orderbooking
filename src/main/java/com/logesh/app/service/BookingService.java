/**
 * 
 */
package com.logesh.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logesh.app.model.Booking;
import com.logesh.app.repository.BookingRepository;

/**
 * @author sv
 *
 */

@Service
public class BookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	public List<Booking> listAll(){
		return (List<Booking>)bookingRepository.findAll();
	}
	
	public Booking addBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

}
