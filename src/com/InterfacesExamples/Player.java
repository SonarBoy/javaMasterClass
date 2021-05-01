package com.InterfacesExamples;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
	
	private String name;
	private int rank;
	private String game;
	
	public Player(String n , int r, String g) {
		this.name = n;
		this.rank = r;
		this.game = g;
	}
	

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", game='" + game + '\'' +
                '}';
    }
	
	@Override
	public void read(List<String> values) {
		if(values != null  && values.size() != 0) {
			this.name = values.get(0);
			this.rank = Integer.parseInt(values.get(1));
			this.game = values.get(2);
		}else{
			System.out.println("Players values was empty");
		}
		
	}
	@Override
	public List<String> write() {
		
		List<String> values = new ArrayList<String>();
		
		values.add(name);
		values.add(rank +"");
		values.add(game);
		
		return values;
	}
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getRank() {
		return rank;
	}




	public void setRank(int rank) {
		this.rank = rank;
	}




	public String getGame() {
		return game;
	}




	public void setGame(String game) {
		this.game = game;
	}

	

	
	
}
