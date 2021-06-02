-- [II] SELECT 문 - 검색
-- 1. SQL문장 작성법
SELECT * FROM TAB; -- 현 계정(scott)이 가지고 있는 테이블
SELECT * FROM DEPT; -- DEPT 테이블에 모든 열(필드), 모든 행
SELECT * FROM EMP;  -- EMP 테이블에 모든 열(필드), 모든 행
-- DEPT 테이블의 구조(DEPTNO, DNAME, LOC)
DESC DEPT;

-- 2. SQL문 실행(특정 열만 출력)
SELECT EMPNO, ENAME, SAL, JOB FROM EMP;
SELECT EMPNO AS "사번", ENAME AS "이름", SAL AS "급여", JOB AS "직책" FROM EMP; -- 별칭
SELECT EMPNO AS 사번, ENAME AS 이름, SAL AS 급여, JOB AS 직책 FROM EMP; -- 별칭
SELECT EMPNO 사번, ENAME 이름, SAL 급여, JOB 직책 FROM EMP; -- 별칭
SELECT EMPNO "사 번", ENAME "이 름" FROM EMP;
SELECT EMPNO NO, ENAME NAME, SAL SALARY FROM EMP;

-- 3. 특정 행 출력 ; WHERE절(조건) ; 비교연산자 이용
SELECT EMPNO "사번", ENAME "이름", SAL "급여" FROM EMP WHERE SAL = 3000; -- 같다
SELECT EMPNO "사번", ENAME "이름", SAL "급여" FROM EMP WHERE SAL != 3000;-- 다르다
SELECT EMPNO "사번", ENAME "이름", SAL "급여" FROM EMP WHERE SAL <> 3000;-- 다르다
select empno "사번", ename "이름", sal "급여" from emp where sal ^= 3000;-- 다르다
    -- 10번 부서(deptno)인 사원의 모든 필드를 출력
SELECT * FROM EMP WHERE DEPTNO = 10;
    -- 이름(ENAME)이 FORD인 직원의 EMPNO, ENAME, MGR을 출력
SELECT EMPNO, ENAME, MGR FROM EMP WHERE ENAME = 'FORD'; -- 데이터는 대소문자 구분

-- 4. 논리연산자 ; 급여(SAL)이 2000이상 3000미만인 직원의 모든 필드
SELECT * FROM EMP WHERE SAL >= 2000 AND SAL<3000;
    -- 비교연산은 숫자, 문자, DATE형 필드 모두 가능
    -- 사원의 이름(ENAME)이 'A','B','C'로 시작하는 사원의 모든 필드
SELECT * FROM EMP WHERE ENAME < 'D';
    -- 81년 이전에 입사한 사원의 모든 필드
SELECT * FROM EMP WHERE HIREDATE <'81/01/01';
-- EMP 테이블의 구조
DESC EMP; 
    -- 82년도에 입사한 사원의 모든 필드
SELECT * FROM EMP WHERE HIREDATE >= '82/01/01' AND HIREDATE <= '82/12/31';
    -- 날짜 표기법 셋팅 (현재 : RR/MM/DD)
ALTER SESSION SET NLS_DATE_FORMAT='MM-DD-RR';
ALTER SESSION SET NLS_DATE_FORMAT='RR/MM/DD';
    -- 연봉이 24000 이상인 직원의 ENAME, SAL, 연봉 출력 (연봉 = SAL*12)
SELECT ENAME, SAL, SAL*12 연봉 FROM EMP WHERE SAL*12 >= 24000;
SELECT ENAME, SAL, SAL*12 연봉  -- (3)
    FROM EMP              -- (1)
    WHERE SAL*12 >= 24000   -- (2) WHERE 절에는 필드의 별칭을 쓸 수 없다
    ORDER BY 연봉;        -- (4) ORDER BY절에트 필드의 별칭을 쓸 수 있다.
    -- 10번 부서에서 JOB(직책)이 MANAGER인 사람의 모든 필드
SELECT * FROM EMP WHERE DEPTNO = 10 AND JOB = 'MANAGER';
    -- 10번 부서이거나 직책이 MANAGER인 사람의 모든 필드
