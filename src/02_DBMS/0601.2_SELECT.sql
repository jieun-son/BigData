-- [II] SELECT �� - �˻�
-- 1. SQL���� �ۼ���
SELECT * FROM TAB; -- �� ����(scott)�� ������ �ִ� ���̺�
SELECT * FROM DEPT; -- DEPT ���̺� ��� ��(�ʵ�), ��� ��
SELECT * FROM EMP;  -- EMP ���̺� ��� ��(�ʵ�), ��� ��
-- DEPT ���̺��� ����(DEPTNO, DNAME, LOC)
DESC DEPT;

-- 2. SQL�� ����(Ư�� ���� ���)
SELECT EMPNO, ENAME, SAL, JOB FROM EMP;
SELECT EMPNO AS "���", ENAME AS "�̸�", SAL AS "�޿�", JOB AS "��å" FROM EMP; -- ��Ī
SELECT EMPNO AS ���, ENAME AS �̸�, SAL AS �޿�, JOB AS ��å FROM EMP; -- ��Ī
SELECT EMPNO ���, ENAME �̸�, SAL �޿�, JOB ��å FROM EMP; -- ��Ī
SELECT EMPNO "�� ��", ENAME "�� ��" FROM EMP;
SELECT EMPNO NO, ENAME NAME, SAL SALARY FROM EMP;

-- 3. Ư�� �� ��� ; WHERE��(����) ; �񱳿����� �̿�
SELECT EMPNO "���", ENAME "�̸�", SAL "�޿�" FROM EMP WHERE SAL = 3000; -- ����
SELECT EMPNO "���", ENAME "�̸�", SAL "�޿�" FROM EMP WHERE SAL != 3000;-- �ٸ���
SELECT EMPNO "���", ENAME "�̸�", SAL "�޿�" FROM EMP WHERE SAL <> 3000;-- �ٸ���
select empno "���", ename "�̸�", sal "�޿�" from emp where sal ^= 3000;-- �ٸ���
    -- 10�� �μ�(deptno)�� ����� ��� �ʵ带 ���
SELECT * FROM EMP WHERE DEPTNO = 10;
    -- �̸�(ENAME)�� FORD�� ������ EMPNO, ENAME, MGR�� ���
SELECT EMPNO, ENAME, MGR FROM EMP WHERE ENAME = 'FORD'; -- �����ʹ� ��ҹ��� ����

-- 4. �������� ; �޿�(SAL)�� 2000�̻� 3000�̸��� ������ ��� �ʵ�
SELECT * FROM EMP WHERE SAL >= 2000 AND SAL<3000;
    -- �񱳿����� ����, ����, DATE�� �ʵ� ��� ����
    -- ����� �̸�(ENAME)�� 'A','B','C'�� �����ϴ� ����� ��� �ʵ�
SELECT * FROM EMP WHERE ENAME < 'D';
    -- 81�� ������ �Ի��� ����� ��� �ʵ�
SELECT * FROM EMP WHERE HIREDATE <'81/01/01';
-- EMP ���̺��� ����
DESC EMP; 
    -- 82�⵵�� �Ի��� ����� ��� �ʵ�
SELECT * FROM EMP WHERE HIREDATE >= '82/01/01' AND HIREDATE <= '82/12/31';
    -- ��¥ ǥ��� ���� (���� : RR/MM/DD)
ALTER SESSION SET NLS_DATE_FORMAT='MM-DD-RR';
ALTER SESSION SET NLS_DATE_FORMAT='RR/MM/DD';
    -- ������ 24000 �̻��� ������ ENAME, SAL, ���� ��� (���� = SAL*12)
SELECT ENAME, SAL, SAL*12 ���� FROM EMP WHERE SAL*12 >= 24000;
SELECT ENAME, SAL, SAL*12 ����  -- (3)
    FROM EMP              -- (1)
    WHERE SAL*12 >= 24000   -- (2) WHERE ������ �ʵ��� ��Ī�� �� �� ����
    ORDER BY ����;        -- (4) ORDER BY����Ʈ �ʵ��� ��Ī�� �� �� �ִ�.
    -- 10�� �μ����� JOB(��å)�� MANAGER�� ����� ��� �ʵ�
SELECT * FROM EMP WHERE DEPTNO = 10 AND JOB = 'MANAGER';
    -- 10�� �μ��̰ų� ��å�� MANAGER�� ����� ��� �ʵ�
