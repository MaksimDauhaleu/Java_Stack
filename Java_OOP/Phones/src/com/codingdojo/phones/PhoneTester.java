package com.codingdojo.phones;

public class PhoneTester {

	public static void main(String[] args) {
		Galaxy galaxy1 = new Galaxy ("s9",99,"ATT","Ring");
		Iphone iphone1 = new Iphone ("11 Pro",84,"ATT","Boohh..");
		galaxy1.ring();
		iphone1.ring();
		
		

		galaxy1.displayInfo();
		iphone1.displayInfo();

	}

}
