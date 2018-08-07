/*Problem: Write a program that when given a string returns all palindromes in the string*/
package pallindromeWhiteBoard;
import java.util.*;

public class Pallandrome {
	
	//Pre: Takes a string
	//Post: Returns an ArrayList of all the palindromes contained in the list
	public ArrayList<String> getAllPallandromes(String pallandrome){
		ArrayList<String> pals = new ArrayList<String>();
		for(int i = 0;i<=pallandrome.length();i++){
			for(int j =i;j<=pallandrome.length();j++){
				String sub = pallandrome.substring(i, j);
				if(checkPallandrome(sub)&&!pals.contains(sub)){
					pals.add(sub);
				}
			}
		}
		return pals;
	}
	
	//Pre: Takes a string
	//Post: Returns a boolean, true if the string is a palindrome.
	public static boolean checkPallandrome(String sub){
		if(sub.isEmpty()){
			return false;
		}
		int j = sub.length()-1;
		for(int i =0;i<(sub.length()+1)/2;i++){
			if(Character.toLowerCase(sub.charAt(i)) != Character.toLowerCase(sub.charAt(j))){
				return false;
			}
			j--;
		}
		return true;
	}
}