SELECT * FROM EMP WHERE DEPTNO = 10 OR JOB = 'MANAGER' ;
    -- �μ���ȣ�� 10���� �ƴ� ����� ��� �ʵ�
SELECT * FROM EMP WHERE DEPTNO != 10;
SELECT * FROM EMP WHERE NOT DEPTNO = 10;

-- 5. ���ǥ����
SELECT ENAME, SAL, SAL+100 UPGRADE_SAL FROM EMP WHERE DEPTNO=10;
    -- ��� ����� �̸�, ����(SAL), ��(COMM), ����(SAL*12+COMM)
    -- ��������� ����� null�� �����ϸ� ����� NULL
    -- NVL(NULL�ϼ��� �ִ� �ʵ��, ��ġ��) �ݵ��, �Ű����� ���� Ÿ�� ���ƾ� ��
SELECT ENAME, SAL, COMM, SAL*12+COMM ���� FROM EMP; 
SELECT ENAME, SAL, COMM, SAL*12+NVL(COMM, 0) FROM EMP;
SELECT ENAME, SAL, NVL(COMM,0), SAL*12+NVL(COMM, 0) FROM EMP;
    -- ��� ����� �����,�����(MGR)�� ���(��簡 ������ 0����)
SELECT ENAME, NVL(MGR,0) FROM EMP;

-- 6. ���Ῥ����(||) : ���̳� ���ڸ� ����
SELECT ENAME || '�� ' || JOB "EMPLOYEES" FROM EMP;
    -- "SMITH : 1 YEAR SALARY = XXXX"�� ���� ��� ���� ���(����=SAL*12+COMM)
SELECT ENAME || ': 1 YEAR SALARY = ' || (SAL*12+NVL(COMM,0)) "MSG" FROM EMP;

-- 7. �ߺ����� (DISTINCT)
SELECT DISTINCT JOB FROM EMP;
SELECT DISTINCT DEPTNO FROM EMP;
SELECT * FROM DEPT;

-- �� �������� �� Ǯ��
    --1. emp ���̺��� ���� ���
DESC EMP; -- ORACLE ���
    --2. emp ���̺��� ��� ������ ��� 
SELECT * FROM EMP;
    --3. �� scott �������� ��밡���� ���̺� ���
SHOW USER;
SELECT * FROM TAB;
    --4. emp ���̺��� ���, �̸�, �޿�, ����, �Ի��� ���
SELECT EMPNO, ENAME, SAL, JOB, HIREDATE FROM EMP;
    --5. emp ���̺��� �޿��� 2000�̸��� ����� ���, �̸�, �޿� ���
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL<2000;
    --6. �Ի����� 81/02���Ŀ� �Ի��� ����� ���, �̸�, ����, �Ի��� ���
SELECT EMPNO, ENAME, JOB, HIREDATE FROM EMP WHERE HIREDATE >= '81/02/01';
    --7. ������ SALESMAN�� ����� ��� �ڷ� ���
SELECT * FROM EMP WHERE JOB = 'SALESMAN';
    --8. ������ CLERK�� �ƴ� ����� ��� �ڷ� ���
SELECT * FROM EMP WHERE JOB != 'CLERK';
SELECT * FROM EMP WHERE JOB <> 'CLERK';
SELECT * FROM EMP WHERE JOB ^= 'CLERK';
SELECT * FROM EMP WHERE NOT JOB = 'CLERK';
    --9. �޿��� 1500�̻��̰� 3000������ ����� ���, �̸�, �޿� ���
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>=1500 AND SAL<=3000;
    --10. �μ��ڵ尡 10���̰ų� 30�� ����� ���, �̸�, ����, �μ��ڵ� ���
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE DEPTNO=10 OR DEPTNO=30;
    --11. ������ SALESMAN�̰ų� �޿��� 3000�̻��� ����� ���, �̸�, ����, �μ��ڵ� ���
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE JOB='SALESMAN' OR SAL>=3000;
    --12. �޿��� 2500�̻��̰� ������ MANAGER�� ����� ���, �̸�, ����, �޿� ���
SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SAL>=2500 AND JOB = 'MANAGER';
    --13.��ename�� XXX �����̰� ������ XX�١� ��Ÿ�Ϸ� ��� ���(������ SAL*12+COMM)
