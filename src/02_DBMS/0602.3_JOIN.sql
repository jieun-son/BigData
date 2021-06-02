-- [III] JOIN : ���̺� 2�� �̻��� �����Ͽ� �˻�
SELECT * FROM EMP WHERE ENAME='SCOTT'; -- �μ���ȣ(DEPTNO�� 20)
SELECT * FROM DEPT;
-- CROSS JOIN (FROM���� ���̺� 2���̻�)
SELECT * FROM EMP, DEPT; -- 56�� = EMP�� 14�� * DEPT�� 4��
SELECT * FROM EMP, DEPT WHERE ENAME='SCOTT'; -- 4�� = EMP�� 1�� * DEPT�� 4��

-- �� EQUI JOIN(���� �ʵ��� DEPTNO���� ��ġ�Ǵ� ���Ǹ� JOIN)
SELECT * FROM EMP, DEPT 
    WHERE ENAME='SCOTT' AND EMP.DEPTNO = DEPT.DEPTNO;
    
SELECT EMPNO, ENAME, EMP.DEPTNO, DNAME, LOC FROM EMP, DEPT
    WHERE EMP.DEPTNO=DEPT.DEPTNO;
  -- ���̺��� ��Ī�� ������ �� ��Ī���θ� ���̺��� �׼����� �� �ִ�.    
  SELECT EMPNO NO, ENAME, E.DEPTNO, DNAME, LOC FROM EMP E, DEPT D
    WHERE E.DEPTNO=D.DEPTNO
    ORDER BY EMPNO;
    
  -- �޿��� 2000�̻��� ������ �̸�, ����(JOB), �޿�, �μ���, �ٹ��� ���
  SELECT ENAME, JOB, SAL, DNAME, LOC 
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO AND SAL>=2000;
  -- LOC�� CHICAGO�� ����� �̸�, ����, �޿�, �μ���, �ٹ����� ���
  SELECT ENAME, JOB, SAL, DNAME, LOC FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO AND LOC='CHICAGO';
  -- LOC�� CHICAGO�� ����� �̸�, ����, �޿��� ���
  SELECT ENAME, JOB, SAL FROM EMP E, DEPT D 
    WHERE E.DEPTNO=D.DEPTNO AND LOC='CHICAGO';
  -- �μ���ȣ�� 10 �̰ų� 20���� ����� �̸�(ENAME), ����(JOB), �ٹ���(LOC). �޿���
  SELECT ENAME, JOB, LOC FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO AND E.DEPTNO IN (10,20)
    ORDER BY SAL;
  -- JOB�� SALESMAN�̰ų� MANAGER�� ����� 
  -- �̸�, �޿�, ��, ����((SAL+COMM)*12), �μ���, �ٹ���, ������ ū ������ ����
  SELECT ENAME, SAL, COMM, (SAL+NVL(COMM,0))*12 ANNUAL_SAL, DNAME, LOC
    FROM EMP E, DEPT D
    WHERE E.DEPTNO=D.DEPTNO AND (JOB='SALESMAN' OR JOB='MANAGER')
    ORDER BY ANNUAL_SAL DESC;
  SELECT ENAME, SAL, COMM, (SAL+NVL(COMM,0))*12 ANNUAL_SAL, DNAME, LOC
    FROM EMP E, DEPT D
    WHERE E.DEPTNO=D.DEPTNO AND JOB IN ('SALESMAN','MANAGER')
    ORDER BY ANNUAL_SAL DESC;
  -- COMM�� NULL�̰� �޿��� 1200�̻��� ����� �̸�, �޿�, �Ի���, �μ���ȣ, �μ���
  -- �μ����, �޿�ū�� ����
  SELECT ENAME, SAL, HIREDATE, E.DEPTNO, DNAME
    FROM EMP E, DEPT D
    WHERE E.DEPTNO=D.DEPTNO AND COMM IS NULL AND SAL >=1200
    ORDER BY DNAME, SAL DESC;
  -- 'NEW YORK'���� �ٹ��ϴ� ����� �̸��� �޿� ���
  SELECT ENAME, SAL FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO AND LOC='NEW YORK';
  -- 'ACCOUNTING' �μ� �Ҽ��� ��� �̸��� �Ի��� ���
  SELECT ENAME, HIREDATE FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO AND DNAME='ACCOUNTING';
  -- ������ MANAGER�� ����� �̸�, �μ��� ���
  SELECT ENAME, DNAME FROM EMP E, DEPT D
    WHERE E.DEPTNO=D.DEPTNO AND JOB='MANAGER';
  -- COMM�� NULL�� �ƴ� ����� �̸�, �޿�, �μ���ȣ, �ٹ��� ���
  SELECT ENAME, SAL, E.DEPTNO, LOC FROM EMP E, DEPT D
    WHERE E.DEPTNO=D.DEPTNO AND NOT COMM IS NULL;
  
