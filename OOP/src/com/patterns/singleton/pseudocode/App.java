package com.patterns.singleton.pseudocode;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database fooDatabase=Database.getInstance();
		fooDatabase.query("SELECT * FROM du_an");
		
		Database bar=Database.getInstance();
		bar.query("SELECT * FROM K66A5");
		System.out.println(fooDatabase==bar);
	}

}
