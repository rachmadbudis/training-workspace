package com.rcs.ind.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropsUtil {

	private static final Logger logger = LoggerFactory.getLogger(CommonUtil.class);

	private static final String CONFIG_FILE_NAME = "config.properties";

	private static Properties props = new Properties();

	/**
	 * Read all the properties and store them in memory.
	 */
	static {
		try {
			File catalinaBase = new File(System.getProperty("catalina.base")).getAbsoluteFile();
			File propertyFile = new File(catalinaBase, "webapps/" + CONFIG_FILE_NAME);
			try (BufferedReader in = new BufferedReader(new FileReader(propertyFile))) {
				props.load(in);
			}
		} catch (Exception e) {
			logger.error("Error reading properties file: " + e.getMessage(), e);
		}
	}

	/**
	 * Gets a property with no default value if it does not exist.
	 * 
	 * @param key
	 * @return
	 */
	public static String get(String key) {
		return get(key, null);
	}

	/**
	 * Gets a property, and if it does not exist in the properties file, it returns the default value.
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static String get(String key, String defaultValue) {
		return props.getProperty(key, defaultValue);
	}

	/**
	 * Checks if the properties file contais a certain key.
	 * 
	 * @param key
	 * @return
	 */
	public static boolean contains(String key) {
		return props.contains(key);
	}
}
