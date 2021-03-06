### 1. 메소드 프로그램의 한계  
메소드를 이용하면 절차지향언어에서 중복된 로직의 재사용이 가능하여 개발을 효율적으로 할 수 있었습니다. 하지만 메소드만 가지고는 많은 양의 로직을 처리하기에 한계가 있습니다. 따라서 한 문서 내에 메소드의 수가 많아질 경우 추후 유지 보수에 많은 어려움이 발생됩니다.
  
  
### 2. 객체의 개념 및 클래스의 이해  
객체는 '같은 종류의 데이터와 메소드가 함께 있는 구성체' 입니다.  
예를 들어, 자동차라는 객체가 있습니다.  
자동차에는 색상, 배기량, 브랜드, 속도 등의 데이터(속성)가 있고, 드라이브, 주차, 레이싱이라는 메소드가 있습니다.  
자동차를 운전하는 사람은 드라이브하거나 주차하거나 레이싱을 하며 속도(속성)을 바꾸기도 합니다.  
또한 색상과 배기량, 제조사, 속도를 가지고 다른 자동차와 구분하기도 합니다.  
이처럼 객체는 메소드와 비슷하지만 그 상위개념이라고 할 수 있습니다. 즉, 완전한 독립체라고 할 수 있습니다.  
  
* 객체 모델링 : 현실세계나 추상적인 내용의 속성과 동작을 추려내어 소프트웨어 객체의 필드와 메서드로 정의해 나가는 과정  
* 객체와 클래스 : 기계를 만들 때 설계를 하고, 설계도면대로 기계를 제작하듯이, 객체의 설계도면인 클래스를 만들고 객체를 생성한다. 클래스는 객체를 만들기 위한 설계도라고 할 수 있다.  
* 캡슐화 : 객체가 포함한 속성과 메서드는 객체 간의 관계에 있어서 감추거나 권한에 따라 접근이 가능하게 처리하는 것을 말한다. 객체의 데이터를 외부에서 직접 접근하지 못하게 막고, 함수를 통해서만 조작이 가능하게 하는 작업이다.  
  
### 3. 클래스 제작
```sh
Package com.ch.ex;
public class ExClass {
	private 자료형 인스턴스변수( = 속성 = 필드)명;
	public ExClass(){ 	}
	public method(){
	. . .
}
  }
```
  
1) 패키지명  
2) 클래스명  
3) 데이터(인스턴스 변수 = 멤버변수, 필드) : 이 데이터는 생성자나 setter를 이용해서 초기화하지 않으면 객체는 null, 숫자는 0, boolean은 false로 초기화되어 들어간다.  
4) 생성자함수 : 클래스명과 똑같이 리턴타입이 없는 메소드를 생성자라하며 처음 클래스형 객체를 만들 때 호출된다. 모든 클래스는 반드시 하나 이상의 생성자가 있어야 한다. 만약 하나도 없으면 JVM이 디폴트 생성자를 만들어 준다(new 연산자로 호출되는 메서드).  
5) 메소드  
6) Getter & Setter  
  
### 4. 생성자의 이해
생성자는 매개변수가 있는 생성자와 매개변수가 없는 생성자 등 여러 종류의 생성자를 가질 수 있다. 생성자가 없을 때는 디폴트 생성자가 컴파일러 단계에서 자동 생성한다. 한 개 이상의 생성자가 있으면 디폴트 생성자는 자동 생성되지 않는다.    
### 5. this 키워드의 이해
this 란 객체 자신  
### 6. 객체지향 프로그래밍의 특징
(1) 캡슐화와 데이터 은닉  
(2) 다형성 : 같은 모습이지만 다른 기능 (cf. 오버로딩)  
(3) 상속  
