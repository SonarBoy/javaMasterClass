package com.debugging;

public class Utilities {
	
	private String inputString;
	

	
	//Returns a char array containing every nth char. When 
	//sourceArray.length < n returns sourceArray.
	
	public char[] everyNthChar(char [] sourceArray, int n) {
		
		if(sourceArray == null || sourceArray.length < n) {
			return sourceArray;
		}
		
		int returnedLength = sourceArray.length / n;
		char [] results = new char[returnedLength];
		int index = 0;
		
		for(int i = n - 1; i < sourceArray.length; i += n) {
			results[index++] = sourceArray[i];
		}
		
		return results;
	}
	
	//Removes pairs of the same charater that are next to each other 
	// by removing one ouccrence of the character.
	// AABBCC = ABC
	public String removePairs(String source) {
		
		if(source.length() < 2 || source == null) {
			return source;
		}
		
		StringBuilder sb = new StringBuilder();
		
		char[] string = source.toCharArray();
		
		for(int i = 0, j = 1; j < string.length;i++,j++) {
			
			if(string[i] != string[j]) {
				sb.append(string[i]);
			}
			
//			if(j == string.length - 1 && string[i] == string[j] ) {
//				sb.append(string[j]);
//			}
			
		}
		
		sb.append(string[string.length - 1]);
		
		return sb.toString();
	}
	
	public int converter(int a, int b) {
		return (a/b) + (a * 30) - 2;
	}
	
	public String nullIfOddLength(String source) {
		if(source.length() % 2  == 0) {
			return source;
		}
		
		return null;
	}
	
}
