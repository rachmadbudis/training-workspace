package com.rcs.ind.common.util;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class CommonUtil {

	private static final Logger logger = LoggerFactory.getLogger(CommonUtil.class);
	
	/**
	 * Convert a Java object to JSON
	 * 
	 * @param object
	 *            Java object
	 * @return a JSON string or null if an exception caught
	 */
	public static String toJson(Object object) {
		try {
			ObjectMapper om = new ObjectMapper();
			return om.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			logger.error("Failed to generate Json: " + e.getMessage(), e);
		} catch (JsonMappingException e) {
			logger.error("Failed to map Json: " + e.getMessage(), e);
		} catch (IOException e) {
			logger.error("IO Exception: " + e.getMessage(), e);
		}
		return null;
	}

	/**
	 * Convert a Java object to pretty-printed JSON
	 * 
	 * @param object
	 *            Java object
	 * @return a pretty-printed JSON string or null if an exception caught
	 */
	public static String toJsonPretty(Object object) {
		try {
			ObjectMapper om = new ObjectMapper();
			return om.enable(SerializationFeature.INDENT_OUTPUT).writeValueAsString(object);
		} catch (JsonGenerationException e) {
			logger.error("Failed to generate Json: " + e.getMessage(), e);
		} catch (JsonMappingException e) {
			logger.error("Failed to map Json: " + e.getMessage(), e);
		} catch (IOException e) {
			logger.error("IO Exception: " + e.getMessage(), e);
		}
		return null;
	}

	/**
	 * Convert JSON string to a Java object
	 * 
	 * @param content
	 *            JSON String
	 * @param typeReference
	 *            Contains object that the JSON string will be converted
	 * @return
	 */
	public static <T> T fromJson(String content, TypeReference<T> typeReference) {
		try {
			ObjectMapper om = new ObjectMapper();
			return om.readValue(content, typeReference);
		} catch (JsonParseException e) {
			logger.error("Failed to parse Json: " + e.getMessage(), e);
		} catch (JsonMappingException e) {
			logger.error("Failed to map Json: " + e.getMessage(), e);
		} catch (IOException e) {
			logger.error("IO Exception: " + e.getMessage(), e);
		}
		return null;
	}
	
	public static Object fromJson(String data, Class<?> type) {
		try {
			ObjectMapper om = new ObjectMapper();
			return om.readValue(data, type);
		} catch (Exception e) {
			logger.error("Failed to parse Json: " + e.getMessage(), e);
		}
		return null;
	}

	/**
	 * Convert JSON string to a Java object
	 * 
	 * @param content
	 * @return
	 */
	public static <T> T fromJson(String content) {
		return fromJson(content, new TypeReference<T>() {});
	}

	/**
	 * Convert a Java object to JSON
	 * 
	 * @param object
	 * @return
	 */
	public static String toJsonSkipException(Object object) {
		try {
			return toJson(object);
		} catch (Exception e) {
			return "Error when parsing to Json: " + e.getMessage();
		}
	}

	/**
	 * Allows using of {@link Enumeration} with the for-each statement. The implementation is not using any heap space and such is able to serve virtually
	 * endless Enumerations, while {@link Collections#list} is limited by available RAM. As a result, this implementation is much faster than Collections.list.
	 * 
	 * @author Markus KARG (markus@headcrashing.eu)
	 * 
	 * @param enumeration
	 *            The original enumeration.
	 * @return An {@link Iterable} directly calling the original Enumeration.
	 */
	public static final <T> Iterable<T> iterable(final Enumeration<T> enumeration) {
		return new Iterable<T>() {

			public final Iterator<T> iterator() {
				return new Iterator<T>() {

					public final boolean hasNext() {
						return enumeration.hasMoreElements();
					}

					public final T next() {
						return enumeration.nextElement();
					}

					/**
					 * This method is not implemeted as it is impossible to remove something from an Enumeration.
					 * 
					 * @throws UnsupportedOperationException
					 *             always.
					 */
					public final void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	/**
	 * 
	 * 
	 * @param properties
	 * @return
	 */
	public static List<Map<String, Object>> convertToListProperties(Map<String, Object> properties) {
		List<Map<String, Object>> listProp = new ArrayList<Map<String, Object>>();
		for (String key : properties.keySet()) {
			Map<String, Object> pr = new HashMap<String, Object>();
			pr.put("key", key);
			// set the value to Null if the value is an empty string
			Object value = properties.get(key);
			if (value instanceof String && value != null && ((String) value).isEmpty()) {
				value = null;
			}
			pr.put("value", value);
			listProp.add(pr);
		}
		return listProp;
	}

	/**
	 * Parse date string to date by given pattern
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Date parseDate(String date, String pattern) {
		try {
			return FastDateFormat.getInstance(pattern).parse(date);
		} catch (ParseException e) {
			logger.error("Cannot parse String to Date: " + e.getMessage(), e);
			return null;
		}
	}

	/**
	 * Parse date to date string by given pattern
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String formatDate(Date date, String pattern) {
		try {
			return FastDateFormat.getInstance(pattern).format(date);
		} catch (Exception e) {
			logger.error("Cannot parse Date to String: " + e.getMessage(), e);
			return null;
		}
	}

	/**
	 * Generate string that contains random character
	 * 
	 * @param length
	 *            String length
	 * @return
	 */
	public static String randomCharacter(int length) {
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();
		return output;
	}

}
