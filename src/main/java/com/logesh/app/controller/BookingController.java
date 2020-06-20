/**
 * 
 */
package com.logesh.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logesh.app.model.Booking;
import com.logesh.app.service.BookingService;

/**
 * @author sv
 *
 */
@Controller
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
//	@GetMapping
//	public List<Booking> getAll(){
//		return bookingService.listAll();
//	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/private")
    public String nextForPrivate(Map<String, Object> model) {
        model.put("message", "You are in Private Customer Page !!");
        return "private";
    }
	
	@RequestMapping("/business")
    public String nextForBusinees(Map<String, Object> model) {
        model.put("message", "You are in Buisness Customer Page !!");
        return "business";
    }
	
	@RequestMapping("/booking")
    public String nextForBooking(Map<String, Object> model) {
        model.put("message", "You are in Booking Page !!");
        return "booking";
    }
	
	
	@PostMapping("/add")
	public Booking addBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}
	

}
