package com.InterfacesExamples;

import java.util.ArrayList;
import java.util.Collections;

import com.Generics.Team;

public class League<T extends Team<?>>   {
	
	public String name;
	private ArrayList<T> league = new ArrayList<T>();
	
	public League(String n) {
		this.name = n;
	}
	
	
	public boolean add(T team) {
		if(league.contains(team)) {
			return false;
		}
		
		league.add(team);
		return true;
	}
	
	public void showLeagueTable() {
		Collections.sort(league);
	}

}
