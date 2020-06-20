/**
 * 
 */
package com.logesh.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.logesh.app.model.Booking;

/**
 * @author sv
 *
 */
@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
