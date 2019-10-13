package com.msruhi.basketbook.core.business.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Coach extends Person {
	

	public Coach(@NonNull String given_name, @NonNull String surname) {
		super(given_name, surname);
		// TODO Auto-generated constructor stub
	}
	@NonNull
	private String licenseLevel;
	@NonNull
	private Integer licenseNumber;
	 
}
