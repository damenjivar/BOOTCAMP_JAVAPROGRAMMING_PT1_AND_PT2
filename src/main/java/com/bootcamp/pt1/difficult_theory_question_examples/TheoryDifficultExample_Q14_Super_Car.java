package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q14_Super_Car extends TheoryDifficultExample_Q14_Super_Vehicle {

	int gear;

	TheoryDifficultExample_Q14_Super_Car(int speed, int gear) {
		super(speed);
		this.gear = gear;
	}

	void displayDetails() {
		super.displaySpeed(); // invoking the superclass method
		System.out.println("Gear: " + gear);
	}
}
