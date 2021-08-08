package com.colossalCave;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.colossalCave.HeavenlyBody.BodyType;

public class NewDemo {
	
	private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<HeavenlyBody.Key, HeavenlyBody>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		 HeavenlyBody tempHeavenlyBody = new Planet("Mercury", 88);
	        solarSystem.put(tempHeavenlyBody.getKey(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new Planet("Venus", 225);
	        solarSystem.put(tempHeavenlyBody.getKey(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new Planet("Earth", 365);
	        solarSystem.put(tempHeavenlyBody.getKey(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        HeavenlyBody tempMoon = new Moon("Moon", 27);
	        solarSystem.put(tempMoon.getKey(), tempMoon);
	        tempHeavenlyBody.addSatellite(tempMoon);

	        tempHeavenlyBody = new Planet("Mars", 687);
	        solarSystem.put(tempHeavenlyBody.getKey(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempMoon = new Moon("Deimos", 1.3);
	        solarSystem.put(tempMoon.getKey(), tempMoon);
	        tempHeavenlyBody.addSatellite(tempMoon); // temp is still Mars

	        tempMoon = new Moon("Phobos", 0.3);
	        solarSystem.put(tempMoon.getKey(), tempMoon);
	        tempHeavenlyBody.addSatellite(tempMoon); // temp is still Mars

	        tempHeavenlyBody = new Planet("Jupiter", 4332);
	        solarSystem.put(tempHeavenlyBody.getKey(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempMoon = new Moon("Io", 1.8);
	        solarSystem.put(tempMoon.getKey(), tempMoon);
	        tempHeavenlyBody.addSatellite(tempMoon); // temp is still Jupiter

	        tempMoon = new Moon("Europa", 3.5);
	        solarSystem.put(tempMoon.getKey(), tempMoon);
	        tempHeavenlyBody.addSatellite(tempMoon); // temp is still Jupiter

	        tempMoon = new Moon("Ganymede", 7.1);
	        solarSystem.put(tempMoon.getKey(), tempMoon);
	        tempHeavenlyBody.addSatellite(tempMoon); // temp is still Jupiter

	        tempMoon = new Moon("Callisto", 16.7);
	        solarSystem.put(tempMoon.getKey(), tempMoon);
	        tempHeavenlyBody.addSatellite(tempMoon); // temp is still Jupiter

	        tempHeavenlyBody = new Planet("Saturn", 10759);
	        solarSystem.put(tempHeavenlyBody.getKey(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new Planet("Uranus", 30660);
	        solarSystem.put(tempHeavenlyBody.getKey(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new Planet("Neptune", 165);
	        solarSystem.put(tempHeavenlyBody.getKey(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        tempHeavenlyBody = new Planet("Pluto", 248);
	        solarSystem.put(tempHeavenlyBody.getKey(), tempHeavenlyBody);
	        planets.add(tempHeavenlyBody);

	        System.out.println("Planets");
	        for(HeavenlyBody planet : planets) {
	            System.out.println("\t" + planet.getName());
	        }

	        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", BodyType.PLANET));
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

	        HeavenlyBody pluto = new Star("Pluto", 842);
	        planets.add(pluto);
	        
	        
	        /*
	         * simple equals method that performs what is known as referential equality.
			 * And if both references point to the same object,
	         */
	        for(HeavenlyBody planet : planets) {
	        	System.out.println(planet);
	            //System.out.println("\t" + planet.getName() + " " + planet.getOrbitalPeriod());
	        }

		
	        HeavenlyBody earth1 = new Planet("Earth",365);
	        HeavenlyBody earth2 = new Planet("Earth",365);
	        System.out.println(earth1.equals(earth2));
	        System.out.println(earth2.equals(earth1));
	        
	        solarSystem.put(pluto.getKey(), pluto);
	        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyType.PLANET)));
	        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyType.STAR)));
	        
	}

}


