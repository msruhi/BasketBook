/**
 * 
 */
package com.msruhi.basketbook.core.business.model;

/**
 * @author "Ruhi, Mehmet Sezgin"
 *
 */
@FunctionalInterface
public interface Fouled <FoulType, Player> {
	public Player fouled(FoulType foulType, Player player);
}
