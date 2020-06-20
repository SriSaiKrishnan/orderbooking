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
public class Booking {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String firstname;
	private String lastname;
	private String emailid;
	private String usertype;
	private String address;
	private Integer mobilenumber;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(Integer id, String firstname, String lastname, String emailid, String usertype, String address,
			Integer mobilenumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.usertype = usertype;
		this.address = address;
		this.mobilenumber = mobilenumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Integer mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid
				+ ", usertype=" + usertype + ", address=" + address + ", mobilenumber=" + mobilenumber + "]";
	}
	
}
