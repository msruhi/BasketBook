package com.msruhi.basketbook.business.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Jersey implements Comparable<Jersey> {
	@NonNull
	private Integer number;

	@Override
	public int compareTo(Jersey jersey) {
		return this.number.compareTo(jersey.getNumber());
	}
}
