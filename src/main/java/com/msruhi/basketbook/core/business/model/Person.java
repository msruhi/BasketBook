package com.msruhi.basketbook.core.business.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@Getter
@EqualsAndHashCode
public abstract class Person {
	@NonNull
	private String given_name;
	@NonNull
    private String surname;
}
