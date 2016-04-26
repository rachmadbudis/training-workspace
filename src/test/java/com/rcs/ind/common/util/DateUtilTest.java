package com.rcs.ind.common.util;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

public class DateUtilTest {

	private static final long TIMESTAMP = 1420081200000L;
	private static final long MILLIS_PER_DAY_MINUS_ONE = DateUtils.MILLIS_PER_DAY - 1;

	@Test
	public void testToDate() {
		assertThat(DateUtil.toDate(null), is(nullValue()));
		assertThat(DateUtil.toDate(0L), is(new Date(0L)));
		assertThat(DateUtil.toDate(TIMESTAMP), is(new Date(TIMESTAMP)));
	}

	@Test
	public void testToDateEndOfDay() {
		assertThat(DateUtil.toDateEndOfDay(null), is(nullValue()));
		assertThat(DateUtil.toDateEndOfDay(0L), is(new Date(MILLIS_PER_DAY_MINUS_ONE)));
		assertThat(DateUtil.toDateEndOfDay(TIMESTAMP), is(new Date(TIMESTAMP + MILLIS_PER_DAY_MINUS_ONE)));
	}
	
	@Test
	public void testGetDaysDifference() {
		Calendar yesterday = Calendar.getInstance();
		yesterday.add(Calendar.DAY_OF_MONTH, -1);
		Calendar dayAfterTomorrow = Calendar.getInstance();
		dayAfterTomorrow.add(Calendar.DAY_OF_MONTH, 2);
		assertThat(DateUtil.getDaysDifference(null), is(nullValue()));
		assertThat(DateUtil.getDaysDifference(yesterday.getTime()), is(1));
		assertThat(DateUtil.getDaysDifference(dayAfterTomorrow.getTime()), is(2));
	}
}