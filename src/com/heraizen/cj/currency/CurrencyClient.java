package com.heraizen.cj.currency;

public class CurrencyClient {
	public static void main(String[] arg) {

		CurrencyContainer currency = new CurrencyContainer();
		currency.getCurrency("india").getCurrency();
		currency.getCurrency("Uk").getCurrency();
		currency.getCurrency("Usa").getCurrency();
		currency.getCurrency("China").getCurrency();
	}
}
