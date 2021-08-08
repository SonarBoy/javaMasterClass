package com.colossalCave;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		
		//NOTE: The following functions modify the underlying set 
		//so we will be creating a new set for each of the operations. 
		Set<Integer> squares = new HashSet<Integer>();
		Set<Integer> cubes = new HashSet<Integer>();
		
		
		for(int runner = 1; runner <= 100;runner++) {
			squares.add(runner * runner);
			cubes.add(runner * runner * runner);
		}
		
		
		System.out.println("There are " + squares.size() + " squares and " + cubes.size());
		
		// Initializes the union set with the values in the squares set.
		// Transforms s1 into the union of s1 and s2. (The union of two sets 
		// is the set containing all of the elements contained in either set.)
		Set<Integer> union = new HashSet<Integer>(squares);
		union.addAll(cubes);
		
		System.out.println("Union of the squares and cubes set: " + union.size());
		
		
		//Initializes the union set with the values in the squares set.
		//Transforms s1 into the intersection of s1 and s2. 
		//(The intersection of two sets is the set containing 
		//only the elements common to both sets.)
		Set<Integer> intersection = new HashSet<Integer>(squares);
		intersection.retainAll(cubes);
		
		System.out.println("Union of the squares and cubes set: " + intersection.size());
		System.out.println();
		for(int i : intersection) {
			System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of "+ Math.cbrt(i) );
		}
		
		
		
		
		
		Set<String> words = new HashSet<String>();
		String sentence = "One day in the year of the fox";
		String [] arrayWords = sentence.split(" ");
		
		words.addAll(Arrays.asList(arrayWords));
		System.out.println();
		
		for(String i : words) {
			System.out.println(i );
		}
		
		
		
		
		
		Set<String> nature = new HashSet<String>();
		Set<String> divine = new HashSet<String>();
		
		sentence = "All nature is but art unknown to three";
		arrayWords = sentence.split(" ");
		
		nature.addAll(Arrays.asList(arrayWords));
		
		String divineSentence = "To err is human to forgive divine";
		String [] divineArrayWords = divineSentence.split(" ");
		
		divine.addAll(Arrays.asList(divineArrayWords));
		
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Nature - Divine: ");
		Set<String> diffOne = new HashSet<String>(nature);
		diffOne.removeAll(divine);
		
		for(String i : diffOne) {
			System.out.print(i + " ");
		}
		
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Divine - Nature: ");
		Set<String> diffTwo = new HashSet<String>(divine);
		diffTwo.removeAll(nature);
		
		for(String i : diffTwo) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Common Between Divine and Nature Asymetric difference: ");
		Set<String> diffThree = new HashSet<String>(divine);
		diffThree.retainAll(nature);
		
		for(String i : diffThree) {
			System.out.print(i + " ");
		}
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Common Between Divine and Nature Symetric difference: ");
		Set<String> unionTest = new HashSet<String>(nature);
		unionTest.addAll(divine);
		Set<String> intersectionTest = new HashSet<>(nature);
		intersectionTest.retainAll(divine);
		
		unionTest.removeAll(intersectionTest);
		
		
		
		
		
		System.out.println();
		System.out.println();
		
		for(String i : unionTest) {
			System.out.print(i + " ");
		}
		
		if(nature.containsAll(divine)) {
			System.out.println("Divine is a subset of nature");
		}
		
		if(nature.containsAll(intersectionTest)) {
			System.out.println("Intersection is subset of nature");
		}
		
		if(divine.containsAll(intersectionTest)) {
			System.out.println("Intersection is subset of divine");
		}
	}

}
