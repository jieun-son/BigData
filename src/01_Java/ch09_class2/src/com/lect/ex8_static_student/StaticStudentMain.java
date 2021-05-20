package com.lect.ex8_static_student;
public class StaticStudentMain {
	public static void main(String[] args) {
		Student[] student = { new Student("���켺", 90, 90, 90), 
							new Student("���ϴ�", 90, 90, 91),
							new Student("Ȳ����", 80, 80, 80), 
							new Student("������", 80, 80, 81), 
							new Student("������", 70, 70, 70) };
		String[] title = { "��ȣ","�̸�", "����", "����", "����", "����", "���" };
		int[] tot = new int[5];
		System.out.println("��������������������������������������������������������");
		System.out.println("\t\t����ǥ");
		System.out.println("------------------------------------------------------");
		for (String t : title) {
			System.out.print(t+"\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		for (Student s : student) {
			s.infoPrint();
			tot[0] += s.getKor();
			tot[1] += s.getEng();
			tot[2] += s.getMat();
			tot[3] += s.getTot();
			tot[4] += s.getAvg();
		}
		System.out.println("------------------------------------------------------");
		System.out.print("\t����\t");
		for(int t : tot) {
			System.out.print(t+"\t");
		}
		System.out.println("\n��������������������������������������������������������");

	}
}
