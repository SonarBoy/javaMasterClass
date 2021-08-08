package com.colossalCave;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
//	private final String name;
//	private final BodyType bodyType;
	
	private final Key key;
	
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	
	public enum BodyType{
		STAR,
		COMMET,
		PLANET,
		MOON
	}
	
	
	public HeavenlyBody(String name,double orbitalPeriod, BodyType type) {
		this.key = new Key(name, type);
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<HeavenlyBody>();
		
	}

	public String getName() {
		return this.key.getName();
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	
	public BodyType getBodyType() {
		return this.key.bodyType;
	}
	
	public boolean addSatellite(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	
	public Set<HeavenlyBody> getSatellites(){
		return new HashSet<>(this.satellites);
	}
	
	public Key getKey() {
		return this.key;
	}

	@Override
	public final boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof HeavenlyBody) {
			HeavenlyBody theObject = (HeavenlyBody) obj;
//			if(this.name.equals(theObject.getName())) {
//				return this.bodyType == theObject.getBodyType();
//			}
			
			return this.key.equals(theObject.getKey());
		}
		
		return false;
	}

	public static Key makeKey(String name, BodyType bodyType) {
		return new Key(name,bodyType);
	}
	

	@Override
	public final int hashCode() {
		//return this.name.hashCode() + this.bodyType.hashCode();
		
		return this.key.hashCode();
	}
	
	public String toString() {
		return this.getName() + " : " + this.getBodyType() + " , " +this.orbitalPeriod;
	}
	
	
	public static final class Key{
		private String name;
		private BodyType bodyType;
		
		private Key(String name, BodyType bodyType) {
			this.name = name;
			this.bodyType = bodyType;
		}

		public String getName() {
			return name;
		}

		public BodyType getBodyType() {
			return bodyType;
		}
		
		public int hashCode() {
			return this.name.hashCode() + 57 + this.bodyType.hashCode();
		}
		
		public boolean equals(Object obj) {
			Key key = (Key) obj;
			if(this.name.equals(key.getName())) {
				return (this.bodyType == key.getBodyType());
			}else {
				return false;
			}
		}
	}
	
}
