package com.lect.ex02;

public class TestMain {
	public static void main(String[] args) {
		Amodel a = new Amodel();
		Bmodel b = new Bmodel();
		Cmodel c = new Cmodel();
		IAcor[] phones = {a, b, c};
		for(IAcor phone : phones) {
			phone.dmbReceive();
			phone.lte();
			phone.tvremotecontrol();
			System.out.println("~~~~~~~~~~~~~~~~~~");
		}
	}
}