-- �� NON-EQUI JOIN
SELECT * FROM EMP WHERE ENAME='SCOTT';
SELECT * FROM SALGRADE; -- �޿� ��� ����
-- CROSS 5�� = EMP�� 1�� * SALGRADE�� 5��
SELECT * FROM EMP, SALGRADE WHERE ENAME='SCOTT' AND SAL>=LOSAL AND SAL<=HISAL; 
SELECT * FROM EMP, SALGRADE WHERE ENAME='SCOTT' AND SAL BETWEEN LOSAL AND HISAL; 
  -- ��� ����� ���, �̸�, JOB, �����, �޿�, �޿����(1���, 2���)
  SELECT EMPNO, ENAME, JOB, MGR, SAL, GRADE||'���' FROM EMP, SALGRADE
    WHERE SAL BETWEEN LOSAL AND HISAL;
  -- COMM�� NULL�� �ƴ� ����� �̸�, �޿�, �޿����, �μ���ȣ, �μ��̸�, �ٹ���
  SELECT ENAME, SAL, GRADE, E.DEPTNO, DNAME, LOC FROM EMP E, DEPT D, SALGRADE
    WHERE E.DEPTNO=D.DEPTNO AND SAL BETWEEN LOSAL AND HISAL AND
      NOT COMM IS NULL;
  -- �̸�, �޿�, �Ի���, �޿����
  SELECT ENAME, SAL, HIREDATE, GRADE FROM EMP, SALGRADE 
    WHERE SAL BETWEEN LOSAL AND HISAL;
  -- �̸�, �޿�, �Ի���, �޿����, �μ���, �ٹ���
  SELECT ENAME, SAL, HIREDATE, GRADE, DNAME, LOC FROM EMP E, DEPT D, SALGRADE
    WHERE E.DEPTNO=D.DEPTNO AND SAL BETWEEN LOSAL AND HISAL;
  -- �̸�, �޿�, �޿����, ���� (�μ���ȣ�� ����, �μ��� ������ ������. ����=(SAL+COMM)*12)
  SELECT ENAME, SAL, GRADE, (SAL+NVL(COMM,0))*12 ANNUAL_SAL
    FROM EMP, SALGRADE
    WHERE SAL BETWEEN LOSAL AND HISAL
    ORDER BY DEPTNO, ANNUAL_SAL;
  -- �̸�, �޿�, �޿����, ���� (�μ��̸��� ����, �μ��� ������ ������. ����=(SAL+COMM)*12)
  SELECT ENAME, SAL, GRADE, (SAL+NVL(COMM,0))*12 ANNUAL_SAL
    FROM EMP E, SALGRADE, DEPT D
    WHERE SAL BETWEEN LOSAL AND HISAL AND E.DEPTNO=D.DEPTNO
    ORDER BY DNAME, ANNUAL_SAL;
  -- �̸�, ����(JOB), �޿�, �޿����, �μ���ȣ, �μ���
      -- (�޿��� 1000~3000����, �μ��̸�, ����, �޿�ū �� ����)
  SELECT ENAME, JOB, SAL, GRADE, E.DEPTNO, DNAME
    FROM EMP E, DEPT D, SALGRADE
    WHERE E.DEPTNO=D.DEPTNO AND SAL BETWEEN LOSAL AND HISAL
          AND SAL BETWEEN 1000 AND 3000
    ORDER BY DNAME, JOB, SAL DESC;
  -- �̸�, �޿�, ���, �Ի���, �ٹ��� (81�⿡ �Ի��� ����� ���. ��� ū �� ����)
  SELECT ENAME, SAL, GRADE, HIREDATE, LOC
    FROM EMP E, DEPT D, SALGRADE
    WHERE E.DEPTNO=D.DEPTNO AND SAL BETWEEN LOSAL AND HISAL
        AND TO_CHAR(HIREDATE,'RR') ='81'
    ORDER BY GRADE DESC;
  
