package com.patterns.adapter.example;

public class PlasticDuck implements Duck {

	@Override
	public void fly(){
		System.out.println("cant fly");
	}

	@Override
	public void quark(){
		System.out.println("pepepe");
	}

}
