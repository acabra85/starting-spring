package main.java.hello;

import org.joda.time.LocalTime;

public class HelloWorld {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime.);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
		String w1 = "aaaagussttiinnmcbrreo";
		String w2 = "agustincabrasarmiento";
		System.out.println("Is Anagram " + w1 + " " + 
				w2 + ": " + isAnagram(w1, w2));
    }
	
	/*
	params: 
	return: describes true if a word2 is made from letters of word1 and false otherwise
	*/
	public static boolean isAnagram(String word1, String word2) {
		int tempIndex = -1;
	//	int lengthLettersFound = 0;
		if(word2.length() > word1.length())//word2 is larger than word 1
			return false;
		for(int j=0;j<word2.length();j++ ) {
			tempIndex = itBelongsToWord(word2.charAt(j), word1);
			System.out.println(word2.charAt(j) + " :" + word1  + " : "+  tempIndex);
			if(tempIndex != -1) {
				word1 = findAndRemove(tempIndex, word1);
	//lengthLettersFound ++;
			} else {
				return false;
			}
		}
	//	return (lengthLettersFound == word2.length);
		return true;
	}

	/*
		return: String result of removing the character at index ‘index’
	*/
	public static String findAndRemove(int index, String word) {
		String resultString =  "";
		for(int j=0;j<word.length() ;j++ ) {
			if(index != j)
				resultString += word.charAt(j);
		}
		return resultString;
	}

	/*
		return: int, the index of where the character was found or -1 if it wasn’t found
	*/
	public static int itBelongsToWord(char c, String word){
		int index = -1;
		for(int j=0;j<word.length();j++ ) {
			if(word.charAt(j) == c) {
				return j;		
			}
		}
		return index;
	}

}
