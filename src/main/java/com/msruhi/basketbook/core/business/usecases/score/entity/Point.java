package com.msruhi.basketbook.core.business.usecases.score.entity;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;

import com.msruhi.basketbook.core.business.model.Correction;
import com.msruhi.basketbook.core.business.model.Event;
import com.msruhi.basketbook.core.business.model.GameTime;
import com.msruhi.basketbook.core.business.model.Player;
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
	 * @param player
	 */
	public Point(@NonNull final String pointName, @NonNull GameTime gameTime, @NonNull Correction correction,
			@NonNull Player player) {
		super("Point(" + pointName + ")", gameTime, correction);
		this.player = player;
		pointValue = pointProperties.getValue(pointName);
	}

	@NonNull
	private Player player;
	@NonNull
	@Min(value = 1)
	private Integer pointValue;
}
