/**
 * 
 */
package com.logesh.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logesh.app.model.PriceList;
import com.logesh.app.service.PriceListService;

/**
 * @author sv
 *
 */
@RestController
@RequestMapping("/pricelist")
public class PriceListController {
	
	@Autowired
	PriceListService priceListService;
	
	@GetMapping()
	public List<PriceList> listAll(){
		return priceListService.listAll();
	}
	
	@PostMapping
	public PriceList addPriceList(@RequestBody PriceList list) {
		return priceListService.addPriceList(list);
	}
	

}
