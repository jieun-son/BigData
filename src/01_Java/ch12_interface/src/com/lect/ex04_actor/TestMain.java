package com.lect.ex04_actor;
public class TestMain {
	public static void main(String[] args) {
		Actor park = new Actor("�ں���");
		park.outFire();
		park.saveMan();
		park.canCatchCriminal();
		park.canSearch();
		park.makePizza();
		park.makeSpaghetti();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		IFireFighter park1 = new Actor("�ں���");
		park1.outFire();
		park1.saveMan();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		IPoliceMan park2 = new Actor("�ں���");
		park2.canCatchCriminal();
		park2.canSearch();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		IChef park3 = new Actor("�ں���");
		park3.makePizza();
		park3.makeSpaghetti();
	}
}






