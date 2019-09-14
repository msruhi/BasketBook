package com.msruhi.basketbook.core.business.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Referee extends Person {
	
	/**
	 * @param given_name
	 * @param surname
	 * @param licenseLevel
	 * @param licenseNumber
	 */
	public Referee(@NonNull String given_name, @NonNull String surname, @NonNull String licenseLevel,
			@NonNull Integer licenseNumber) {
		super(given_name, surname);
		this.licenseLevel = licenseLevel;
		this.licenseNumber = licenseNumber;
	}
	@NonNull
	private String licenseLevel;
	@NonNull
	private Integer licenseNumber;
}
