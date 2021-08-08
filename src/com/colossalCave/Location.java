                                                                   package com.colossalCave;

import java.util.HashMap;
import java.util.Map;

public class Location {
	
	/*
	 * 
    	1) Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
    	2) Make all fields final and private.
    	3) Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final. 
    	4) A more sophisticated approach is to make the constructor private and construct instances in factory methods.
    	   If the instance fields include references to mutable objects, don't allow those objects to be changed:
    	           
           - Don't provide methods that modify the mutable objects.
           
           - Don't share references to the mutable objects.
            
           - Never store references to external, mutable objects passed to the constructor; 
             if necessary, create copies, and store references to the copies. 
             
           - Similarly, create copies of your internal mutable objects when necessary to avoid 
             returning the originals in your methods.

	 */
	
	
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
