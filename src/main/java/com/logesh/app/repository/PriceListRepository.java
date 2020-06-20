/**
 * 
 */
package com.logesh.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.logesh.app.model.PriceList;

/**
 * @author sv
 *
 */
@Repository
public interface PriceListRepository extends CrudRepository<PriceList, Integer> {

}
