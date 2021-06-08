package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

	private String name;
	private String attack;
	private String location;
	
	
	public Monster(String n, String a, String l) {
		this.name = n;
		this.attack = a;
		this.location = l;
	}
	
	
	@Override
	public String toString() {
		return "Monster [name=" + name + ", attack=" + attack + ", location=" + location + "]";
	}


	@Override
	public void read(List<String> values) {
		if(values != null && values.size() != 0) {
			this.name = values.get(0);
			this.attack = values.get(1);
			this.location = values.get(2);
		}
		
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		
		values.add(this.name);
		values.add(this.attack);
		values.add(this.location);
		
		return values;
	}
	
	public String getName() {
		return name;
	}


	public String getAttack() {
		return attack;
	}


	public String getLocation() {
		return location;
	}


	

}
