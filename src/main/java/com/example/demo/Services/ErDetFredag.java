package com.example.demo.Services;


import java.time.LocalDate;

public class ErDetFredag {

	
	private LocalDate date = LocalDate.now(); //Dagen på ugen.

	
	
	//Constructor
	public ErDetFredag(){}
	
	private double calcDayOfYear() {
		
		 // temp holder
		double h;
		double d;

		// Dag og måned.
		 int q = date.getDayOfMonth();
		 int m = date.getMonthValue();
		 
		 
		 int year = date.getYear();
		 
		 //Århunderede og året i dette århunderede.
		 int j = year / 100;
		 int k = year % 100;

		 //Zellers Congruenc, en algoritme 
		 h = (q + Math.floor(13 * (m + 1) / 5) + k + Math.floor(k / 4) + Math.floor(j / 4) - 2 * j) % 7;
		 d = ((h + 5) % 7)+1;
		 return d;
		 
	}
	
	
	public String returnDate() {
		
		// tjekker om dagen på ugen er 5, hvis det er, så er det fredag. 
		if ( calcDayOfYear() == 5.0) {
			return "Det er fredag";
		}
		
		return "Det er ikke fredag";

	}
}
