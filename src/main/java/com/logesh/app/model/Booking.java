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
	private String city;
	private String state;
	private String country; 
	private Long mobilenumber;
	private Integer otp;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(Integer id, String firstname, String lastname, String emailid, String usertype, String address,
			String city, String state, String country, Long mobilenumber, Integer otp) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.usertype = usertype;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobilenumber = mobilenumber;
		this.otp = otp;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid
				+ ", usertype=" + usertype + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", mobilenumber=" + mobilenumber + ", otp=" + otp + "]";
	}
	
}
