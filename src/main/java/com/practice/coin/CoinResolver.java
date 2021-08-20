package com.practice.coin;

public class CoinResolver {
	
	
	/**
	 * Converts an amount in pounds into a into a string that represents its composition in coins from greatest to lowest
	 * @param the string that represents the amount. The format of the amount is
	 *    <ul>
	 *    	<li>An number in integer format (e.g. 200)</li>
	 *    	<li>An number in double format (e.g. 200.00)</li>
	 *    	<li>The pound symbol and an amount in pounds in either integer or double format (e.g.: £20, £20.01) </li>
	 *    </ul>
	 * @return a string that represents the input amount in coins
	 * @throws Exception 
	 */
	public String getCoinsInfo(String input) {
		
		if (input == null || input.length()==0) {
			throw new RuntimeException("Wrong length");
		}
		
		
		
		return null;
	}

}
