                                                                   package com.colossalCave;

import java.util.HashMap;
import java.util.Map;

public class Location {
	

	private int locationID;
	private String Description;
	private Map<String, Integer> exits;
	
	
	public Location(int locId,String desc, Map<String,Integer> exits) {
		this.locationID = locId;
		this.Description = desc;
		
		if(exits != null) {
			this.exits = new HashMap<String,Integer>(exits);
		}else {
			this.exits = new HashMap<String,Integer>();
		}
		this.exits.put("Q",0);
	}
	
	
	public String getDescription() {
		return Description;
	}

	public void setDescription(String dESCRIPTION) {
		Description = dESCRIPTION;
	}


	public void setExits(Map<String, Integer> exits) {
		this.exits = exits;
	}
	
	public int getLocationID() {
		return locationID;
	}


	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	
	
	public Map<String,Integer> getExits(){
		return new HashMap<String,Integer>(exits);
	}
}
