package com.bhubanananda;

/**
 * The Class ReferParentClassMethod.
 *
 * @author Bhubanananda
 */
public class ReferParentClassMethod extends NewFeature {
	
	/** The color. */
	String color = "black";

	/**
	 * Display color.
	 */
	void displayColor() {
		System.out.println(color);
	}

	/**
	 * Show.
	 */
	void show() {
		this.displayColor();
		super.displayColor();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new ReferParentClassMethod().show();
	}
}

class NewFeature {
	String color = "white";

	void displayColor() {
		System.out.println(color);
	}
}
