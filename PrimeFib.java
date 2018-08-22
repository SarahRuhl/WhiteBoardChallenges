/*
Problem: Given a number N, you need to find if N is fibonacci-prime number or not. 
A fibonacci-prime is any number that is both a prime and a fibonacci number.
Original Problem @ https://practice.geeksforgeeks.org/problems/the-fibonacci-prime-number/0
*/

import java.util.*;
public class PrimeFib {
	//Fields are used for dynamic programming
	private HashMap<Integer,Boolean> storeFib;
	private HashMap<Integer,Boolean> storePrime;
	
	//Post: Creates a new Prime-Fibinnoci Finder Object
	public PrimeFib(){
		storeFib = new HashMap<Integer,Boolean>();
		storePrime =new HashMap<Integer,Boolean>();
		storeFib.put(0, true);
		storeFib.put(1,true);
	}
	
	//Pre: Takes an int
	//Post: Prints out a 1 if int is a Prime and Fib, 0 if not.
	public void isPrimeNFid(int testNum){
		if(isPrime(testNum)&&isFib(testNum)){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
	
	//Pre: Takes an int
	//Post: Returns if it is prime
	private boolean isPrime(int testNum){
		if(storePrime.containsKey(testNum)){
			return storePrime.get(testNum);
		}
		if(testNum ==1||testNum==2){
			storePrime.put(testNum, true);
			return true;
		}
		if(testNum %2==0){
			storePrime.put(testNum, false);
			return false;
		}
		for(int i = 3; i<Math.sqrt(testNum);i+=2){
			if(testNum%i == 0){
				storePrime.put(testNum, false);
				return false;
			}
		}
		storePrime.put(testNum, true);
		return true;
	}
	
	//Pre: Takes an int
	//Post:Returns if int is a fib
	private boolean isFib(int testNum){
		if(storeFib.containsKey(testNum)){
			return storeFib.get(testNum);
		}
		int first =0;
		int second =1;
		int temp = first+second;
		while(temp<=testNum){
			if(temp == testNum){
				storeFib.put(testNum, true);
				return true;
			}
			first = second;
			second = temp;
			temp= first+second;
		}
		return false;
	}
}
