package com.msruhi.basketbook.core.business.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
/**
 * 
 * @author Ruhi, Mehmet Sezgin
 *
 */
@Getter
@ToString
@EqualsAndHashCode
public abstract class Event {
	@NonNull
	private GameTime gameTime;
	@NonNull
    private Correction correction;
	/**
	 * @param gameTime
	 * @param correction
	 */
	public Event(@NonNull GameTime gameTime, @NonNull Correction correction) {
		this.gameTime = gameTime;
		this.correction = correction;
	}
	
	
}
