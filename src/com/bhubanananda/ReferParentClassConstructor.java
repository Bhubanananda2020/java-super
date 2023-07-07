package com.bhubanananda;

/**
 * The Class ReferParentClassConstructor.
 *
 * @author Bhubanananda
 */
public class ReferParentClassConstructor {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new Dog();
	}
}

class Animal {
	Animal() {
		System.out.println("animal is created");
	}
}

class Dog extends Animal {
	Dog() {
		super();
		System.out.println("dog is created");
	}
}