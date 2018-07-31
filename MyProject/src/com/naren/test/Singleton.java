package com.naren.test;

public class Singleton {

	private static Singleton instanace;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instanace == null) {
			instanace = new Singleton();
		}
		return instanace;
	}

}
