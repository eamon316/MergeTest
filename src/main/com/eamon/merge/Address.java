package com.eamon.merge;

public class Address {

	public String line1;
	public String line2;
	public String line3;
	public String city;
	public String state;
	public String postcode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String line1, String line2, String line3, String city, String state, String postcode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.state = state;
		this.postcode = postcode;
	}
	
	/**
	 * @return the line1
	 */
	public String getLine1() {
		return line1;
	}
	
	/**
	 * @param line1 the line1 to set
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	/**
	 * @return the line2
	 */
	public String getLine2() {
		return line2;
	}
	
	/**
	 * @param line2 the line2 to set
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
	/**
	 * @return the line3
	 */
	public String getLine3() {
		return line3;
	}
	
	/**
	 * @param line3 the line3 to set
	 */
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}
	
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
}
