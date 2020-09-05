package org.divya.converters;

import javax.ws.rs.ext.ParamConverter;

import org.divya.Currency;

public class CurrencyParamConverter implements ParamConverter<Currency> {

	@Override
	public Currency fromString(String code) {
		
		Currency currency = null;
		switch(code.toUpperCase()) {
		case "EUR": currency = new Currency(code, "Euro"); break;
		case "USD": currency = new Currency(code, "US Dollar"); break;
		case "INR": currency = new Currency(code, "Rupees"); break;
			
		}
		
		return currency;
	}

	@Override
	public String toString(Currency currency) {
		// TODO Auto-generated method stub
		return currency.toString();
	}

}
