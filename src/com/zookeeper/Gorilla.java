package com.zookeeper;

class Gorilla extends Mammals{
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("The Gorilla threw something and lost 5 energy");
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The Gorilla ate a banana and gained 10 energy");
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("The Gorilla climbed something and lost 10 energy");
	}

	
}
