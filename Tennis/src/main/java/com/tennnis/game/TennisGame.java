package com.tennnis.game;

public class TennisGame {

	static final String SCORE_LOVE_ALL = "Love All";
	static final String SCORE_FIFTEEN_ALL = "Fifteen All";
	static final String SCORE_THIRTY_ALL = "Thirty All";
	private static final String SCORE_DEUCE = "Deuce";
	private int playerOneScore;
	private int playerTwoScore;

	public TennisGame(String playerOne, String playerTwo) {
		
	}

	public String getGameScore() {
		if(playerOneScore == playerTwoScore) {
			if(playerOneScore == 0) {
				return SCORE_LOVE_ALL;
			}
			else if(playerOneScore == 1) {
				return SCORE_FIFTEEN_ALL;
			}
			else if(playerOneScore == 2) {
				return SCORE_THIRTY_ALL;
			}
			else {
				return SCORE_DEUCE;
			}
		}
		return SCORE_LOVE_ALL;
	}

	public void playerOneScored() {
		playerOneScore++;

	}

	public void playerTwoScored() {
		playerTwoScore++;
	}

}
