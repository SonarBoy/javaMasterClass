package com.colossalCave;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NewDemo {
	
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<String, HeavenlyBody>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		 HeavenlyBody tempHeavenlyBody = new HeavenlyBody("Mercury", 88);
	        solarSystem.put(tempHeavenlyBody.getName(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new HeavenlyBody("Venus", 225);
	        solarSystem.put(tempHeavenlyBody.getName(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new HeavenlyBody("Earth", 365);
	        solarSystem.put(tempHeavenlyBody.getName(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        tempHeavenlyBody.addMoon(tempMoon);

	        tempHeavenlyBody = new HeavenlyBody("Mars", 687);
	        solarSystem.put(tempHeavenlyBody.getName(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempMoon = new HeavenlyBody("Deimos", 1.3);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        tempHeavenlyBody.addMoon(tempMoon); // temp is still Mars

	        tempMoon = new HeavenlyBody("Phobos", 0.3);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        tempHeavenlyBody.addMoon(tempMoon); // temp is still Mars

	        tempHeavenlyBody = new HeavenlyBody("Jupiter", 4332);
	        solarSystem.put(tempHeavenlyBody.getName(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempMoon = new HeavenlyBody("Io", 1.8);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        tempHeavenlyBody.addMoon(tempMoon); // temp is still Jupiter

	        tempMoon = new HeavenlyBody("Europa", 3.5);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        tempHeavenlyBody.addMoon(tempMoon); // temp is still Jupiter

	        tempMoon = new HeavenlyBody("Ganymede", 7.1);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        tempHeavenlyBody.addMoon(tempMoon); // temp is still Jupiter

	        tempMoon = new HeavenlyBody("Callisto", 16.7);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        tempHeavenlyBody.addMoon(tempMoon); // temp is still Jupiter

	        tempHeavenlyBody = new HeavenlyBody("Saturn", 10759);
	        solarSystem.put(tempHeavenlyBody.getName(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new HeavenlyBody("Uranus", 30660);
	        solarSystem.put(tempHeavenlyBody.getName(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new HeavenlyBody("Neptune", 165);
	        solarSystem.put(tempHeavenlyBody.getName(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new HeavenlyBody("Pluto", 248);
	        solarSystem.put(tempHeavenlyBody.getName(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        System.out.println("Planets");
	        for(HeavenlyBody planet : planets) {
	            System.out.println("\t" + planet.getName());
	        }

	        HeavenlyBody body = solarSystem.get("Mars");
	        System.out.println("Moons of " + body.getName());
	        for(HeavenlyBody jupiterMoon: body.getSatellites()) {
	            System.out.println("\t" + jupiterMoon.getName());
	        }

	        Set<HeavenlyBody> moons = new HashSet<>();
	        for(HeavenlyBody planet : planets) {
	            moons.addAll(planet.getSatellites());
	        }

	        System.out.println("All Moons");
	        for(HeavenlyBody moon : moons) {
	            System.out.println("\t" + moon.getName());
	        }


	}

}
