package com.tennnis.game;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	private TennisGame tennisGame;

	@Before
	public void setUp() {
		tennisGame = new TennisGame("PlayerOneName", "PlayerTwoName");
	}

	@Test
	public void LoveAllTest() {
		assertThat(tennisGame.getGameScore()).isEqualTo("Love All");
	}

	@Test
	public void FifteenAllTest() {
		tennisGame.playerOneScored();
		tennisGame.playerTwoScored();
		assertThat(tennisGame.getGameScore()).isEqualTo("Fifteen All");
	}

	@Test
	public void ThirtyAllTest() {
		tennisGame.playerOneScored();
		tennisGame.playerTwoScored();
		tennisGame.playerOneScored();
		tennisGame.playerTwoScored();
		assertThat(tennisGame.getGameScore()).isEqualTo("Thirty All");
	}
}
