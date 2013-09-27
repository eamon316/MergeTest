package com.eamon.merge;

public class Contact {

	public Person person;
	public Address address;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contact(Person person, Address address) {
		super();
		this.person = person;
		this.address = address;
	}
	
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
