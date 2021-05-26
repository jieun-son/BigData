### 1. JDK 라이브러리(자바 표준 라이브러리)

 

지금까지 무심코 사용해왔던 String 클래스와 System 클래스 모두 이 라이브러리에 속한 클래스이다. 이 라이브러리는 JDK 안에 포함되어 있는데, 자바 가상기계가 자바 프로그램을 실행할 때 이 라이브러리의 클래스와 인터페이스들을 자동으로 읽어 들이기 때문에 우리가 지금까지 그 존재를 인식하지 않고도 사용할 수 있었던 것이다.

 

* JDK의 위치

C:\Program Files\Java\jdk1.8.0_271\jre\lib\rt.jar

혹은

C:\Program Files\Java\jre1.8.0_271\lib\rt.jar

 

JRE System Library밑의 rt.jar밑의 java.lang밑의 System.class와 String.class를 확인한다.

 

* JDK에서 제공하는 많은 패키지

① java.lang 자바 프로그램의 기본적인 기능을 제공.

명시적으로 지정하지 않아도 모든 자바 프로그램에 포함되는 패키지.

java.lang.String 이나 java.lang.Exception 은 모두 java.lang. 생략 가능.

② java.util 유용한 유틸리티 클래스를 제공

③ java.io 입출력 기능을 제공하는 패키지

④ java.awt 그래픽 유저 인터페이스(GUI)를 구축하기 위한 다양한 컴퓨넌트를 제공하는 패키지

⑤ java.awt.event awt 컴포넌트들의 이벤트를 제어하는 패키지

 

이러한 라이브러리 안의 클래스나 인터페이스를 API라 부르고 http://java.sum.com를 통해 API 규격서를 다운로드 받아 로컬디스크에 저장해두고 수시로 본다. ( http://docs.oracle.com/javase/8/docs/api )

 
Java Platform SE 8

 

docs.oracle.com
 

 

### 2. JAVA 필수 API

 

JAVA는 개발자들이 편리하게 이용할 수 있는 풍부한 클래스들이 많다. 이러한 클래스들을 이용해서 개발자들은 깊은 지식 없이도 그냥 사용할 수 있다. 이러한 기능들을 정의해둔 클래스들을 API(Application Programming Interface)라고 한다. 쉽게 말하면, API란 누군가 만들어 놓은 기능들이라고 생각하면 된다.

참고로 자바에는 3,000개가 넘는 클래스가 있다.

 

 

### 3. 문자열에 관련된 대표적 클래스 : String

 

*String의 주요 기능들(메소드)

 

- String concat(String str) : 저장된 문자열과 str문자열을 결합

- String substring(int begin) : 시작위치부터 마지막까지의 문자열을 반환

- int length() : 문자열 길이를 반환

- String toUpperCase() : 대문자로 반환

- String toLowerCase() : 소문자로 반환

- char charAt(int index) : index 위치의 문자를 반환

- int indexOf(char ch) : 첫번째 ch문자의 위치를 반환

- int lastIndexOf(char ch) : 마지막 ch문자의 위치를 반환

- boolean equals(String str) : 지정된문자열과 str문자열이 같은지 비교

- boolean equalslgnoreCase(String str) : 대소문자구분없이 지정된문자열과 str문자열이 같은지 비교

- String trim() : 문자열 앞뒤 공백제거

- String replace(char old, char new) : 문자열 내의 old문자를 new문자로 반환

- String  repalceAll(String old, String new) : 문자열 내의 old문자열을 new로 반환

 

 

### 4. String 의 문제점

 

String은 메모리를 과소비한다. String 객체의 경우 처음 초기화된 데이터에 변화가 생기면 기존 것을 재활용하지 않고, 기존의 것은 버리고 새로운 메모리를 이용하기 때문이다.

 

 

### 5. StringBuff 와 StringBuilder 의 등장

 

문자열 변수의 잦은 내용 변경이 필요한 경우에는, String 클래스의 새로운 메로리를 생성하는 문제로 인해 속도가 느려지는 현상이 발생한다. 그럴 때는 문자열 조작에 적합하게 만들어진 다른 클래스를 사용하는 것이 좋다. 문자열 조작에 적합하게 만들어진 클래스로는 StringBuilder 클래스와 StringBuffer 클래스가 있다. 이 클래스들은 모두 객체 내부에 있는 버퍼(buffer, 데이터를 임시로 저장하는 메모리)에 문자열의 내용을 저장해두고 그 안에서 추가, 수정, 삭제 작업을 한다. 그렇기 때문에 이 클래스들을 이용하면 새로운 객체를 만들지 않고도 문자열을 조작할 수 있는 것이다.

 

*StringBuilder 주요 기능(메소드)

 

- append(String str) : 문자열 str 추가

- insert(int index, String str) : 특정 index에 문자열 str 추가

- delete(int start, int end) : index위치 start부터 end앞 까지 삭제

- deleteCharAt(int index) : index위치의 특정 문자 하나 삭제

- int capacity() : 문자열 크기 반환

- ensureCapacity(int size) : 버퍼의 크기를 size만큼 늘리는 메소드

- trimToSize() : 과도한 버퍼 크기를 적당하게 줄이는 메소드

 

 

### 6. 수학적 계산에 사용되는 클래스 Math

 

 

### 7. 난수를 발생하는 Random

 

* Math.random()

 

Random() 메소드는 double타입의 임의의 수를 발생한다.

API documents(http://docs.oracle.com/javase/8/docs/api)을 보면 static이고, 반환 타입이 double임을 확인 할 수 있다. Math클래스의 random()메소드가 static이기 때문에 객체 생성하지 않고 Math.random() 형으로 바로 실행할 수 있다.

 

 

### 8. 자바 클래스의 상속 계층

 

여러 클래스의 공통된 특성(공통데이터와 메소드)은 슈퍼클래스로 선언하는 것이 좋다는 사실을 상속에서 접했다. JDK 라이브러리 개발자들도 그런 식으로 상속관계를 갖도록 클래스를 설계했기 때문에 비슷한 기능의 클래스들이 같은 슈퍼 클래스를 갖게 되는 경우를 종종 볼 수 있다.

그런데 클래스의 어떤 특성은 특정 부류의 클래스 뿐 아니라 자바의 모든 클래스들이 공통으로 갖는다. 그래서 자바에서는 그런 공통 특성을 추출하여 Object라는 클래스로 만들어 두었다. 그리고 다른 모든 클래스들은 Object 클래스를 상속 받도록 만들어 두었다. extends Object 라는 단어가 없어도 컴파일 과정에서 자동적으로 Object 의 서브 클래스가 된다.

 

 

### 9. Scanner 및 Sysout

 

 

### 10. Wrapper 클래스의 이해

 

Wrapper 클래스는 기초 데이터를 객체데이터로 변화시킨다.

 

 

### 11. Timer 클래스 

 

자바에서 타이머는 2가지이다. 일정한 시간마다 작동되는 타이머 프로그램과 일정한 시간이 되면 한 번 실행되는 타이머 프로그램이다.
