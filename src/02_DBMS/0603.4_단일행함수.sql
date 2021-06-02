-- [IV] 단일행함수;내장함수
-- 함수 = 단일행함수 + 그룹함수(집계함수)
SELECT HIREDATE, TO_CHAR(HIREDATE, 'YY"년"MM"월"DD"일"') FROM EMP; -- 단일행함수
SELECT ENAME, INITCAP(ENAME) FROM EMP; -- 단일행함수
SELECT SUM(SAL) FROM EMP; -- 그룹함수(집계함수)
SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY DEPTNO; -- 그룹함수(부서번호별 합계)
SELECT SAL FROM EMP;
-- EX. 숫자관련함수, 문자관련함수, 날짜관련함수, 형변환함수, NVL(), ETC...
-- 1. 숫자함수
-- DUAL 테이블  : 오라클에서 제공하는 1행1열자리 DUMMY TABLE
SELECT * FROM DUAL;
DESC DUAL;
SELECT * FROM DUMMY;
DESC DUMMY;
SELECT ABS(-9) FROM DUAL; -- 절대값
SELECT FLOOR(34.5678) FROM DUAL; -- 소수점에서 내림
SELECT FLOOR(34.5678*100)/100 FROM DUAL; -- 소수점 두자리에서 내림
SELECT TRUNC(34.5678) FROM DUAL; -- 소수점에서 내림
SELECT TRUNC(34.5678, 2) FROM DUAL; -- 소수점 두자리에서 내림
SELECT TRUNC(34.5678, -1) FROM DUAL; -- 일의 자리에서 내림
  -- EMP 테이블에서 이름, 급여(십의 자리에서 내림)
  SELECT ENAME, SAL, TRUNC(SAL, -2) FROM EMP;
SELECT CEIL(34.5678) FROM DUAL; -- 소수점에서 올림
SELECT ROUND(34.5678) FROM DUAL; -- 소수점에서 반올림
SELECT ROUND(34.5678, 2) FROM DUAL; -- 소수점 두번째 자리에서 반올림
SELECT ROUND(34.5678, -1) FROM DUAL; -- 일의 자리에서 반올림

SELECT MOD(9,2) FROM DUAL; -- 나머지 연산자
  -- 홀수에 입사한 사원의 모든 정보
  SELECT * FROM EMP WHERE MOD(TO_CHAR(HIREDATE, 'MM'), 2)=1;

-- 2. 문자함수







