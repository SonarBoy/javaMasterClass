package com.colossalCave;

import java.util.HashSet;
import java.util.Set;

public class SetWorkOut {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		
		
		for(int r = 1; r < 10; r++) {
			setA.add(r);
			
			if(r % 2 == 0) {
				setB.add(r);
			}
		}
		
		for(int r = 10; r < 20; r++) {
			
			if(r % 2 == 0) {
				setB.add(r);
			}
		}
		
		System.out.println("Set A");
		for(Integer x : setA) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Set B");
		for(Integer x : setB) {
			System.out.println(x);
		}
		
		
		System.out.println();
		System.out.println();
		
		Set<Integer> union = new HashSet<Integer>(setA);
		union.addAll(setB);
		
		System.out.println("Union");
		for(Integer x : union) {
			System.out.println(x);
		}
		
		
		System.out.println();
		System.out.println();
		
		Set<Integer> intersection = new HashSet<Integer>(setA);
		intersection.retainAll(setB);
		
		System.out.println("Intersection");
		for(Integer x : intersection) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println();
		
		Set<Integer> asymetricDiff = new HashSet<Integer>(setA);
		asymetricDiff.removeAll(setB);
		
		System.out.println("Asymetric Difference");
		for(Integer x : asymetricDiff) {
			System.out.println(x);
		}
		
	}

}
