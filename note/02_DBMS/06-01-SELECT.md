__SELECT [DISTINCT] { *, column [Alias], ... }  
FROM 테이블명  
[WHERE condition]  
[ORDER BY {column, expression} [ASC|DESC]] ;__  
  
  <br> 
  
SELECT : 원하는 컬럼 선택  
*:  테이블의 모든 column 출력  
Alias : 해당 column에 대한 다른 이름 부여  
DISTINCT : 증복 행 제거 옵션  
FROM : 원하는 데이터가 저장된 테이블명을 기술  
WHERE : 조회되는 행을 제한하기 위한 조건 추가  
condition : column, 표현식, 상수 및 비교연산자  
ORDER BY : 정렬을 위한 옵션(ASC : 오름차순이고 default, DESC 내림차순  
<br>

### 1. SQL 문장 작성법
- SQL 문장은 대소문자를 구별하지 않는다.
- SQL 문장은 한 줄 또는 여러 줄에 입력될 수 있다.
- 절은 보통 읽고 편집하기 쉽게 줄을 나누도록 한다. (권장)
- 탭과 줄 넣기(들여쓰기)는 코드를 보다 읽기 쉽게 하기 위해 사용된다. (권장)
- 일반적으로 키워드는 대문자로 입력한다.
- 키워드를 제외한 다른 모든 단어, 즉 테이블 이름, 열 이름은 소문자로 입력하기도 한다.
- 명령어의 끝은 ;
- 주석 처리는 --

![이미지](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FWj5i9%2Fbtq6nbalQRh%2F4D8Gku1sb3H3qBgu45j4k1%2Fimg.png)
![계층구조](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FA9gkQ%2Fbtq6ll6lOax%2FyfPmyoVyyUliKNkV3Fknh0%2Fimg.jpg)


### 2. SQL 문장 실행
__SELECT * FROM TAB;__ --scott이 소유하고 있는 table을 전부 보여줌  
scott(사용자)가 소유한 테이블  
__SELECT * FROM dept;__ -- dept테이블 데이터 전체 보기  
__DESC dept;__          -- dept테이블의 구조보기  
not null : null값이 있으면 안 된다.  
number(4) : 부서코드는 정수 4자리  
number(7,2) ; 총자리수 7자리 중 소수점 이하는 2자리  
__SELECT * FROM emp;__  
__SELECT empno, ename, sal, job FROM emp;  
SELECT empno AS "사번", ename AS "직원 이름", job AS "직업" FROM emp;__ -- 별명 사용  
__SELECT empno 사번, ename 이름, job 직업 FROM emp;  
SELECT empno AS NO, ename AS NAME, job FROM emp;    
SELECT empno, ename, job FROM emp;__  

### 3. WHERE 조건과 비교연산자 : 같다(=), 크거나같다(>=) 작거나같다(<=) 다르다(<> ^= !=)  
__SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL = 3000;  
SELECT empno, ename, sal FROM emp WHERE sal <> 3000;  
SELECT empno, ename, sal FROM emp WHERE sal != 3000;  
SELECT empno, ename, sal FROM emp WHERE sal ^= 3000;__  
<>, !=, ^= 모두 다르다를 의미  
__SELECT * FROM emp WHERE deptno=10;  
SELECT EMPNO, ENAME, SAL FORM emp WHERE ename=’FORD’;__  
SQL에서 문자열이나 날짜는 반드시 작은따옴표안에 표시해야 합니다.  
SQL문에 사용되는 키워드인 SELECT나 FORM이나 WHERE 등은 대소문자를 구별하지 않지만 테이블 내에 저장된 데이터 값은 대소문자를 구분하기에 ‘FORD’ 와 ‘ford’는 다릅니다.  
__SELECT * FROM emp WHERE sal>=2000 AND SAL<3000;__ -- 2000대 sal  
__SELECT * FROM emp WHERE hiredate <= ‘82/01/01’;__  
emp테이블에서 82년1월1일이전에 입사한 사원에 대한 모든 정보를 출력  
__SELECT ENAME 이름, SAL 급여, SAL*12 연봉 FROM EMP WHERE 연봉>2400 ORDER BY 급여;__ —- error  
날짜포맷은 반드시 다음과 같다는 전제를 한다  
__ALTER SESSION SET NLS_DATE_FORMAT=’RR/MM/DD’;__  
  
### 4. 논리연산자
__SELECT * FROM emp WHERE deptno=10 AND job=’MANAGER’;  
SELECT * FROM WHERE deptno=10 OR job=’MANAGER’;  
SELECT * FROM emp WHERE NOT deptno = 10;  
SELECT * FROM emp WHERE sal>=2000 AND sal<=3000;__  
2000이상3000이하인 사원정보 출력  

### 5. 산술표현식
__SELECT ename, sal, sal+300 AS “올릴월급” FROM emp;__  
emp 테이블의 sal을 300 증가 시키기 위해 덧셈연산자를 사용하여 sal+300을 출력. 계산된 결과인 열[SAL+300]은 emp 테이블의 새로운 열이 아니고 단지 디스플레이를 위한 것.  
__SELECT ename, sal, comm, sal*12 월급합, sal*12+comm 연봉 FROM emp;__  
null값의 처리. 행이 특정열에 대한 데이터값이 없다면 그 값은 null이 됩니다. null값은 이용할 수 없거나 지정되지 않았거나 알 수 없거나 적용할 수 없는 값. Null은 1이나 공백과는 다르다. 0은 숫자이며 공백은 문자로 볼 수 있다. 어떠한 datatype도 null값을 포함할 수 있으나 주키는 null값이 허용되지 않는다.  
null값을 포함한 산술표현식 결과는 NULL이 된다. 그래서 다음과 같이 NVL함수 를 이용한다.  
__SELECT ename, sal, comm, sal+comm FROM emp;__  
__SELECT ename, sal, com, sal*12, sal*12+NVL(comm,0) FROM emp;__  
NVL(expr1, expr2)  expr1은 null값을 포함하고 있는 column이나 표현식                        
expr2는 null변환을 위한 목표값  
expr1과 expr2는 같은 타입이여야 한다  
NVL(hiredate , ‘99/01/01’) DATA형에서의 예  
NVL(job, ‘업무없음’)      char형에서의 예  
__SELECT ename, sal, NVL(comm, 0) FROM emp;__  

### 6. 연결연산자(||) : 열이나 문자를 다른 열에 연결하는 연산  
__SELECT ename || ‘  ‘ || job as “employees” FROM emp;  
SELECT ename || ‘ is a ‘ || job as “employees Details” FROM emp;  
SELECT ename || ‘ : 1 year salary = ‘ || sal*12 FROM emp;__  

컬럼명에 별칭은 프로그램 영역에서 중요한 의미를 가진다. 대다수 프로그램은 별칭으로 간편하게 사용하는 경우가 많다. Ex. rs.getString(“별칭/컬럼명”);   
__SELECT ‘사번은 ‘ || empno || ‘입니다’ show FROM emp;__
실제 어플리케이션에서는 rs.getString(“show”)로 처리
__SELECT ename ||'은 ' || job
FROM emp
WHERE sal>=2000 AND SAL<3000;__
  
### 7. 중복제거 DISTINCT ; DISTINCT를 사용하여 나타나는 결과는 기본적으로 오름차순 정렬  
__SELECT job FROM emp;  SELECT DISTINCT job FROM emp;  
SELECT DISTINCT DEPTNO FROM emp;  
SELECT DISTINCT DEPTNO, JOB FROM emp;__  
emp테이블에서 deptno별로 job를 한번씩 출력   

### 8. SQL 연산자
- DISTINCT 필드; 필드 중복제거  
- BETWEEN a AND b : a부터 b (a,b값 포함. a가 작은 값)  
- IN(list)            : list의 값 중 어느 하나와 일치한다  
- LIKE pattern       : 검색하고자 하는 값을 정확히 모를 경우 pattern과 일치하는지를 검색하며 pattern에는 다음의 두가지 와일드카드가 사용된다.  
- % : 문자가 없거나, 하나 이상의 문자가 어떤 값이 와도 상관없다.  
- _ : 하나의 문자가 어떤 값이 와도 상관없다  
- IS NULL                : null값을 가졌다  
- NOT BETWEEN a AND b : a와 b 사이에 있지 않다(a,b값 포함되지 않음)  
- NOT IN (list)            : list의 값과 일치하지 않는다.  
- NOT LIKE pattern       : 문자형태가 pattern과 일치하지 않는다.  
- NOT IS NULL           : null값을 갖지 않다  
__SELECT DISTINCT deptno FROM emp;__ -- 부서코드들 중복제거해서 출력  
__SELECT DISTINCT job FROM emp;  
SELECT DISTINCT deptno, job FROM emp;  
SELECT ename, sal FROM emp WHERE sal between 100 and 1500;  
SELECT empno, ename, job, sal, hiredate FROM emp WHERE empno IN (7902,7788,7566);__  
이름, 상사의사번, 급여 (이름이 M으로 시작)  
__SELECT ename, mgr, sal FROM emp WHERE ename LIKE 'M%';  
SELECT ename, mgr, sal FROM emp WHERE ename LIKE '%N%';__ -- %0글자이상  
__SELECT ename, mgr, sal FROM emp WHERE ename LIKE '_A%';__ -- _한글자  
__SELECT ename from emp where ename like ‘K%’;__ -- 이름이 K로 시작하는 이름  
__SELECT ename from emp WHERE ename LIKE ‘%S’;__ -- 이름이 S로 끝나는 이름  
이름에 %가 들어간 이름  
__SELECT ename FORM emp WHERE ename LIKE ‘%\%%’ ESCAPE ‘\’;__  
EMP 테이블에서 hiredate가 1982년인 사원의 empno,ename,job,sal,hiredate,deptno 를 출력하시오  
__SELECT ename FROM emp WHERE hiredate >= '82/01/01' AND hiredate <= '82/12/31';  
SELECT empno,ename,job,sal,hiredate,deptno FROM emp where hiredate>=to_date('1982/01/01', 'yyyy/mm/dd') and hiredate <= to_date('1982/12/31', 'yyyy/mm/dd');__  
__SELECT empno,ename,job,sal,hiredate,deptno FROM emp where hiredate LIKE ‘82%’;__  
EMP 테이블에서 입사일이 1월인 사원의 EMPNO, ENAME, JOB, SAL, HIREDATE을 출력하시오  
__SELECT EMPNO, ENAME, JOB, SAL, HIREDATE FROM EMP WHERE HIREDATE LIKE '__/01/__';__  
__SELECT empno,ename,job,sal,comm,deptno FROM emp WHERE comm IS NULL;  
SELECT ename, deptno FROM emp WHERE deptno IN (10, 30);  
SELECT ename, deptno FROM emp WHERE deptno NOT IN (10, 30);  
SELECT empno,ename,job,sal,deptno FROM emp WHERE job NOT IN ('MANAGER','CLERK','ANALYST');  
SELECT hiredate,empno,ename,job,sal,deptno  FROM emp  ORDER BY hiredate;  
SELECT empno, ename, FROM emp WHERE ename LIKE ‘%K’;__  

### 9. 정렬을 위한 ORDER BY절
- ASC 오름차순. Default  
- DESC 내림차순  
__SELECT *  FROM emp ORDER BY SAL;__ -- 오름차순 정렬(기본) ASC  
__SELECT * FROM emp ORDER BY sal ASC;__ -- ASC 오름차순  
__SELECT * FROM emp ORDER BY sal DESC;__ -- 내림차순 정렬  
__SELECT ename, hiredate FROM emp ORDER BY hiredate DESC;__ -- 내림차순  
__SELECT ename, hiredate FROM emp ORDER BY hiredate;__ -- 오름차순  
연봉이 작은 것부터 순서대로 출력(연봉이 같으면 입사일로 나중인 사람 순으로 정함)  
__SELECT ename, sal*12+NVL(comm, 0) 연봉 FROM emp ORDER BY 연봉, hiredate DESC;__  
