package com.patterns.adapter.example;

public class DuckAdapter implements Bird {
	private Duck duck;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void fly() {
		duck.fly();
	}

	@Override
	public void squeak() {
		duck.quark();
	}
}
