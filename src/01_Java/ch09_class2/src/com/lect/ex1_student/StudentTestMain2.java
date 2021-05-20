package com.lect.ex1_student;
public class StudentTestMain2 {
	public static void main(String[] args) {
		Student[] student = {new Student("���켺", 90, 90, 90),
							new Student("���ϴ�", 90, 90, 91),
							new Student("Ȳ����", 80, 80, 80),
							new Student("������", 80, 80, 81),
							new Student("������", 70, 70, 70)};
		String[] title = {"�̸�","����","����","����","����","���"};
		// �� ���� �������� ����(0:�����, 1 index:�����, 2:���д���, 3:��������, 4:��մ���)
		// �迭 tot�� avg�� 0�̳� 0.0���� �ʱ�ȭ
		int[] tot = new int[5]; 
		double[] avg = new double[5]; // �� ���� ��յ� ����
		System.out.println("�������������������������������������������������������������������");
		System.out.println("\t\t\t\t����ǥ");
		System.out.println("\t--------------------------------------------------");
//		for(int i=0 ; i<title.length ; i++) {
//			System.out.print("\t "+title[i]);
//		}
		for(String t : title) {
			System.out.print("\t"+t);
		}
		System.out.println();
		System.out.println("\t--------------------------------------------------");
		for(Student s : student) {
			s.infoPrint();
			// �� ���� �������� ����(0:�����, 1 index:�����, 2:���д���, 3:��������, 4:��մ���)
			tot[0] += s.getKor(); //tot[0] = tot[0] + s.getKor();
			tot[1] += s.getEng();
			tot[2] += s.getMat();
			tot[3] += s.getTot();
			tot[4] += s.getAvg();
			
		}
		System.out.println("\t--------------------------------------------------");
		System.out.print("\t����");
		for(int idx=0 ; idx<avg.length ; idx++) { // ��յ� ���
			avg[idx] = tot[idx] / student.length;
			System.out.print("\t "+tot[idx]);
		}
		System.out.print("\n\t���");
		for(double a : avg) {
			System.out.print("\t"+a);
		}
		System.out.println();
		System.out.println("�������������������������������������������������������������������");
		
	}
}
