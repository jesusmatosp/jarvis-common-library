package com.interbank.jarvis.commons.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author IBM - JMATOS
 * @name CurrencyType
 * @version 1.0.0
 * @date 12-10-2020
 * @copyright Interbank 2020
 * */
public enum CurrencyType {

	PEN_CURRENCY(604, "S/."),
	USD_CURRENCY(605, "$");
	
	/** La key. */
	private Integer key;
	
	/** La value. */
	private String value;

	
	/** La Constante list. */
	private static List<CurrencyType> list = new ArrayList<CurrencyType>();
	
	/** La Constante lookup. */
	private static Map<Integer, CurrencyType> lookup = new HashMap<Integer, CurrencyType>();

	static {
		for (CurrencyType s : EnumSet
				.allOf(CurrencyType.class)) {
			list.add(s);
			lookup.put(s.getKey(), s);
		}
	}

	/**
	 * Instancia un nuevo estado actividad type.
	 *
	 * @param key el key
	 * @param value el value
	 */
	private CurrencyType(Integer key, String value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * Obtiene key.
	 *
	 * @return key
	 */
	public Integer getKey() {
		return key;
	}
	
	/**
	 * Obtiene value.
	 *
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Gets the.
	 *
	 * @param key el key
	 * @return the estado actividad type
	 */
	public static CurrencyType get(Integer key) {
		CurrencyType temp = lookup.get(key);
		return temp;
	}
}
