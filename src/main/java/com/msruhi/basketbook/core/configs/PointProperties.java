package com.msruhi.basketbook.core.configs;

import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.NonNull;

@Configuration
@ConfigurationProperties(prefix = "point")
@Data
public final class PointProperties {
	@NonNull
	private List<PointProperty> pointProperties;
	
	/**
	 * searches for points by name
	 * @param pointName searched name for point value
	 * @return returns the score found otherwise 0
	 */
	public Integer getValue(@NonNull final String pointName) {
	final PointProperty findPointProperty = pointProperties.stream()
						.filter(pointProperty ->pointName.equalsIgnoreCase(pointProperty.getName()))
						.findFirst().orElse(new PointProperty("Points Description not found: 0 value", 0));
		return findPointProperty.getValue();
		
	}
	@Data
	public static class PointProperty{
		@NonNull
		private String name;
		@NonNull
		@Min(value = 0)
		private Integer value;
	}
}
