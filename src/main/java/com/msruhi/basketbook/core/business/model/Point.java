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
public class Point extends Event {
	
	/**
	 * @param gameTime
	 * @param correction
	 * @param pointValue
	 * @param player
	 */
	public Point(GameTime gameTime, Correction correction, Integer pointValue, Player player) {
		super(gameTime, correction);
		this.pointValue = pointValue;
		this.player = player;
	}
	private Integer pointValue;
	private Player player;
}
