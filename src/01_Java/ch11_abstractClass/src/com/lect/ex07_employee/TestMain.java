package com.lect.ex07_employee;
public class TestMain {
	public static void main(String[] args) {
		Employee[] employees = {
				new SalaryEmployee("홍길동", 28000000),//정직원
				new SalaryEmployee("박직원", 70000000),//정직원
				new SalaryEmployee("윤사원", 45000000),//정직원
				new HourlyEmployee("이알바", 160,30000),//아르바이트생
				new HourlyEmployee("신알바", 120,15000)};//아르바이트생

		for(Employee emp : employees){
			System.out.println("~ ~ ~ 월급명세서 ~ ~ ~");
			System.out.println("성 함 :"+emp.getName());
			System.out.println("월 급 : "+emp.computePay());
			//System.out.println("상 여 : "+ temp.computeIncentive());
			int incentive = emp.computeIncentive();
			if(incentive!=0){
				System.out.println("상 여 : "+ incentive);
			}
			System.out.println(" 수 고 하 셨 습 니 다 ");
		}//for
	}//main
}
