package com.msruhi.basketbook.core.business.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
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
	private Player player;
	private Type foulType;
	
	/**
	 * @param gameTime
	 * @param correction
	 * @param player
	 * @param foulType
	 */
	public Foul(GameTime gameTime, Correction correction, Player player, Type foulType) {
		super(gameTime, correction);
		this.player = player;
		this.foulType = foulType;
	}

	@ToString
	public enum Type {
		TECHNICAL, PERSONAL, UNSPORTSMANLIKE, OFFENSIVE, DOUBLE, DISQUALIFICATION;
	}
	
	
	
}
