/**
 * 
 */
package com.logesh.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author sv
 *
 */
@Entity
public class PriceList {

	@Id
	@GeneratedValue
	private Integer id;
	private String productname;
	private Integer productprice;
	
	public PriceList() {
		// TODO Auto-generated constructor stub
	}

	public PriceList(Integer id, String productname, Integer productprice) {
		super();
		this.id = id;
		this.productname = productname;
		this.productprice = productprice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getProductprice() {
		return productprice;
	}

	public void setProductprice(Integer productprice) {
		this.productprice = productprice;
	}

	@Override
	public String toString() {
		return "PriceList [id=" + id + ", productname=" + productname + ", productprice=" + productprice + "]";
	}

}
