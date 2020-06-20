/**
 * 
 */
package com.logesh.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.logesh.app.model.PriceList;
import com.logesh.app.repository.PriceListRepository;

/**
 * @author sv
 *
 */
@Service
public class PriceListService {
	
	@Autowired
	PriceListRepository listRepository;
	
	public List<PriceList> listAll(){
		return (List<PriceList>)listRepository.findAll();
	}
	
	public PriceList addPriceList(PriceList priceList) {
		return listRepository.save(priceList);
	}

}
