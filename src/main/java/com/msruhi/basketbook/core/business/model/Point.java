package com.msruhi.basketbook.core.business.model;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;

import com.msruhi.basketbook.core.configs.PointProperties;

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
	
	@Autowired
	PointProperties pointProperties;
	
	/**
	 * @param gameTime
	 * @param correction
	 * @param pointValue
	 * @param player
	 */
	public Point(GameTime gameTime, Correction correction, @NonNull Player player, @NonNull String pointName) {
		super(gameTime, correction);
		this.pointValue = pointProperties.getPointProperties()
											.stream()
											.flatMap(pointProperty -> pointPropertyList.)
											.filter();
		this.player = player;
	}
	
	@NonNull
	private Player player;
	@NonNull
	@Min(value = 1)
	private Integer pointValue;
}
