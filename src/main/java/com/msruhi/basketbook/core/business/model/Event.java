package com.msruhi.basketbook.core.business.model;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public abstract class Event {
	@NonNull
	private String eventName;
	@NonNull
	private GameTime gameTime;
	
    private Correction correction;
	
	
}
