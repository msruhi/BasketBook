package com.msruhi.basketbook.core.business.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public abstract class Person {
	@NonNull
	private String given_name;
	@NonNull
    private String surname;
}
