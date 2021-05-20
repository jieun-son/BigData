package com.lec.ex1;
import com.lec.ex.Arithmetic;
// 다른 패키지의 class를 사용할 경우 import
public class Ex {
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		int tot = ar.sum(10, 100);
		System.out.println(ar.evenOdd(tot));
		//tot = ar.sum(10); default접근제한자일 경우 같은 패키지에서만 사용 가능
	}
}
