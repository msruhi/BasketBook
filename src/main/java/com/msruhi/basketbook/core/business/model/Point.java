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
public class Point extends Event {
	
	/**
	 * @param gameTime
	 * @param correction
	 * @param pointValue
	 * @param player
	 */
	public Point(GameTime gameTime, Correction correction, @NonNull Player player, @NonNull Integer pointValue) {
		super(gameTime, correction);
		this.pointValue = pointValue;
		this.player = player;
	}
	
	@NonNull
	private Player player;
	@NonNull
	private Integer pointValue;
}
