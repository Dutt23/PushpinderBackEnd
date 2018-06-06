package com.stackroute.maverick.domain;

import java.sql.Time;

public class GamePlayed {

	private int gameId;
	private String gameName;
	private String gameStatus; // win / left / defeat / draw
	private Time timeStamp;
	private int rank;
	private String statistics;
	private Opponent opponent[];

	public Opponent[] getOpponent() {
		return opponent;
	}

	public void setOpponent(Opponent[] opponent) {
		this.opponent = opponent;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Time getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Time timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}

	public String getStatistics() {
		return statistics;
	}

	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}

}
