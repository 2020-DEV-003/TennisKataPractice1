package com.kata;

import com.kata.util.Points;
import com.kata.util.Score;

/**
 * 
 * Description : This class contain logic for Tennis Game
 *
 */
public class TennisGame {

	public String getScore(Player playerOne, Player playerTwo) {
		int playerOneScore = playerOne.getScore();
		int playerTwoScore = playerTwo.getScore();

		if (playerOneScore >= 4 && playerTwoScore == playerOneScore - 2) {
			return playerOne.getName() + Score.WINS.value;
		}
		if (playerTwoScore >= 4 && playerOneScore == playerTwoScore - 2) {
			return playerTwo.getName() + Score.WINS.value;
		}

		if (isAll(playerOneScore, playerTwoScore)) {
			return Points.get(playerOne.getScore()) + Score.ALL.value;
		}
		return Points.get(playerOne.getScore()) + "," + Points.get(playerTwoScore);
	}

	private boolean isAll(int playerOneScore, int playerTwoScore) {
		if (playerOneScore == playerTwoScore && playerOneScore <= 3) {
			return true;
		}

		return false;
	}

}
