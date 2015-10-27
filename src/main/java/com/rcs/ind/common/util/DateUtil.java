package com.rcs.ind.common.util;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

/**
 * Common Date utils.
 */
public class DateUtil {

	/**
	 * Converts a timestamp in milliseconds to a Date. It avoids throwing an exception if timestamp is null.
	 * 
	 * @param timestamp
	 * @return
	 */
	public static Date toDate(Long timestamp) {
		if (timestamp == null) {
			return null;
		}

		return new Date(timestamp);
	}

	/**
	 * Converts a timestamp in milliseconds to a Date, adding the number of milliseconds in a day minus one. It avoids throwing an exception if timestamp is
	 * null.
	 * 
	 * @param timestamp
	 * @return
	 */
	public static Date toDateEndOfDay(Long timestamp) {
		if (timestamp == null) {
			return null;
		}

		return new Date(timestamp + DateUtils.MILLIS_PER_DAY - 1);
	}
}