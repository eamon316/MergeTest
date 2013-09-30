package com.eamon.merge;

public class Person {

	public String firstName;
	public String secondName;
	public int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String firstName, String secondName, int age) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		// 2
		// Rename Comment 1
		// Rename Comment 2
	}

	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	/**
	 * @return the secondName
	 */
	public String getSecondName() {
		return secondName;
	}

	
	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * New Method
	 */
	public int newMethod() {
		int x = 2;
		int y = 2;
		int z = x +y;
		
		return z;
	}
}
