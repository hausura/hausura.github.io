package com.patterns.adapter.example;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new Mallard();
		Bird sparrow = new Sparrow();
		Duck toy = new PlasticDuck();


		Bird birdAdapter = new DuckAdapter(toy);

		System.out.println("Mallard: ");
		mallard.fly();
		mallard.quark();

		System.out.println("Sparrow:");
		sparrow.fly();
		sparrow.squeak();

		System.out.println("BirdAdapter:");
		birdAdapter.fly();
		birdAdapter.squeak();
	}

}
