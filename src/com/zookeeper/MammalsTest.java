package com.zookeeper;

public class MammalsTest {
	
	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		
		gorilla1.climb();
		
		System.out.println(gorilla1.displayEnergy());
	}
}
