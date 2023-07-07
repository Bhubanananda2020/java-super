package com.bhubanananda;

/**
 * The Class ReferParentClassInstanceVariable.
 *
 * @author Bhubanananda
 */
public class ReferParentClassInstanceVariable extends Feature {

	/** The color. */
	String color = "black";

	/**
	 * Prints the color.
	 */
	void printColor() {
		System.out.println("Current class : " + color);// prints color of Dog class
		System.out.println("Current class : " + this.color);// prints color of Dog class
		System.out.println("Parent class : " + super.color);// prints color of Feature class
	}

	{
		color = "RED";
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new ReferParentClassInstanceVariable().printColor();

	}

}

class Feature {
	String color = "white";

}
