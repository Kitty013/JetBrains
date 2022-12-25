package com.sfpd.java.simpleBot.src;

import static java.time.LocalDate.of;

public class Bot {
	
	public String getName() {
		return "Kitty";
	}
	
	public int getBirthYear() {
		return of(2022,1,21).getYear();
	}
}
