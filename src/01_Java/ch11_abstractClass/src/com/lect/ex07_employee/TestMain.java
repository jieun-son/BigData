package com.lect.ex07_employee;
public class TestMain {
	public static void main(String[] args) {
		Employee[] employees = {
				new SalaryEmployee("ȫ�浿", 28000000),//������
				new SalaryEmployee("������", 70000000),//������
				new SalaryEmployee("�����", 45000000),//������
				new HourlyEmployee("�̾˹�", 160,30000),//�Ƹ�����Ʈ��
				new HourlyEmployee("�ž˹�", 120,15000)};//�Ƹ�����Ʈ��

		for(Employee emp : employees){
			System.out.println("~ ~ ~ ���޸��� ~ ~ ~");
			System.out.println("�� �� :"+emp.getName());
			System.out.println("�� �� : "+emp.computePay());
			//System.out.println("�� �� : "+ temp.computeIncentive());
			int incentive = emp.computeIncentive();
			if(incentive!=0){
				System.out.println("�� �� : "+ incentive);
			}
			System.out.println(" �� �� �� �� �� �� �� ");
		}//for
	}//main
}
