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
@EqualsAndHashCode(callSuper = true)
public class TimeOut extends Event{
	
	/**
	 * @param gameTime
	 * @param correction
	 * @param team
	 */
	public TimeOut(GameTime gameTime, Correction correction, @NonNull Team team) {
		super("Timeout(" + team.getName() + ")", gameTime, correction);
		this.team = team;
	}
	@NonNull
	private Team team;
}
