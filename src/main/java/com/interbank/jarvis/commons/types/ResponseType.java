package com.interbank.jarvis.commons.types;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author IBM - JMATOS
 * @name ResponseType
 * @version 1.0.0
 * @date 12-10-2020
 * @copyright Interbank 2020
 * */
public enum ResponseType {

	SUCCESS_RESPONSE("0000" , "Success Response"),
	ERROR_RESPONSE("0001", "Error Response"),
	TIMEOUT_RESPONSE("0003", "Timeout Response");
	
	/** key value */
	private String key;
	
	/** value. */
	private String value;

	
	/** Constant list. */
	private static List<ResponseType> list = new ArrayList<ResponseType>();
	
	/** Constant lookup. */
	private static Map<String, ResponseType> lookup = new HashMap<String, ResponseType>();

	static {
		for (ResponseType s : EnumSet
				.allOf(ResponseType.class)) {
			list.add(s);
			lookup.put(s.getKey(), s);
		}
	}

	/**
	 * 
	 * New Instance of Type 
	 * @param key el key
	 * @param value el value
	 */
	private ResponseType(String key, String value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * Get key.
	 *
	 * @return key
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * Get value.
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
	 * @return the Response Type
	 */
	public static ResponseType get(String key) {
		ResponseType temp = lookup.get(key);
		return temp;
	}
}
