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
public class Foul extends Event{
	@NonNull
	private Player player;
	@NonNull
	private Type foulType;
	
	/**
	 * @param gameTime
	 * @param correction
	 * @param player
	 * @param foulType
	 */
	public Foul(@NonNull GameTime gameTime, @NonNull Correction correction, @NonNull Player player, @NonNull Type foulType) {
		super(gameTime, correction);
		this.player = player;
		this.foulType = foulType;
	}

	@ToString
	public enum Type {
		TECHNICAL, PERSONAL, UNSPORTSMANLIKE, OFFENSIVE, DOUBLE, DISQUALIFICATION;
	}
	
	
	
}
