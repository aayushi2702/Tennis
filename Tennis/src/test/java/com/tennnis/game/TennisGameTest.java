package com.tennnis.game;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TennisGameTest {
	
	private final TennisGame tennisGame = new TennisGame("PlayerOne","PlayerTwo");
	
	@Test
    public void LoveAllTest() {
		assertThat(tennisGame.getGameScore()).isEqualTo("Love All");
    }
}
