package com.practice.coin;

import org.junit.Test;

public class CoinResolverTest {
	
	
	private CoinResolver coinResolver = new CoinResolver();
	
	@Test(expected = RuntimeException.class)
	public void testInvalidInputLength() {
		String input = "";
		String result = coinResolver.getCoinsInfo(input);
	}

}
