package com.lect.ex04_actor;
public class TestMain {
	public static void main(String[] args) {
		Actor park = new Actor("박보검");
		park.outFire();
		park.saveMan();
		park.canCatchCriminal();
		park.canSearch();
		park.makePizza();
		park.makeSpaghetti();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		IFireFighter park1 = new Actor("박보검");
		park1.outFire();
		park1.saveMan();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		IPoliceMan park2 = new Actor("박보검");
		park2.canCatchCriminal();
		park2.canSearch();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		IChef park3 = new Actor("박보검");
		park3.makePizza();
		park3.makeSpaghetti();
	}
}






