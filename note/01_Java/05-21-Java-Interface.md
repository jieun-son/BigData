### 1. 인터페이스란?

 

(1) 작업명세서(작업지시서)처럼 "앞으로 이렇게 만드시오"라고 표현해 놓은 것을 말한다.

- 실제 구현된 것이 전혀 없는 기본 설계도

- 객체를 생성할 수 없고, 클래스 작성에 도움을 줄 목적으로 사용

- 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는 데 사용

- 추상메소드와 상수 만을 멤버로 가질 수 있다.

 

(2) 다형성을 가능하게 한다. (하나의 객체를 다양하게 많은 타입으로 만들 수 있다.)

 

(3) 객체를 부속품화 한다. (다양한 객체를 제품의 부속품처럼 개발자 마음대로 변경할 수 있다.)

 

(4) 사용법은 어렵지 않지만, 실제 개발에 적용시키기는 쉽지 않다.

 

(5) 인터페이스를 공부하는 데 가장 좋은 방법은 패턴이나 프레임워크(ex. Spring)를 통해 습득하는 것이다.

 

 

### 2. 인터페이스의 문법

 

(1) 'class' 대신 'interface' 예약어를 사용한다는 점에서 클래스와 유사하다.

 

(2) 실제 구현된 기능 없이 추상메소드와 상수 만이 존재한다.

public interface 인터페이스이름 {

        public static final 타입 상수이름 = 값;

        public abstract 메서드 이름(매개변수 목록);   // 구현된 메소드는 가질 수 없다

 

* 모든 멤버변수는 public static final 이어야하며, 이를 생략할 수 있다.

* 모든 메소드는 public abstract 이어야하며, 이를 생략할 수 있다.

 

(3) private 는 불가 

상수나 메소드를 만들 때, private 접근 제한자는 불가하다.

 

(4) 변수 타입

인터페이스는 객체를 생성할 수 없다. 다만 변수 타입으로만 사용 된다.

 

(5) 구현은 implement 되는 클래스에서 한다.

 

 

### 3. 다형성이란?

말 그래도 객체가 다양하게 변할 수 있다고 생각하면 된다. 다형성이란, 여러가지 형태를 가질 수 있는 능력을 말한다.

 

"one interface, multiple implementation"

* 하나의 인터페이스를 사용하여 다양한 구현 방법을 제공

* 하나의 클래스나 함수가 다양하게 동작하는 것

 

ex1. 오버로딩(overloading) : 같은 클래스 내에서만 오버로딩이라 할 수 있다.

ex2. 메소드 overriding(다중정의) : 같은 이름을 가진 메소드를 다른 클래스에서 재정의 하는 법

 

* 오버라이딩의 조건

(1) 선언부가 같아야 한다. (이름, 매개변수, 리턴타입)

(2) 접근제어자를 좁은 범위로 변경할 수 없다.

조상 클래스 메소드가 protected 라면 범위가 같거나 넓은 protected 또는 public 으로만.

 

* 오버로딩 vs 오버라이딩

(1) 오버로딩(overloading) : 컴파일러 입장에서는 기존에 없는 새로운 메소드를 정의하는 것(new)

- 메소드 다중정의 (같은 class 에서 동일한 메소드가 매개변수를 달리 하여 여러 개 존재

(2) 오버라이딩(overriding) : 상속받은 메소드의 내용을 변경하는 것(change, modify)

- 메소드 재정의 (부모 클래스와 자식 클래스에 동일한 method 존재(틀만 가져와 재정의))

 

 

### 4. 인터페이스와 다중 상속

Java는 "다중 상속"이 불가하다. 예전의 C++에서는 다중 상속이 가능하였으나, Java에서는 다중상속이 불가능하다. C++에서 다중 상속을 가능하게 하여 좋은 점도 있었으나, 다중 상속으로 인한 문제점도 많았기 때문에 C++에서 발전된 Java에서는 다중 상속을 막았다.

하지만 Java에서도 interface를 통해서는 다중 구현이 가능하여 여러가지 타입으로 객체를 선언할 수 있다.

정확하게 말하면 Java는 다중 상속이 아닌 "다형성(type이 다양하게 존재할 수 있다)"이 존재한다고 이해해야 한다.

인터페이스를 구현하는 것은 클래스를 상속받는 것과 비슷하며, extends 대신 implements 를 사용한다.

 

 

### 5. 인터페이스의 장점

 

(1) 개발시간을 단축시킬 수 있다.

일단 인터페이스가 작성되면, 이를 사용해서 프로그램을 작성하는 것이 가능하다. 메소드를 호출하는 쪽에서는 메소드의 내용에 관계없이 선언부만 알면 되기 때문이다. 그리고 동시에 다른 한 쪽에서는 인터페이스를 구현하는 클래스를 작성하도록 하여, 인터페이스를 구현하는 클래스가 작성될 때까지 기다리지 않고도 양쪽에서 동시에 개발을 진행할 수 있다.

 

(2) 표준화가 가능하다.

프로젝트에 사용되는 기본 틀을 인터페이스로 작성한 다음, 개발자들에게 인터페이스를 구현하여 프로그램을 작성하도록 함으로써 보다 일관되고 정형화된 프로그램의 개발이 가능하다.

 

(3) 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.

서로 상속 관계에 있지도 않고, 같은 조상클래스를 가지고 있지 않은 서로 아무런 관계도 없는 클래스들에게 하나의 인터페이스를 공통적으로 구현하도록 함으로써 관계를 맺어 줄 수 있다.

 

(4) 독립적인 프로그래밍이 가능하다.

인터페이스를 이용하면 크래스의 선언과 구현을 분리시킬 수 있기 때문에 실제 구현에 독립적인 프로그램을 작성하는 것이 가능하다. 클래스와 클래스간의 직접적인 관계를 인터페이스를 이용해서 간접적인 관계로 변경하면, 한 클래스의 변경이 관련된 다른 클래스에 영향을 미치지 않는 독립적인 프로그래밍이 가능하다.

 

 

### 6. 인터페이스와 추상클래스의 공통점

 

(1) 추상메소드를 가지고 있다.

추상메소드를 가지고 있어 하위 클래스에서 구현해야 한다.

 

(2) 변수 타입이 목적이다.객체 생성이 목적이 아닌, 변수 타입을 정의하는 것이 목적이다.

 

(3) 객체 생성은 anonymous(익명 클래스)를 이용해야 한다.

 

 

### 7. 인터페이스와 추상클래스의 차이점

 

(1) 상속, 구현추상메소드는 상속(extends)을 통한 사용이고, 인터페이스는 구현(implements)을 통한 사용이다.

 

(2) 구성요소 차이추상클래스는 일반 클래스와 동일하게 변수, 메소드의 모든 기능을 사용할 수 있지만, 인터페이스는 상수와 추상 메소드만이 존재한다.

 

(3) 단일상속, 다중구현추상클래스는 상속이므로 단일 상속만 지원하고, 인터페이스는 다중구현이 가능하다.

 

 

### 8. default 메소드와 인터페이스의 확장

기존 인터페이스의 이름과 추상 메소드의 변경 없이 default 메소드만 추가할 수 있기 때문에 이전에 개발한 구현 클래스를 그대로 사용할 수 있으면서 새롭게 개발하는 클래스는 default 메소드를 활용할 수 있다.