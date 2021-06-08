package com.Generics;

import java.util.ArrayList;

//Input T in the diamond to create a type parameter
//extending player forces you to put in an object that you can use.  
//In other words it is said that player is the upper bound of T.
public class Team<T extends Player> implements Comparable<Team<T>> {
	
	private String name;
	
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();
	
	
	public Team (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean addPlayer(T player) {
		
		
		
		if(members.contains(player)) {
			System.out.println("Player Already Present: " + player.getName());
			return false;
		}else {
			members.add(player);
			System.out.println("Player "+ player.getName() +" is on "+this.name);
			return true;
		}
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	//the Team<T> forces the teams to be the same otherwise there will be an error.
	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		
		if(ourScore > theirScore) {
			won++;
		}else if(ourScore == theirScore) {
			tied++;
		}else {
			lost++;
		}
		
		played++;
		
		if(opponent != null) {
			opponent.matchResult(null,theirScore,ourScore);
		}
		
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}


	@Override
	public int compareTo(Team<T> team) {
		
		if(this.ranking() > team.ranking()) {
			return -1;
		}else if(this.ranking() < team.ranking()) {
			return 1;
		}else {
			return 0;
		}
		
		
	}
}