SELECT ENAME||'��(��) '||job||'�����̰� ������'||(SAL*12+NVL(COMM,0)) ||'��'
    FROM EMP;

-- 8. SQL ������(BETWEEN, IN, LIKE, IS NULL)
  -- (1) BETWEEN  
    -- SAL�� 1500�̻� 300������ ���, �̸�, �޿�
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>=1500 AND SAL<=3000;
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL BETWEEN 1500 AND 3000;
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL BETWEEN 3000 AND 1500; -- x
    -- 1500�̸� 3000�ʰ�
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL NOT BETWEEN 1500 AND 3000;

    -- �ʵ�� BETWEEN A AND B - A���� B����(A, B����. A<B)
    -- 82�⵵�� �Ի��� ������ ��� �ʵ� ���
SELECT * FROM EMP WHERE HIREDATE BETWEEN '82/01/01' AND '81/12/31';
    -- ��� �̸��� 'B','C'�� �����ϴ� ����� ��� �ʵ�
SELECT * FROM EMP WHERE ENAME BETWEEN 'B' AND 'D' AND ENAME != 'D';

  -- (2) IN
    -- �μ���ȣ�� 10, 20��, 40�� �μ� ����� ��� �ʵ�
SELECT * FROM EMP WHERE DEPTNO=10 OR DEPTNO=20 OR DEPTNO=40;
SELECT * FROM EMP WHERE DEPTNO IN (10,20,40);
    -- �μ���ȣ�� 10,20,40�� �μ��� ������ ����� ��� �ʵ�
SELECT * FROM EMP WHERE DEPTNO NOT IN (10,20,40);
SELECT * FROM EMP WHERE DEPTNO!=10 AND DEPTNO !=20 AND DEPTNO !=40;
    -- ����� 7902, 7788, 7566�� ����� ��� �ʵ�
SELECT * FROM EMP WHERE EMPNO IN (7902, 7788, 7566);
  -- (3) LIKE ����
    -- �̸��� M���� �����ϴ� ����� ��� �ʵ�
SELECT * FROM EMP WHERE ENAME LIKE 'M%'; -- %:0���� �̻� / _:�ѱ���
    -- �̸��� N�� ���� ����� ��� �ʵ�
SELECT * FROM EMP WHERE ENAME LIKE '%N%';    
    -- �̸��� S�� ������ ����� ��� �ʵ�
SELECT * FROM EMP WHERE ENAME LIKE '%S';
    -- SAL�� 5�� ������ ����� ��� �ʵ�
SELECT * FROM EMP WHERE SAL LIKE '%5';
    -- 82�⵵�� �Ի��� ����� ��� �ʵ�
SELECT * FROM EMP WHERE HIREDATE LIKE '82/%';
    -- 1���� �Ի��� ����� ��� �ʵ�
SELECT * FROM EMP WHERE HIREDATE LIKE '__/01/__';    
    -- 82�⵵�� �ƴ� �⵵�� �Ի��� ����� ��� �ʵ�
SELECT * FROM EMP WHERE HIREDATE NOT LIKE '82/%';
    -- �̸��� A�� �� ����� ��� �ʵ带 ���
SELECT * FROM EMP WHERE ENAME LIKE '%A%';
    -- �̸��� %�� �� ����� ��� �ʵ带 ���
SELECT * FROM EMP WHERE ENAME LIKE '%\%%' ESCAPE '\';
INSERT INTO EMP VALUES (9999, 'LISA%',NULL,NULL,NULL,9000,9900,40);
SELECT * FROM EMP WHERE EMPNO=9999;
ROLLBACK; -- DML(������ ���۾�)�� ���
  -- (4) IS NULL
    -- �󿩱��� ���� ����� ��� �ʵ� (comm�� ���̰ų� 0)
SELECT * FROM EMP WHERE COMM IS NULL OR COMM = 0;
    -- �󿩱��� �ִ� ����� ��� �ʵ�
SELECT * FROM EMP WHERE NOT COMM IS NULL AND COMM !=0;

