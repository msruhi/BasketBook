package com.msruhi.basketbook.core.business.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Coach extends Person {
	private String licenseLevel;
	private Integer licenseNumber;
}
