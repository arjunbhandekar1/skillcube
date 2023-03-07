package com.skillcube.driver.entity;

public class Driver {

	private int driverId;

	private String firstname;

	private int telephonenumber;

	private String address;
	private String city;

	private String enginesize;

	private String quoteamount;

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getTelephonenumber() {
		return telephonenumber;
	}

	public void setTelephonenumber(int telephonenumber) {
		this.telephonenumber = telephonenumber;
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

	public String getEnginesize() {
		return enginesize;
	}

	public void setEnginesize(String enginesize) {
		this.enginesize = enginesize;
	}

	public String getQuoteamount() {
		return quoteamount;
	}

	public void setQuoteamount(String quoteamount) {
		this.quoteamount = quoteamount;
	}

	public Driver(int driverId, String firstname, int telephonenumber, String address, String city, String enginesize,
			String quoteamount) {
		super();
		this.driverId = driverId;
		this.firstname = firstname;
		this.telephonenumber = telephonenumber;
		this.address = address;
		this.city = city;
		this.enginesize = enginesize;
		this.quoteamount = quoteamount;
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", firstname=" + firstname + ", telephonenumber=" + telephonenumber
				+ ", address=" + address + ", city=" + city + ", enginesize=" + enginesize + ", quoteamount="
				+ quoteamount + "]";
	}

}
