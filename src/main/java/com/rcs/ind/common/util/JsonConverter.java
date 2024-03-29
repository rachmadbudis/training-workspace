package com.rcs.ind.common.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JsonConverter {

	private static final Logger logger = LoggerFactory.getLogger(JsonConverter.class);
	private ObjectMapper mapper;

	public JsonConverter() {
		mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true); // Important for Token validation.
	}

	public TypeFactory getMapperTypeFactory() {
		return mapper.getTypeFactory();
	}

	public String toJson(List<?> object) {
		try {
			return mapper.writeValueAsString(object);
		} catch (Exception e) {
			logger.error("Failed to generate Json: " + e.getMessage(), e);
		}
		return null;
	}

	public String toJson(Object object) {
		try {
			return mapper.writeValueAsString(object);
		} catch (Exception e) {
			logger.error("Failed to generate Json: " + e.getMessage(), e);
		}
		return null;
	}

	public Object fromJson(String data, Class<?> type) {
		try {
			return mapper.readValue(data, type);
		} catch (Exception e) {
			logger.error("Failed to parse Json: " + e.getMessage(), e);
		}
		return null;
	}

	public Object fromJson(String data, JavaType type) {
		try {
			return mapper.readValue(data, type);
		} catch (Exception e) {
			logger.error("Failed to parse Json: " + e.getMessage(), e);
		}
		return null;
	}

	public Object fromJson(String data, Class<?> outerType, Class<?> innerType) {
		try {
			JavaType type = this.constructParametricType(outerType, innerType);
			return mapper.readValue(data, type);
		} catch (Exception e) {
			logger.error("Failed to parse Json: " + e.getMessage(), e);
		}
		return null;
	}

	public Object fromJson(String data, Class<?> outerType, Class<?> middleType, Class<?> innerType) {
		try {
			JavaType type = this.constructParametricType(outerType, this.constructParametricType(middleType, innerType));
			return mapper.readValue(data, type);
		} catch (Exception e) {
			logger.error("Failed to parse Json: " + e.getMessage(), e);
		}
		return null;
	}

	public Object fromJson(String data, Class<?> outerType, Object innerType) {
		try {
			if (innerType instanceof Class) {
				JavaType type = this.constructParametricType(outerType, (Class<?>) innerType);
				return mapper.readValue(data, type);
			} else if (innerType instanceof JavaType) {
				JavaType type = this.constructParametricType(outerType, (JavaType) innerType);
				return mapper.readValue(data, type);
			} else if (innerType instanceof TypeReference) {
				JavaType type = this.constructParametricType(outerType, (TypeReference<?>) innerType);
				return mapper.readValue(data, type);
			} else {
				throw new IllegalArgumentException("Invalid argument type.");
			}
		} catch (Exception e) {
			logger.error("Failed to parse Json: " + e.getMessage(), e);
		}
		return null;
	}

	public JavaType constructJavaType(Class<?> clazz) {
		return mapper.getTypeFactory().constructType(clazz);
	}

	public JavaType constructParametricType(Class<?> container, Class<?>... content) {
		return mapper.getTypeFactory().constructParametrizedType(container, container, content);
	}

	public JavaType constructParametricType(Class<?> container, JavaType... content) {
		return mapper.getTypeFactory().constructParametrizedType(container, container, content);
	}

	public JavaType constructParametricType(Class<?> container, TypeReference<?> content) {
		JavaType type = mapper.getTypeFactory().constructType(content);
		return mapper.getTypeFactory().constructParametrizedType(container, container, type);
	}
}