package com.bootcamp.pt1.difficult_theory_question_examples;

public class TheoryDifficultExample_Q11_Constructors_Car {

	// What is a constructor in Java? Provide an example to explain its use.

	String model;
	int year;

	// Constructor for the Class
	public TheoryDifficultExample_Q11_Constructors_Car(String carModel, int carYear) {
		model = carModel;
		year = carYear;
	}

	public static void main(String[] args) {
		// Creating a Car object and using the constructor to set initial values
		TheoryDifficultExample_Q11_Constructors_Car myCar = new TheoryDifficultExample_Q11_Constructors_Car("Toyota",
				2023);
		System.out.println("Model: " + myCar.model + ", Year: " + myCar.year);
	}
}