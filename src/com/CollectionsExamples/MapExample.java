package com.CollectionsExamples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String []args) {
		Map<String,String> lang = new HashMap<>();
		
		//When inputting a new value into a map the old value gets overwritten
		lang.put("Java","High Level compiled language");
		lang.put("C++","Low Level compiled");
		System.out.println(lang.put("Python","High Level Data manipulation language"));
		System.out.println(lang.put("LISP","Hard Language"));
		lang.put("Algol","Algorithmic languages");
		
		System.out.println(lang.get("Java"));
		System.out.println(lang.get("LISP"));
		
		//When a put is called on a value that already exists it will return the 
		//current value stored in there. 
		System.out.println(lang.put("Python","New input"));
		System.out.println(lang.put("LISP","new Input"));
		
		
		if(lang.containsKey("Java")) {
			System.out.println("Java already exists");
		}else {
			System.out.println("Java being exists");
		}
		
		
		System.out.println("============================");
		
		
		lang.remove("LISP");
		
		
		if(lang.remove("Algol", "Algorithmic languages that will not be removed")) {
			System.out.println("Algol removed");
		}else {
			System.out.println("Algol not removed, key/value pair not found");
		}
		
		
		
		
		for(String key: lang.keySet()) {
			System.out.println(key + " : "+lang.get(key));
		}
		
		
	}

}
