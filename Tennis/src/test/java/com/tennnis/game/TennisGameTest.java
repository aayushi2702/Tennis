package com.tennnis.game;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TennisGameTest {

	private TennisGame tennisGame;

	@BeforeEach
	public void setUp() {
		tennisGame = new TennisGame("PlayerOneName", "PlayerTwoName");
	}

	@ParameterizedTest
	@CsvSource({
		"0,0,Love All" ,
		"1,1,Fifteen All",
		"2,2,Thirty All" 
	})
	void parameterizedTestCaseforEachTest(int playerOneScore, int playerTwoScore, String expectedScore) {
		for(int i=0; i<playerOneScore; i++) {
			tennisGame.playerOneScored();
		}
		for(int i=0; i<playerTwoScore; i++) {
			tennisGame.playerTwoScored();
		}
		assertThat(tennisGame.getGameScore()).isEqualTo(expectedScore);
	}

}
