package com.msruhi.basketbook.business.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Player extends Person {
	@NonNull
	private Jersey jersey;
	@NonNull
    private Integer participantsIDNumber;
	@NonNull
    private Boolean specialParticipant;
}