-- �� SELF JOIN 
SELECT EMPNO, ENAME, MGR FROM EMP WHERE ENAME='SMITH'; -- ����� ���:7902
SELECT EMPNO, ENAME FROM EMP WHERE EMPNO=7902;

SELECT WORKER.EMPNO, WORKER.ENAME, WORKER.MGR, MANAGER.ENAME
  FROM EMP WORKER, EMP MANAGER
  WHERE WORKER.ENAME='SMITH' AND WORKER.MGR=MANAGER.EMPNO;
  -- ��� ����� ���, �̸�, ����� ���, ����� �̸�
  SELECT W.EMPNO, W.ENAME, W.MGR, M.ENAME
    FROM EMP W, EMP M
    WHERE W.MGR=M.EMPNO; -- 13�� (KING�� MRG�� NULL�̶� ��¾ȵ�)
  SELECT * FROM EMP; -- 14��
  -- 'SMITH�� ���� FORD��'�������� ���
  SELECT W.ENAME || '�� ���� ' || M.ENAME || '��(�̴�)'
    FROM EMP W, EMP M
    WHERE W.MGR=M.EMPNO;
  --źź1. ����� �̸��� 'KING'�� ������� �̸��� JOB�� ���
  SELECT W.ENAME, W.JOB
    FROM EMP W, EMP M
    WHERE W.MGR=M.EMPNO AND M.ENAME='KING';
  --źź2. SCOTT�� ������ �μ���ȣ���� �ٹ��ϴ� ����� �̸� ���
  SELECT E2.ENAME
    FROM EMP E1, EMP E2
    WHERE E1.ENAME='SCOTT' AND E1.DEPTNO=E2.DEPTNO AND E2.ENAME!='SCOTT';
  --źź3. SCOTT�� ������ �ٹ������� �ٹ��ϴ� ����� �̸� ���
  SELECT E2.ENAME
    FROM EMP E1, DEPT D1, EMP E2, DEPT D2
    WHERE E1.ENAME='SCOTT' AND
      E1.DEPTNO=D1.DEPTNO AND E2.DEPTNO=D2.DEPTNO AND D1.LOC=D2.LOC AND
      E2.ENAME ^= 'SCOTT';
  INSERT INTO DEPT VALUES (50,'IT','DALLAS');
  INSERT INTO EMP VALUES (9999,'ȫ',NULL,NULL,NULL,9000,NULL, 50);
  ROLLBACK; -- DML(������ ���۾�=�߰�+����+����+�˻�) ���
  SELECT * FROM DEPT;
  SELECT * FROM EMP;

-- �� OUTER JOIN : ���ν� ���ǿ� �������� �ʴ� ����� ��Ÿ����
-- SELF JION�� OUTER JOIN
SELECT W.ENAME, W.MGR, M.EMPNO, M.ENAME
  FROM EMP W, EMP M
  WHERE W.MGR = M.EMPNO(+);
  -- "SMITH�� �Ŵ����� FORD�Դϴ�" �������� ���
  -- "KING�� �Ŵ����� ���Դϴ�"
  SELECT W.ENAME ||'�� �Ŵ����� ' || NVL(M.ENAME,'��') MSG
    FROM EMP W, EMP M
    WHERE W.MGR=M.EMPNO(+);
  -- ���ܻ���� �̸�
  SELECT W.ENAME, W.MGR, M.EMPNO, M.ENAME
    FROM EMP W, EMP M
    WHERE W.MGR(+)=M.EMPNO AND W.ENAME IS NULL; -- 1�ܰ�
  SELECT M.EMPNO, M.ENAME
    FROM EMP W, EMP M
    WHERE W.MGR(+)=M.EMPNO AND W.ENAME IS NULL; -- �ϼ� 2�ܰ�
  -- EQUI JION�� OUTER JOIN
  SELECT * FROM DEPT; -- 10,20,30,40�� �μ�
  SELECT * FROM EMP; -- 10,20,30�� �μ�
  SELECT * FROM EMP E, DEPT D WHERE E.DEPTNO=D.DEPTNO; -- 40���μ��� ��� �ȵ�
  SELECT * FROM EMP E, DEPT D WHERE E.DEPTNO(+)=D.DEPTNO; -- 40�μ� ����
-- �� �� ��������
-- PART1
--1. �̸�, ���ӻ��
SELECT W.ENAME, M.ENAME manager
  FROM EMP W, EMP M
  WHERE W.MGR=M.EMPNO;
--2. �̸�, �޿�, ����, ���ӻ���̸�
SELECT W.ENAME, W.SAL, W.JOB, M.ENAME MANAGER
  FROM EMP W, EMP M 
  WHERE W.MGR=M.EMPNO;
--3. �̸�, �޿�, ����, ���ӻ���. (��簡 ���� �������� ��ü ���� �� ���.
    --��簡 ���� �� '����'���� ���)
SELECT W.ENAME, W.SAL, W.JOB, NVL(M.ENAME,'����') MANAGER 
  FROM EMP W, EMP M 
  WHERE W.MGR=M.EMPNO(+);
--4. �̸�, �޿�, �μ���, ���ӻ���
SELECT W.ENAME, W.SAL, DNAME, M.ENAME MANAGER
  FROM EMP W, EMP M, DEPT D 
  WHERE W.DEPTNO=D.DEPTNO AND W.MGR=M.EMPNO;
--5. �̸�, �޿�, �μ��ڵ�, �μ���, �ٹ���, ���ӻ���, 
  -- (��簡 ���� �������� ��ü ���� �� ���)
SELECT W.ENAME, W.SAL, W.DEPTNO, DNAME, LOC, NVL(M.ENAME,'������') MANAGER
  FROM EMP W, EMP M, DEPT D
  WHERE W.DEPTNO=D.DEPTNO AND W.MGR=M.EMPNO(+);
--6. �̸�, �޿�, ���, �μ���, ���ӻ���. �޿��� 2000�̻��� ���
SELECT W.ENAME, W.SAL, GRADE, DNAME, M.ENAME MANAGER
  FROM EMP W, EMP M, DEPT D, SALGRADE
  WHERE W.MGR=M.EMPNO AND W.DEPTNO=D.DEPTNO 
        AND W.SAL BETWEEN LOSAL AND HISAL
        AND W.SAL>=2000; -- ���ӻ�簡 ���� �������� ����Ϸ��� W.MGR=M.EMPNO(+)
--7. �̸�, �޿�, ���, �μ���, ���ӻ���, (���ӻ�簡 ���� �������� ��ü���� �μ��� �� ����)
SELECT W.ENAME, W.SAL, GRADE, DNAME, M.ENAME MANAGER
  FROM EMP W, EMP M, DEPT D, SALGRADE
  WHERE W.MGR=M.EMPNO(+) AND W.DEPTNO=D.DEPTNO 
    AND W.SAL BETWEEN LOSAL AND HISAL
  ORDER BY DNAME;
--8. �̸�, �޿�, ���, �μ���, ����, ���ӻ���. ����=(�޿�+comm)*12
SELECT W.ENAME, W.SAL, GRADE, DNAME, 
        (W.SAL+NVL(W.COMM,0))*12 ANNUAL_SAL, M.ENAME MANAGER
  FROM EMP W, EMP M, DEPT D, SALGRADE 
  WHERE W.MGR=M.EMPNO(+) AND W.DEPTNO=D.DEPTNO 
        AND W.SAL BETWEEN LOSAL AND HISAL;
--9. 8���� �μ��� �� �μ��� ������ �޿��� ū �� ����
SELECT W.ENAME, W.SAL, GRADE, DNAME, 
        (W.SAL+NVL(W.COMM,0))*12 ANNUAL_SAL, M.ENAME MANAGER
  FROM EMP W, EMP M, DEPT D, SALGRADE 
  WHERE W.MGR=M.EMPNO(+) AND W.DEPTNO=D.DEPTNO 
        AND W.SAL BETWEEN LOSAL AND HISAL
  ORDER BY DNAME, W.SAL DESC; -- ORDER BY ������ SAL�� ����. SELECT ���� �ִ� SAL�� �ν�
--  PART2
--1.��� ����� ���� �̸�,�μ���ȣ,�μ����� ����ϴ� SELECT ������ �ۼ��Ͽ���.
SELECT ENAME, E.DEPTNO, DNAME FROM EMP E, DEPT D 
  WHERE E.DEPTNO=D.DEPTNO;
--2. EMP ���̺��� NEW YORK���� �ٹ��ϰ� �ִ� ����� ���Ͽ� �̸�,����,�޿�,�μ����� ���
SELECT ENAME, JOB, SAL, DNAME 
  FROM EMP E, DEPT D 
  WHERE E.DEPTNO=D.DEPTNO AND LOC='NEW YORK';
--3. EMP ���̺��� ���ʽ��� �޴� ����� ���Ͽ� �̸�,�μ���,��ġ�� ���
SELECT ENAME, DNAME, LOC
  FROM EMP E, DEPT D
  WHERE E.DEPTNO=D.DEPTNO AND COMM IS NOT NULL AND COMM <> 0;
--4. EMP ���̺��� �̸� �� L�ڰ� �ִ� ����� ���Ͽ� �̸�,����,�μ���,��ġ�� ���
SELECT ENAME, JOB, DNAME, LOC
  FROM EMP E, DEPT D
  WHERE E.DEPTNO=D.DEPTNO AND ENAME LIKE '%L%';
--5. ���, �����, �μ��ڵ�, �μ����� �˻��϶�. ������������ ������������
SELECT EMPNO, ENAME, D.DEPTNO, DNAME
  FROM EMP E, DEPT D
  WHERE E.DEPTNO=D.DEPTNO
  ORDER BY ENAME;
--6. ���, �����, �޿�, �μ����� �˻��϶�. 
    --�� �޿��� 2000�̻��� ����� ���Ͽ� �޿��� �������� ������������ �����Ͻÿ�
SELECT EMPNO, ENAME, SAL, DNAME
  FROM EMP E, DEPT D
  WHERE E.DEPTNO=D.DEPTNO AND SAL>=2000
  ORDER BY SAL DESC;
--7. ���, �����, ����, �޿�, �μ����� �˻��Ͻÿ�. �� ������ MANAGER�̸� �޿��� 2500�̻���
-- ����� ���Ͽ� ����� �������� ������������ �����Ͻÿ�.
SELECT EMPNO, ENAME, JOB, SAL, DNAME
  FROM EMP E, DEPT D
  WHERE E.DEPTNO=D.DEPTNO AND JOB='MANAGER' AND SAL>=2500
  ORDER BY EMPNO;
--8. ���, �����, ����, �޿�, ����� �˻��Ͻÿ�. ��, �޿����� ������������ �����Ͻÿ�
SELECT EMPNO, ENAME, JOB, SAL, GRADE
  FROM EMP, SALGRADE
  WHERE SAL BETWEEN LOSAL AND HISAL
  ORDER BY SAL DESC;
--9. ������̺��� �����, ����� ��縦 �˻��Ͻÿ�(��簡 ���� �������� ��ü)
SELECT W.ENAME, M.ENAME MANAGER
  FROM EMP W, EMP M
  WHERE W.MGR=M.EMPNO(+);
--10. �����, ����, ����� ������ �˻��Ͻÿ�
SELECT W.ENAME ���, M.ENAME ���, MM.ENAME ����ǻ��
  FROM EMP W, EMP M, EMP MM
  WHERE W.MGR=M.EMPNO AND M.MGR=MM.EMPNO;
--11. ���� ������� ���� ��簡 ���� ��� ������ �̸��� ��µǵ��� �����Ͻÿ�
SELECT W.ENAME ���, M.ENAME ���, MM.ENAME "����� ���"
  FROM EMP W, EMP M, EMP MM
  WHERE W.MGR=M.EMPNO(+) AND M.MGR=MM.EMPNO(+);
  

  
  