-- 9. ����(��������, ��������)
SELECT ENAME, SAL FROM EMP ORDER BY SAL; -- �������� ����
SELECT ENAME, SAL FROM EMP ORDER BY SAL ASC; -- �������� ����
SELECT ENAME, SAL FROM EMP ORDER BY SAL DESC; -- �������� ����
SELECT ENAME, SAL FROM EMP ORDER BY ENAME;
SELECT ENAME, SAL FROM EMP ORDER BY HIREDATE; -- ��¥������� ����
SELECT ENAME, SAL, HIREDATE FROM EMP ORDER BY HIREDATE DESC; -- �ֽż����� ����
    -- �̸�, ����(SAL*12+COMM)�� ���(������ ���� ������. ������ ���� ��� �̸�������)
SELECT ENAME, SAL*12+NVL(COMM,0) ���� 
    FROM EMP ORDER BY ���� DESC, ENAME ASC;
    -- �̸�, ����(SAL*12+COMM)�� ���(������ ���� ������. ������ ���� ��� �̸�������)
SELECT ENAME, SAL*12+NVL(COMM,0) FROM EMP ORDER BY SAL*12+NVL(COMM,0), ENAME;
    -- ���, �̸�, HIREDATE, SAL, �μ���ȣ ���(�μ���, �μ��� ������ �Ի��ϼ����� ������������)
SELECT EMPNO, ENAME, HIREDATE, SAL, DEPTNO FROM EMP ORDER BY DEPTNO, HIREDATE;

-- �� �� ��������
  --1.EMP ���̺��� sal�� 3000�̻��� ����� empno, ename, job, sal�� ���
SELECT EMPNO, ENAME, JOB, SAL 
    FROM EMP 
    WHERE SAL>=3000;
  --2.EMP ���̺��� empno�� 7788�� ����� ename�� deptno�� ���
SELECT ENAME, DEPTNO 
    FROM EMP 
    WHERE EMPNO=7788;
  --3.����(sal*12+comm)�� 24000 �̻��� ���, �̸�, �޿� ��� (�޿�������)
SELECT EMPNO, ENAME, SAL 
    FROM EMP 
    WHERE (SAL*12+NVL(COMM,0))>=24000 
    ORDER BY SAL;
  --4.EMP ���̺��� hiredate�� 1981�� 2�� 20�� 1981�� 5�� 1�� ���̿� �Ի��� ����� 
  --ename,job,hiredate�� ����ϴ� SELECT ������ �ۼ� (�� hiredate ������ ���)
SELECT ENAME, JOB, HIREDATE FROM EMP 
    WHERE HIREDATE BETWEEN '81/02/20' AND '81/05/01' 
    ORDER BY HIREDATE;
SELECT ENAME, JOB, HIREDATE FROM EMP 
    WHERE HIREDATE>= '81/02/20' AND HIREDATE<='81/05/01' 
    ORDER BY HIREDATE ;
-- ��¥ ����
ALTER SESSION SET NLS_DATE_FORMAT = 'MM/DD/YYYY';
ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD';
-- �������� ��¥������ ��ȯ : TO_DATE('81/02/20', 'RR/MM/DD')
-- ��¥���� ���������� ��ȯ : TO_CHAR(��¥��, ����)
SELECT ENAME, TO_CHAR(HIREDATE,'RR-MM-DD') FROM EMP;
SELECT ENAME, JOB, HIREDATE FROM EMP 
    WHERE HIREDATE BETWEEN TO_DATE('1981/02/20','YYYY/MM/DD') 
                    AND TO_DATE('1981/05/01' ,'YYYY/MM/DD')
    ORDER BY HIREDATE;
SELECT ENAME, JOB, HIREDATE FROM EMP 
    WHERE HIREDATE BETWEEN TO_DATE('81/02/20','RR/MM/DD') 
                    AND TO_DATE('81/05/01' ,'RR/MM/DD')
    ORDER BY HIREDATE;        
  --5.EMP ���̺��� deptno�� 10,20�� ����� ��� ������ ��� (�� ename������ ����)
SELECT * FROM EMP WHERE DEPTNO=10 OR DEPTNO=20 ORDER BY ENAME;
SELECT * FROM EMP WHERE DEPTNO IN (10,20) ORDER BY ENAME;

  --6.EMP ���̺��� sal�� 1500�̻��̰� deptno�� 10,30�� ����� ename�� sal�� ���
  -- (�� HEADING�� employee�� Monthly Salary�� ���)
SELECT ENAME employee, SAL "Monthly Salary" FROM EMP 
  WHERE SAL>=1500 AND DEPTNO IN (10,30);
