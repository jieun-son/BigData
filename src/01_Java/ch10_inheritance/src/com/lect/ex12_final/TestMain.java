package com.lect.ex12_final;

public class TestMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.running();
		animal.running();
		animal.stop();
		Animal dog = new Dog();
		dog.running();
		dog.running();
		dog.stop();
		//dog.method();
	}
}
