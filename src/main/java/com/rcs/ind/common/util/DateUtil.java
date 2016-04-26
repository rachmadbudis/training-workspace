package com.rcs.ind.common.util;

import java.util.Calendar;
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

	/**
	 * Count the difference of days between the given date parameter with current date
	 * 
	 * @param date
	 * @return
	 */
	public static Integer getDaysDifference(Date date) {
		if (date == null) {
			return null;
		}
		Calendar nowCalendar = Calendar.getInstance();
		Calendar dateCalendar = Calendar.getInstance();
		dateCalendar.setTime(date);

		return dateCalendar.before(nowCalendar) ? countDaysDifference(dateCalendar, nowCalendar) : countDaysDifference(nowCalendar, dateCalendar);
	}

	private static int countDaysDifference(Calendar c1, Calendar c2) {
		return (int) Math.floor(c2.get(Calendar.DAY_OF_MONTH) - c1.get(Calendar.DAY_OF_MONTH));
	}

}