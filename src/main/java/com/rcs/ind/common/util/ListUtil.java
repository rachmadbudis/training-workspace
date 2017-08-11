package com.rcs.ind.common.util;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portlet.dynamicdatalists.model.DDLRecord;
import com.liferay.portlet.dynamicdatalists.model.DDLRecordSet;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalServiceUtil;
import com.liferay.portlet.dynamicdatamapping.storage.Field;
import com.rcs.ind.common.IndConstants;
import com.rcs.ind.common.enums.TrackEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Component
public class ListUtil {

	/**
	 * Get Dynamic Data List with condition from one DDL boolean value and convert it to List of KeyValuePair
	 * 
	 * @param ddlId
	 * @param key
	 * @param value
	 * @param condition
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static List<KeyValuePair> getDynamicDataList(String ddlName, String key, String value, String condition) throws PortalException, SystemException {
		List<KeyValuePair> list = new ArrayList<KeyValuePair>();

		DDLRecordSet ddlRecordSet = getDDLRecordSetbyName(ddlName);
		if (ddlRecordSet != null) {
			for (DDLRecord ddlRecord : ddlRecordSet.getRecords()) {
				if (ddlRecord.getFieldValue(condition) != null && Boolean.parseBoolean(ddlRecord.getFieldValue(condition).toString())) {
					list.add(new KeyValuePair(ddlRecord.getFieldValue(key).toString(), ddlRecord.getFieldValue(value).toString()));
				}
			}
		}
		return Collections.unmodifiableList(list);
	}

	/**
	 * Get Dynamic Data List with condition from one DDL boolean value and convert it to List of String
	 * 
	 * @param ddlId
	 * @param key
	 * @param condition
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static List<String> getDynamicDataListString(String ddlName, String key, String condition) throws PortalException, SystemException {
		List<String> list = new ArrayList<String>();

		DDLRecordSet ddlRecordSet = getDDLRecordSetbyName(ddlName);
		if (ddlRecordSet != null) {
			for (DDLRecord ddlRecord : ddlRecordSet.getRecords()) {
				if (ddlRecord.getFieldValue(condition) != null && Boolean.parseBoolean(ddlRecord.getFieldValue(condition).toString())) {
					list.add(ddlRecord.getFieldValue(key).toString());
				}
			}

			// Sort by value
			Collections.sort(list, new Comparator<String>() {

				public int compare(String x, String y) {
					return x.compareToIgnoreCase(y);
				}
			});
		}
		return Collections.unmodifiableList(list);
	}

	public static Map<String, String> getTrackMap() throws PortalException, SystemException {
		return getTrackMap(null);
	}

	/**
	 * Get List of Track from Track Dynamic Data List if parameter simplified is null, it returns all tracks
	 * 
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static Map<String, String> getTrackMap(Boolean simplified) throws PortalException, SystemException {
		Map<String, String> result = new LinkedHashMap<String, String>();
		DDLRecordSet ddlRecordSet = getDDLRecordSetbyName(IndConstants.TRACK_DDL_NAME);
		if (ddlRecordSet != null) {
			for (DDLRecord ddlRecord : ddlRecordSet.getRecords()) {
				try {
					TrackEnum key = TrackEnum.valueOf(ddlRecord.getFieldValue(IndConstants.TRACK_KEY).toString());
					String label = ddlRecord.getFieldValue(IndConstants.TRACK_LABEL).toString();
					if (simplified == null || simplified == key.getSimplified()) {
						result.put(key.name(), label);
					}
				} catch (IllegalArgumentException ex) {
					// key not registered in enum
				}
			}
			result = sortByValue(result);
		}
		return result;
	}

	/**
	 * Get map of given ddl name and a key
	 * 
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static Map<String, String> getListAsMap(String ddlName, String key, String value) throws PortalException, SystemException {
		Map<String, String> result = new LinkedHashMap<String, String>();
		DDLRecordSet ddlRecordSet = getDDLRecordSetbyName(ddlName);

		if(ddlRecordSet!=null) {
			for (DDLRecord ddlRecord : ddlRecordSet.getRecords()) {
				String resKey = ddlRecord.getFieldValue(key).toString();
				String resVal = ddlRecord.getFieldValue(value).toString();
				result.put(resKey, resVal);
			}
		}
		return result;
	}

	public static Map<String, String> getLocationFields(String locationName) throws SystemException, PortalException {
		Map<String, String> result = new LinkedHashMap<String, String>();
		DDLRecordSet ddlRecordSet = getDDLRecordSetbyName(IndConstants.LOCATION_DDL_NAME);

		if(ddlRecordSet!=null){
			for (DDLRecord ddlRecord : ddlRecordSet.getRecords()) {
				if (StringUtils.equals(ddlRecord.getField(IndConstants.LOCATION).getValue().toString(), locationName)) {
					for (Field field : ddlRecord.getFields()) {
						result.put(field.getName(), field.getValue().toString());
					}
					break;
				}
			}
		}
		return result;
	}

	// Helper for sorting a map by value
	private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> unsortMap) {

		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {

			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		return result;

	}

	public static List<KeyValuePair> getDynamicDataList(String ddlName, String key, String value) throws PortalException, SystemException {
		List<KeyValuePair> list = new ArrayList<KeyValuePair>();

		DDLRecordSet ddlRecordSet = getDDLRecordSetbyName(ddlName);
		if (ddlRecordSet != null) {
			for (DDLRecord ddlRecord : ddlRecordSet.getRecords()) {
				list.add(new KeyValuePair(ddlRecord.getFieldValue(key).toString(), ddlRecord.getFieldValue(value).toString()));
			}
			Collections.sort(list, new KeyValuePairComparator());
		}
		return list;
	}

	private static DDLRecordSet getDDLRecordSetbyName(String ddlName) throws SystemException {
		DDLRecordSet ddlRecordSet = null;

		DynamicQuery dynamicQuery = DDLRecordSetLocalServiceUtil.dynamicQuery();
		Criterion criterion = RestrictionsFactoryUtil.like("name", StringPool.PERCENT + ">" + ddlName + "</Name>" + StringPool.PERCENT);
		dynamicQuery.add(criterion);
		List recordSets = DDLRecordSetLocalServiceUtil.dynamicQuery(dynamicQuery);
		if (recordSets.get(0) != null) {
			ddlRecordSet = (DDLRecordSet) recordSets.get(0);
		}

		return ddlRecordSet;
	}

	private static class KeyValuePairComparator implements Comparator<KeyValuePair> {

		public int compare(KeyValuePair x, KeyValuePair y) {
			return x.getValue().compareToIgnoreCase(y.getValue());
		}
	}

}
