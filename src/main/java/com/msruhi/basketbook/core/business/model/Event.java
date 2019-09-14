package com.msruhi.basketbook.core.business.model;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@EqualsAndHashCode
public abstract class Event {
	private GameTime gameTime;
    private Correction correction;
}
