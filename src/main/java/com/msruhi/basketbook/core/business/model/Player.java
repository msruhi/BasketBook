package com.msruhi.basketbook.core.business.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Player extends Person {
	
	/**
	 * @param given_name
	 * @param surname
	 * @param jersey
	 * @param participantsIDNumber
	 * @param specialParticipant
	 */
	public Player(@NonNull String given_name, @NonNull String surname, @NonNull Jersey jersey,
			@NonNull Integer participantsIDNumber, @NonNull Boolean specialParticipant) {
		super(given_name, surname);
		this.jersey = jersey;
		this.participantsIDNumber = participantsIDNumber;
		this.specialParticipant = specialParticipant;
	}
	@NonNull
	private Jersey jersey;
	@NonNull
    private Integer participantsIDNumber;
	@NonNull
    private Boolean specialParticipant;
}
