package com.lect.ex11_booklib;
public interface ILendable {
	public byte STATE_BORROWED  = 1; // ������
	public byte STATE_NORMAL    = 0; // ���Ⱑ��
	public void checkOut(String borrower, String checkOutData); // ���� ����
	public void checkIn(); //�ݳ�	
	public String toString(); // "�ڹ�" ȫ�浿�� ���Ⱑ��
    						  // "�ڹ�" ȫ�浿�� ������
}