SELECT ENAME employee, SAL "Monthly Salary" FROM EMP 
  WHERE SAL>=1500 AND (DEPTNO=10 OR DEPTNO=30);
  
  --7.EMP ���̺��� hiredate�� 1982���� ����� ��� ������ ���
SELECT * FROM EMP WHERE HIREDATE LIKE '82%';
--��¥ ���� ����
ALTER SESSION SET NLS_DATE_FORMAT = 'MM/DD/YYYY';
ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD';
-- TO_DATE(), TO_CHAR()�Լ� �̿�
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE,'YYYY') = 1982;
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE,'RR') = 82;
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE, 'RR/MM/DD') LIKE '82%';

  --8.�̸��� ù�ڰ� C����  P�� �����ϴ� ����� �̸�, �޿� �̸��� ����
SELECT ENAME, SAL FROM EMP 
  WHERE (ENAME BETWEEN 'C' AND 'Q') AND ENAME!='Q'
  ORDER BY SAL, ENAME;
  --9.EMP ���̺��� comm�� sal���� 10%�� ���� ��� ����� ���Ͽ� �̸�, �޿�, �󿩱��� 
  --����ϴ� SELECT ���� �ۼ�
SELECT ENAME, SAL, COMM FROM EMP WHERE COMM>SAL*1.1 ;
  --10.EMP ���̺��� job�� CLERK�̰ų� ANALYST�̰� sal�� 1000,3000,5000�� �ƴ� ����� ��� �ʵ�
SELECT * FROM EMP WHERE (JOB='CLERK' OR JOB='ANALYST') 
  AND SAL NOT IN (1000,3000,5000);
SELECT * FROM EMP WHERE JOB IN('CLERK','ANALYST') 
  AND SAL NOT IN (1000,3000,5000);
SELECT * FROM EMP WHERE (job='CLERK' OR job='ANALYST') 
  AND NOT (SAL IN (1000,3000,5000));
  --11.EMP ���̺��� ename�� L�� �� �ڰ� �ְ� deptno�� 30�̰ų� �Ǵ� mgr�� 7782�� ����� 
  --��� ������ ����ϴ� SELECT ���� �ۼ��Ͽ���.
SELECT * FROM EMP 
  WHERE ENAME LIKE '%L%L%' AND (DEPTNO=30 OR MGR=7782);
  --12.��� ���̺��� �Ի����� 81�⵵�� ������ ���,�����, �Ի���, ����, �޿��� ���
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP 
  WHERE HIREDATE LIKE '81%';
-- TO_CHAR()�Լ� �̿��Ͽ� � �ý��ۿ����� �� ����ǵ���
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP 
    WHERE TO_CHAR(HIREDATE, 'RR') = 81;
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP
  WHERE HIREDATE BETWEEN '81/01/01' AND '81/12/31';
-- TO_DATE() �Լ� �̿��Ͽ� � �ý��ۿ����� �� ����ǵ���
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP
    WHERE HIREDATE BETWEEN TO_DATE('81/01/01', 'RR/MM/DD') 
        AND TO_DATE('81/12/31', 'RR/MM/DD');
  --13.��� ���̺��� �Ի�����81���̰� ������ 'SALESMAN'�� �ƴ� ������ ���, �����, �Ի���, 
  -- ����, �޿��� �˻��Ͻÿ�.
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP 
  WHERE HIREDATE LIKE '81%' AND JOB!='SALESMAN';
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP
  WHERE TO_CHAR(HIREDATE, 'RR')=81 AND JOB !='SALESMAN';
  --14.��� ���̺��� ���, �����, �Ի���, ����, �޿��� �޿��� ���� ������ �����ϰ�, 
  -- �޿��� ������ �Ի����� ���� ������� �����Ͻÿ�.
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP 
      ORDER BY SAL DESC, HIREDATE;
  --15.��� ���̺��� ������� �� ��° ���ĺ��� 'N'�� ����� ���, ������� �˻��Ͻÿ�
SELECT EMPNO, ENAME FROM EMP WHERE ENAME LIKE '__N%';
  --16.��� ���̺�������(SAL*12)�� 35000 �̻��� ���, �����, ������ �˻� �Ͻÿ�.
SELECT EMPNO, ENAME, SAL*12 ���� FROM EMP WHERE SAL*12 > 35000;







