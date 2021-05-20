package com.lec.ex;

public class TodayEx3 {
	public static void main(String[] args) {
		int[] array = {76,45,34,89,100,50,90,92};
		int sum=0, avg=0,max=0,min=999;
		for(int i=0 ; i<array.length ; i++){
			sum += array[i];
			if(array[i]>max) max = array[i];
			if(array[i]<min) min = array[i];
		}
		avg = sum/array.length;
		System.out.printf("SUM = %d\t AVG = %d\n",sum,avg);
		System.out.printf("MAX = %d\t MIN = %d\n",max,min);
	}
}
