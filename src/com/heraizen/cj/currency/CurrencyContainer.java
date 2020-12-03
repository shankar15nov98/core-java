package com.heraizen.cj.currency;

public class CurrencyContainer {
	Currency getCurrency(String country) {

		if (country.toLowerCase().equals("India".toLowerCase()))
			return new India();
		else if (country.toLowerCase().equals("UK".toLowerCase()))
			return new UK();
		else if (country.toLowerCase().equals("USA".toLowerCase()))
			return new USA();
		else
			throw new IllegalArgumentException("please give valid country name");

	}
}
