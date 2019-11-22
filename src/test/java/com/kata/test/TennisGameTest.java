package com.kata.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.kata.Player;
import com.kata.TennisGame;

public class TennisGameTest {

	Player playerOne;

	Player playerTwo;

	TennisGame tennisGame;

	@Before
	public void beforeTennisGameTest() {
		playerOne = new Player();
		playerTwo = new Player();
		playerOne.setName("Dhileepan");
		playerTwo.setName("Suresh");
		tennisGame = new TennisGame();
	}

	@Test
	public void testNewTennisGameShouldReturnLOVEAll() {

		playerOne.setScore(0);
		playerTwo.setScore(0);
		assertEquals("LOVE All", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerOneWinsFirstBall() {
		playerOne.setScore(1);
		playerTwo.setScore(0);
		assertEquals("FIFTEEN,LOVE", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerOneWinsFirstTwoBalls() {
		playerOne.setScore(2);
		playerTwo.setScore(0);
		assertEquals("THIRTY,LOVE", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerOneWinsFirstThreeBalls() {
		playerOne.setScore(3);
		playerTwo.setScore(0);
		assertEquals("FORTY,LOVE", tennisGame.getScore(playerOne, playerTwo));
	}

}
