## 제어문(Control Statement)이란?
프로그램의 순차적인 흐름을 바꾸어주는 문장이다.  
- 조건문 : if ~ else / switch ~ case
- 반복문 : for / while / do ~ while
- 분기문 : break / continue / return

## 조건문 : 조건에 따라 다른 문장을 실행하는 문장
### if문

프로그래밍에서 조건을 판단하여 해당 조건에 맞는 상황을 수행하는 데 사용하는 것이 if문이다.

다음과 같이 상상해보자.  
"돈이 있으면 택시를 타고 가고 돈이 없으면 걸어 간다."  
  
이와 같은 상황을 자바에서는 다음과 같이 만들 수 있다.
```sh
boolean money = true;  
if (money) {  
    System.out.println("택시를 타고 가라");  
}else {  
    System.out.println("걸어가라");  
}
```
  
"만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라"  
이와 같은 상황을 자바에서는 다음과 같이 만들 수 있다.  

```sh
int money = 2000;  
if (money >= 3000) {  
    System.out.println("택시를 타고 가라");  
}else {  
    System.out.println("걸어가라");  
}
```

"돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라"  
이와 같은 상황을 자바에서는 다음과 같이 만들 수 있다.  

```sh
int money = 2000;  
boolean hasCard = true;  
  
if (money>=3000 || hasCard) {  
    System.out.println("택시를 타고 가라");  
} else {  
    System.out.println("걸어가라");  
}
```

### contains
List 자료형에는 해당아이템이 있는지 조사하는 contains라는 메소드가 있다.  
  
"만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라"
이와 같은 상황을 자바에서는 다음과 같이 만들 수 있다.  
```sh
ArrayList<String> pocket = new ArrayList<String>();  
pocket.add("paper");  
pocket.add("handphone");  
pocket.add("money");  
  
if (pocket.contains("money")) {  
    System.out.println("택시를 타고 가라");  
}else {  
    System.out.println("걸어가라");  
}  
```

### else if(다중 조건 판단)
아래의 예와 같이 else if 는 개수에 제한없이 사용할 수 있다.  
  
"지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라"  
이와 같은 상황을 자바에서는 다음과 같이 만들 수 있다.  

```sh
boolean hasCard = true;  
ArrayList<String> pocket = new ArrayList<String>();  
pocket.add("paper");  
pocket.add("handphone");  
  
if (pocket.contains("money")) {  
    System.out.println("택시를 타고 가라");  
}else if(hasCard) {  
    System.out.println("택시를 타고 가라");  
}else {  
    System.out.println("걸어가라");  
}
```
