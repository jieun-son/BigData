-- [IV] �������Լ�;�����Լ�
-- �Լ� = �������Լ� + �׷��Լ�(�����Լ�)
SELECT HIREDATE, TO_CHAR(HIREDATE, 'YY"��"MM"��"DD"��"') FROM EMP; -- �������Լ�
SELECT ENAME, INITCAP(ENAME) FROM EMP; -- �������Լ�
SELECT SUM(SAL) FROM EMP; -- �׷��Լ�(�����Լ�)
SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY DEPTNO; -- �׷��Լ�(�μ���ȣ�� �հ�)
SELECT SAL FROM EMP;
-- EX. ���ڰ����Լ�, ���ڰ����Լ�, ��¥�����Լ�, ����ȯ�Լ�, NVL(), ETC...
-- 1. �����Լ�
-- DUAL ���̺�  : ����Ŭ���� �����ϴ� 1��1���ڸ� DUMMY TABLE
SELECT * FROM DUAL;
DESC DUAL;
SELECT * FROM DUMMY;
DESC DUMMY;
SELECT ABS(-9) FROM DUAL; -- ���밪
SELECT FLOOR(34.5678) FROM DUAL; -- �Ҽ������� ����
SELECT FLOOR(34.5678*100)/100 FROM DUAL; -- �Ҽ��� ���ڸ����� ����
SELECT TRUNC(34.5678) FROM DUAL; -- �Ҽ������� ����
SELECT TRUNC(34.5678, 2) FROM DUAL; -- �Ҽ��� ���ڸ����� ����
SELECT TRUNC(34.5678, -1) FROM DUAL; -- ���� �ڸ����� ����
  -- EMP ���̺��� �̸�, �޿�(���� �ڸ����� ����)
  SELECT ENAME, SAL, TRUNC(SAL, -2) FROM EMP;
SELECT CEIL(34.5678) FROM DUAL; -- �Ҽ������� �ø�
SELECT ROUND(34.5678) FROM DUAL; -- �Ҽ������� �ݿø�
SELECT ROUND(34.5678, 2) FROM DUAL; -- �Ҽ��� �ι�° �ڸ����� �ݿø�
SELECT ROUND(34.5678, -1) FROM DUAL; -- ���� �ڸ����� �ݿø�

SELECT MOD(9,2) FROM DUAL; -- ������ ������
  -- Ȧ���� �Ի��� ����� ��� ����
  SELECT * FROM EMP WHERE MOD(TO_CHAR(HIREDATE, 'MM'), 2)=1;

-- 2. �����Լ�







