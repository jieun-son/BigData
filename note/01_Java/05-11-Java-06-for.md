## for의 조건문
세미콜론(;)을 구분자로 세 부분으로 나뉘어진다.
```sh
for (초기치; 조건문; 증가치) {
	반복할 명령문들
}
```

### 1) 전형적인 for문
```sh
String[] numbers = {"one", "two", "three"};
for(int i=0; i<numbers.length; i++) {
    System.out.println(numbers[i]);
}
```
결과는 다음과 같다.  
```sh
one
two
three
```
위 예에서 초기치는 i=0이 되고 조건문은 i<numbers.length 그리고 증가치는 i++ 이 된다. 즉 i값이 numbers의 갯수보다 작을 동안 계속 i값을 1씩 증가시킨다는 의미이다. while문과 비슷하지만 보다 잘 짜여진 느낌이 나는것이 for문이다.  
  
“총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고 그렇지 않으면 불합격이다. 합격인지 불합격인지에 대한 결과를 보여준다.”  
우선 5명의 학생의 시험성적을 다음과 같이 표현 해 보았다.  
```sh
int[] marks = {90, 25, 67, 45, 80};
```
1번 학생은 90점이고 5번 학생은 80점이다.  
이런 점수를 차례로 검사해서 합격했는지 불합격했는지에 대한 통보를 해주는 프로그램을 만들어 보자.  
```sh
int[] marks = {90, 25, 67, 45, 80};
for(int i=0; i<marks.length; i++) {
    if (marks[i] >= 60) {
        System.out.println((i+1)+"번 학생은 합격입니다.");
    }else {
        System.out.println((i+1)+"번 학생은 불합격입니다.");
    }
}
```
i값이 1씩 증가하며 for문 안의 문장들이 수행된다. 따라서 marks[i]는 차례로 90, 25, 67, 45, 80의 값을 갖게 된다. marks[i]가 60 이상이면 합격 메시지를 출력하고 60을 넘지 않으면 불합격 메시지를 출력한다. i가 marks의 갯수인 5보다 크게되면 for문이 중지된다.  
  
### 2) for 와 continue
while문에서 알아보았던 continue가 for문에서도 역시 동일하게 적용이 된다. 즉, for문 안의 문장을 수행하는 도중에 continue문을 만나면 for문의 처음으로 돌아가게 된다.  
위의 예제를 그대로 이용해서 60점 이상인 사람에게는 축하 메시지를 보내고 나머지 사람에게는 아무런 메시지도 전하지 않는 프로그램을 만들어 보자.  
```sh
int[] marks = {90, 25, 67, 45, 80};
for(int i=0; i<marks.length; i++) {
    if (marks[i] < 60) {
        continue;
    }
    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
}
```
점수가 60점 미만인 학생일 경우에는 marks[i] < 60이 참이 되어 continue문이 수행된다. 따라서 축하 메시지를 출력하는 부분을 수행하지 않고 for문의 첫부분으로 돌아가게 된다.  
  
    
다음과 같은 출력형식의 구구단을 출력하는 프로그램을 구현해 보자  
           2x1=2   3x1=3   4x1=4    5x1=5   6x1=6   7x1=7    8x1=8   9x1=9  
           2x2=4   3x2=6   4x2=8    5x2=10  6x2=12  7x2=14  8x2=16  9x2=18  
           2x3=6   3x3=9   4x3=12  5x3=15  6x3=18  7x3=21  8x3=24  9x3=27  
           2x4=8   3x4=12  4x4=16  5x4=20  6x4=24  7x4=28  8x4=32  9x4=36  
           2x5=10  3x5=15  4x5=20  5x5=25  6x5=30  7x5=35  8x5=40  9x5=45  
           2x6=12  3x6=18  4x6=24  5x6=30  6x6=36  7x6=42  8x6=48  9x6=54  
           2x7=14  3x7=21  4x7=28  5x7=35  6x7=42  7x7=49  8x7=56  9x7=63   
           2x8=16  3x8=24  4x8=32  5x8=40  6x8=48  7x8=56  8x8=64  9x8=72  
           2x9=18  3x9=27  4x9=36  5x9=45  6x9=54  7x9=63  8x9=72  9x9=81   
```sh
package com.lec.loop;

public class Quiz04_for {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%dx%d=%d\t", j, i, i*j);
				if(j == 9) {
					System.out.println();
				}//if
			}//for-j
		}//for-i
	}//main
}//class
```

### 3) for each문
for each는 J2SE 5.0 부터 추가되었다. for each 라는 키워드가 따로 있는 것은 아니고 동일한 for를 이용한다. 하지만 조건식 부분이 조금 다르다. 보통 다른 언어에서 for each 라고 많이 하므로 자바에서도 보통 for each문이라고 말한다.  
  
다음은 이전에 공부했던 평범한 for 문장이다.  
```sh
String[] numbers = {"one", "two", "three"};
for(int i=0; i<numbers.length; i++) {
    System.out.println(numbers[i]);
}
```
for each 구조로 변경하면 다음과 같다.  
```sh
String[] numbers = {"one", "two", "three"};
for(String number: numbers) {
    System.out.println(number);
}
```
for each 문의 구조는 다음과 같다.  
```sh
for (type var: iterate) {
    body-of-loop
}
```

위 iterate는 루프를 돌릴 객체이고 iterate 객체에서 한개씩 순차적으로 var에 대입되어 for문을 수행하게 된다. iterate부분에 들어가는 타입은 루프를 돌릴수 있는 형태인 배열 및 ArrayList등이 가능하다.  
다음은 위 예제를 ArrayList 로 재 구현한 예제이다. for문의 사용법은 String[] 배열을 사용했을 때와 완전히 동일하다.  
```sh
ArrayList<String> numbers = new ArrayList<String>();
numbers.add("one");
numbers.add("two");
numbers.add("three");

for(String number: numbers) {
    System.out.println(number);
}
```
단, for each문은 따로 반복회수를 명시적으로 주는 것이 불가능하고, 1스탭씩 순차적으로 반복될때만 사용가능하다는 제약이 있다.  