SELECT * FROM EMP WHERE DEPTNO = 10 OR JOB = 'MANAGER' ;
    -- 부서번호가 10번이 아닌 사람의 모든 필드
SELECT * FROM EMP WHERE DEPTNO != 10;
SELECT * FROM EMP WHERE NOT DEPTNO = 10;

-- 5. 산술표현식
SELECT ENAME, SAL, SAL+100 UPGRADE_SAL FROM EMP WHERE DEPTNO=10;
    -- 모든 사원의 이름, 월급(SAL), 상여(COMM), 연봉(SAL*12+COMM)
    -- 산술연산의 결과는 null을 포함하면 결과는 NULL
    -- NVL(NULL일수도 있는 필드명, 대치값) 반드시, 매개변수 둘은 타입 같아야 함
SELECT ENAME, SAL, COMM, SAL*12+COMM 연봉 FROM EMP; 
SELECT ENAME, SAL, COMM, SAL*12+NVL(COMM, 0) FROM EMP;
SELECT ENAME, SAL, NVL(COMM,0), SAL*12+NVL(COMM, 0) FROM EMP;
    -- 모든 사원의 사원명,상사사번(MGR)을 출력(상사가 없으면 0으로)
SELECT ENAME, NVL(MGR,0) FROM EMP;

-- 6. 연결연산자(||) : 열이나 문자를 연결
SELECT ENAME || '은 ' || JOB "EMPLOYEES" FROM EMP;
    -- "SMITH : 1 YEAR SALARY = XXXX"과 같이 모든 행이 출력(연봉=SAL*12+COMM)
SELECT ENAME || ': 1 YEAR SALARY = ' || (SAL*12+NVL(COMM,0)) "MSG" FROM EMP;

-- 7. 중복제거 (DISTINCT)
SELECT DISTINCT JOB FROM EMP;
SELECT DISTINCT DEPTNO FROM EMP;
SELECT * FROM DEPT;

-- ★ 연습문제 꼭 풀기
    --1. emp 테이블의 구조 출력
DESC EMP; -- ORACLE 명령
    --2. emp 테이블의 모든 내용을 출력 
SELECT * FROM EMP;
    --3. 현 scott 계정에서 사용가능한 테이블 출력
SHOW USER;
SELECT * FROM TAB;
    --4. emp 테이블에서 사번, 이름, 급여, 업무, 입사일 출력
SELECT EMPNO, ENAME, SAL, JOB, HIREDATE FROM EMP;
    --5. emp 테이블에서 급여가 2000미만인 사람의 사번, 이름, 급여 출력
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL<2000;
    --6. 입사일이 81/02이후에 입사한 사람의 사번, 이름, 업무, 입사일 출력
SELECT EMPNO, ENAME, JOB, HIREDATE FROM EMP WHERE HIREDATE >= '81/02/01';
    --7. 업무가 SALESMAN인 사람들 모든 자료 출력
SELECT * FROM EMP WHERE JOB = 'SALESMAN';
    --8. 업무가 CLERK이 아닌 사람들 모든 자료 출력
SELECT * FROM EMP WHERE JOB != 'CLERK';
SELECT * FROM EMP WHERE JOB <> 'CLERK';
SELECT * FROM EMP WHERE JOB ^= 'CLERK';
SELECT * FROM EMP WHERE NOT JOB = 'CLERK';
    --9. 급여가 1500이상이고 3000이하인 사람의 사번, 이름, 급여 출력
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>=1500 AND SAL<=3000;
    --10. 부서코드가 10번이거나 30인 사람의 사번, 이름, 업무, 부서코드 출력
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE DEPTNO=10 OR DEPTNO=30;
    --11. 업무가 SALESMAN이거나 급여가 3000이상인 사람의 사번, 이름, 업무, 부서코드 출력
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE JOB='SALESMAN' OR SAL>=3000;
    --12. 급여가 2500이상이고 업무가 MANAGER인 사람의 사번, 이름, 업무, 급여 출력
SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SAL>=2500 AND JOB = 'MANAGER';
    --13.“ename은 XXX 업무이고 연봉은 XX다” 스타일로 모두 출력(연봉은 SAL*12+COMM)
SELECT ENAME||'은(는) '||job||'업무이고 연봉은'||(SAL*12+NVL(COMM,0)) ||'다'
    FROM EMP;

-- 8. SQL 연산자(BETWEEN, IN, LIKE, IS NULL)
  -- (1) BETWEEN  
    -- SAL이 1500이상 300이하인 사번, 이름, 급여
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>=1500 AND SAL<=3000;
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL BETWEEN 1500 AND 3000;
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL BETWEEN 3000 AND 1500; -- x
    -- 1500미만 3000초과
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL NOT BETWEEN 1500 AND 3000;

    -- 필드명 BETWEEN A AND B - A부터 B까지(A, B포함. A<B)
    -- 82년도에 입사한 직원의 모든 필드 출력
SELECT * FROM EMP WHERE HIREDATE BETWEEN '82/01/01' AND '81/12/31';
    -- 사원 이름이 'B','C'로 시작하는 사원의 모든 필드
SELECT * FROM EMP WHERE ENAME BETWEEN 'B' AND 'D' AND ENAME != 'D';

  -- (2) IN
    -- 부서번호가 10, 20번, 40번 부서 사원의 모든 필드
SELECT * FROM EMP WHERE DEPTNO=10 OR DEPTNO=20 OR DEPTNO=40;
SELECT * FROM EMP WHERE DEPTNO IN (10,20,40);
    -- 부서번호가 10,20,40번 부서를 제외한 사원의 모든 필드
SELECT * FROM EMP WHERE DEPTNO NOT IN (10,20,40);
SELECT * FROM EMP WHERE DEPTNO!=10 AND DEPTNO !=20 AND DEPTNO !=40;
    -- 사번이 7902, 7788, 7566인 사원의 모든 필드
SELECT * FROM EMP WHERE EMPNO IN (7902, 7788, 7566);
  -- (3) LIKE 연산
    -- 이름이 M으로 시작하는 사원의 모든 필드
SELECT * FROM EMP WHERE ENAME LIKE 'M%'; -- %:0글자 이상 / _:한글자
    -- 이름에 N이 들어가는 사원의 모든 필드
SELECT * FROM EMP WHERE ENAME LIKE '%N%';    
    -- 이름이 S로 끝나는 사원의 모든 필드
SELECT * FROM EMP WHERE ENAME LIKE '%S';
    -- SAL이 5로 끝나는 사원의 모든 필드
SELECT * FROM EMP WHERE SAL LIKE '%5';
    -- 82년도에 입사한 사원의 모든 필드
SELECT * FROM EMP WHERE HIREDATE LIKE '82/%';
    -- 1월에 입사한 사원의 모든 필드
SELECT * FROM EMP WHERE HIREDATE LIKE '__/01/__';    
    -- 82년도가 아닌 년도에 입사한 사원의 모든 필드
SELECT * FROM EMP WHERE HIREDATE NOT LIKE '82/%';
    -- 이름에 A가 들어간 사원의 모든 필드를 출력
SELECT * FROM EMP WHERE ENAME LIKE '%A%';
    -- 이름에 %가 들어간 사원의 모든 필드를 출력
SELECT * FROM EMP WHERE ENAME LIKE '%\%%' ESCAPE '\';
INSERT INTO EMP VALUES (9999, 'LISA%',NULL,NULL,NULL,9000,9900,40);
SELECT * FROM EMP WHERE EMPNO=9999;
ROLLBACK; -- DML(데이터 조작어)를 취소
  -- (4) IS NULL
    -- 상여금이 없는 사원의 모든 필드 (comm이 널이거나 0)
SELECT * FROM EMP WHERE COMM IS NULL OR COMM = 0;
    -- 상여금이 있는 사원의 모든 필드
SELECT * FROM EMP WHERE NOT COMM IS NULL AND COMM !=0;

-- 9. 정렬(오름차순, 내림차순)
SELECT ENAME, SAL FROM EMP ORDER BY SAL; -- 오름차순 정렬
SELECT ENAME, SAL FROM EMP ORDER BY SAL ASC; -- 오름차순 정렬
SELECT ENAME, SAL FROM EMP ORDER BY SAL DESC; -- 내림차순 정렬
SELECT ENAME, SAL FROM EMP ORDER BY ENAME;
SELECT ENAME, SAL FROM EMP ORDER BY HIREDATE; -- 날짜순서대로 정렬
SELECT ENAME, SAL, HIREDATE FROM EMP ORDER BY HIREDATE DESC; -- 최신순으로 정렬
    -- 이름, 연봉(SAL*12+COMM)을 출력(연봉이 높은 순으로. 연봉이 같은 경우 이름순으로)
SELECT ENAME, SAL*12+NVL(COMM,0) 연봉 
    FROM EMP ORDER BY 연봉 DESC, ENAME ASC;
    -- 이름, 연봉(SAL*12+COMM)을 출력(연봉이 낮은 순으로. 연봉이 같은 경우 이름순으로)
SELECT ENAME, SAL*12+NVL(COMM,0) FROM EMP ORDER BY SAL*12+NVL(COMM,0), ENAME;
    -- 사번, 이름, HIREDATE, SAL, 부서번호 출력(부서순, 부서가 같으면 입사일순으로 오름차순정렬)
SELECT EMPNO, ENAME, HIREDATE, SAL, DEPTNO FROM EMP ORDER BY DEPTNO, HIREDATE;

-- ★ 셤 연습문제
  --1.EMP 테이블에서 sal이 3000이상인 사원의 empno, ename, job, sal을 출력
SELECT EMPNO, ENAME, JOB, SAL 
    FROM EMP 
    WHERE SAL>=3000;
  --2.EMP 테이블에서 empno가 7788인 사원의 ename과 deptno를 출력
SELECT ENAME, DEPTNO 
    FROM EMP 
    WHERE EMPNO=7788;
  --3.연봉(sal*12+comm)이 24000 이상인 사번, 이름, 급여 출력 (급여순정렬)
SELECT EMPNO, ENAME, SAL 
    FROM EMP 
    WHERE (SAL*12+NVL(COMM,0))>=24000 
    ORDER BY SAL;
  --4.EMP 테이블에서 hiredate가 1981년 2월 20과 1981년 5월 1일 사이에 입사한 사원의 
  --ename,job,hiredate을 출력하는 SELECT 문장을 작성 (단 hiredate 순으로 출력)
SELECT ENAME, JOB, HIREDATE FROM EMP 
    WHERE HIREDATE BETWEEN '81/02/20' AND '81/05/01' 
    ORDER BY HIREDATE;
SELECT ENAME, JOB, HIREDATE FROM EMP 
    WHERE HIREDATE>= '81/02/20' AND HIREDATE<='81/05/01' 
    ORDER BY HIREDATE ;
-- 날짜 설정
ALTER SESSION SET NLS_DATE_FORMAT = 'MM/DD/YYYY';
ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD';
-- 문자형를 날짜형으로 변환 : TO_DATE('81/02/20', 'RR/MM/DD')
-- 날짜형을 문자형으로 변환 : TO_CHAR(날짜형, 패턴)
SELECT ENAME, TO_CHAR(HIREDATE,'RR-MM-DD') FROM EMP;
SELECT ENAME, JOB, HIREDATE FROM EMP 
    WHERE HIREDATE BETWEEN TO_DATE('1981/02/20','YYYY/MM/DD') 
                    AND TO_DATE('1981/05/01' ,'YYYY/MM/DD')
    ORDER BY HIREDATE;
SELECT ENAME, JOB, HIREDATE FROM EMP 
    WHERE HIREDATE BETWEEN TO_DATE('81/02/20','RR/MM/DD') 
                    AND TO_DATE('81/05/01' ,'RR/MM/DD')
    ORDER BY HIREDATE;        
  --5.EMP 테이블에서 deptno가 10,20인 사원의 모든 정보를 출력 (단 ename순으로 정렬)
SELECT * FROM EMP WHERE DEPTNO=10 OR DEPTNO=20 ORDER BY ENAME;
SELECT * FROM EMP WHERE DEPTNO IN (10,20) ORDER BY ENAME;

  --6.EMP 테이블에서 sal이 1500이상이고 deptno가 10,30인 사원의 ename과 sal를 출력
  -- (단 HEADING을 employee과 Monthly Salary로 출력)
SELECT ENAME employee, SAL "Monthly Salary" FROM EMP 
  WHERE SAL>=1500 AND DEPTNO IN (10,30);
SELECT ENAME employee, SAL "Monthly Salary" FROM EMP 
  WHERE SAL>=1500 AND (DEPTNO=10 OR DEPTNO=30);
  
  --7.EMP 테이블에서 hiredate가 1982년인 사원의 모든 정보를 출력
SELECT * FROM EMP WHERE HIREDATE LIKE '82%';
--날짜 셋팅 변경
ALTER SESSION SET NLS_DATE_FORMAT = 'MM/DD/YYYY';
ALTER SESSION SET NLS_DATE_FORMAT = 'RR/MM/DD';
-- TO_DATE(), TO_CHAR()함수 이용
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE,'YYYY') = 1982;
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE,'RR') = 82;
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE, 'RR/MM/DD') LIKE '82%';

  --8.이름의 첫자가 C부터  P로 시작하는 사람의 이름, 급여 이름순 정렬
SELECT ENAME, SAL FROM EMP 
  WHERE (ENAME BETWEEN 'C' AND 'Q') AND ENAME!='Q'
  ORDER BY SAL, ENAME;
  --9.EMP 테이블에서 comm이 sal보다 10%가 많은 모든 사원에 대하여 이름, 급여, 상여금을 
  --출력하는 SELECT 문을 작성
SELECT ENAME, SAL, COMM FROM EMP WHERE COMM>SAL*1.1 ;
  --10.EMP 테이블에서 job이 CLERK이거나 ANALYST이고 sal이 1000,3000,5000이 아닌 사원의 모든 필드
SELECT * FROM EMP WHERE (JOB='CLERK' OR JOB='ANALYST') 
  AND SAL NOT IN (1000,3000,5000);
SELECT * FROM EMP WHERE JOB IN('CLERK','ANALYST') 
  AND SAL NOT IN (1000,3000,5000);
SELECT * FROM EMP WHERE (job='CLERK' OR job='ANALYST') 
  AND NOT (SAL IN (1000,3000,5000));
  --11.EMP 테이블에서 ename에 L이 두 자가 있고 deptno가 30이거나 또는 mgr이 7782인 사원의 
  --모든 정보를 출력하는 SELECT 문을 작성하여라.
SELECT * FROM EMP 
  WHERE ENAME LIKE '%L%L%' AND (DEPTNO=30 OR MGR=7782);
  --12.사원 테이블에서 입사일이 81년도인 직원의 사번,사원명, 입사일, 업무, 급여를 출력
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP 
  WHERE HIREDATE LIKE '81%';
-- TO_CHAR()함수 이용하여 어떤 시스템에서도 다 실행되도록
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP 
    WHERE TO_CHAR(HIREDATE, 'RR') = 81;
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP
  WHERE HIREDATE BETWEEN '81/01/01' AND '81/12/31';
-- TO_DATE() 함수 이용하여 어떤 시스템에서도 다 실행되도록
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP
    WHERE HIREDATE BETWEEN TO_DATE('81/01/01', 'RR/MM/DD') 
        AND TO_DATE('81/12/31', 'RR/MM/DD');
  --13.사원 테이블에서 입사일이81년이고 업무가 'SALESMAN'이 아닌 직원의 사번, 사원명, 입사일, 
  -- 업무, 급여를 검색하시오.
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP 
  WHERE HIREDATE LIKE '81%' AND JOB!='SALESMAN';
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP
  WHERE TO_CHAR(HIREDATE, 'RR')=81 AND JOB !='SALESMAN';
  --14.사원 테이블의 사번, 사원명, 입사일, 업무, 급여를 급여가 높은 순으로 정렬하고, 
  -- 급여가 같으면 입사일이 빠른 사원으로 정렬하시오.
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP 
      ORDER BY SAL DESC, HIREDATE;
  --15.사원 테이블에서 사원명의 세 번째 알파벳이 'N'인 사원의 사번, 사원명을 검색하시오
SELECT EMPNO, ENAME FROM EMP WHERE ENAME LIKE '__N%';
  --16.사원 테이블에서연봉(SAL*12)이 35000 이상인 사번, 사원명, 연봉을 검색 하시오.
SELECT EMPNO, ENAME, SAL*12 연봉 FROM EMP WHERE SAL*12 > 35000;







