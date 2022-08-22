package lab4;

import java.time.LocalDate;

abstract class Item {

	private int identificationNumber;

	private String title;

	private int numberOfCopies;

	Item(){
	
	}

	public Item(int identificationNumber, String title, int numberOfCopies) {

		this.identificationNumber = identificationNumber;

		this.title = title;

		this.numberOfCopies = numberOfCopies;

	}

	public int getIdentificationNumber() {

		return identificationNumber;

	}

	public void setIdentificationNumber(int identificationNumber) {

		this.identificationNumber = identificationNumber;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public int getNumberOfCopies() {

		return numberOfCopies;

	}

	public void setNumberOfCopies(int numberOfCopies) {

		this.numberOfCopies = numberOfCopies;

	}

	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", numberOfCopies="
				+ numberOfCopies + "]";
	}
	
	public void print(Item item) {
		System.out.println(item.identificationNumber+" "+item.title+" "+item.numberOfCopies);
	}
	
	public void checkIn(int identificationNumber) {
		
		System.out.println("Checked in on: "+LocalDate.now());
	}
	
	public void checkOut(int identificationNumber) { 
		
		System.out.println("Checked out on: "+LocalDate.now());
	}



}