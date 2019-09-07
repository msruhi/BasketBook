package com.msruhi.basketbook.business.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Foul {
	private Player player;
	private Type foulType;
	
	@ToString
	public enum Type {
		TECHNICAL, PERSONAL, UNSPORTSMANLIKE, OFFENSIVE, DOUBLE, DISQUALIFICATION;
	}
	
	
	
}
