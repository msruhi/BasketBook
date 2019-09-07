package com.msruhi.basketbook.business.model;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class GameTime implements Comparable<GameTime> {
	Period period;
	LocalTime localTime;

	@Override
	public int compareTo(GameTime gameTime) {
		return this.localTime.compareTo(gameTime.getLocalTime());
	}
}
