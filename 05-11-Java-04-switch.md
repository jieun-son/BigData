## 제어문(Control Statement)이란?
프로그램의 순차적인 흐름을 바꾸어주는 문장이다.  
- 조건문 : if ~ else / switch ~ case
- 반복문 : for / while / do ~ while
- 분기문 : break / continue / return

## 조건문 : 조건에 따라 다른 문장을 실행하는 문장
### switch문
switch/case 문은 if 문과 비슷하지만 좀 더 정형화된 모습의 제어문으로 가독성이 훨씬 좋다.  
switch/case문은 if else 구조로 변경이 가능하지만 if else 구조로 작성된 모든 코드를 switch 문으로 변경할 수는 없다.  
이렇게 굳이 switch/case 문 없이도 if/else로 충분히 코드를 작성할 수 있기 때문에 switch/case 문을 지원하지 않는 언어들도 있다. (※ 파이썬은 switch/case문이 없다.)  
  
if문과 switch문을 비교하면 다음과 같다.

- if문
```sh
if(num == 1) {  
System.out.println("주사위 1번");  
} else if(num == 2) {  
System.out.println("주사위 2번");  
} else if(num == 3) {  
System.out.println("주사위 3번");  
} else if(num == 4){  
System.out.println("주사위 4번");  
} else if(num == 5){  
System.out.println("주사위 5번");  
} else {  
System.out.println("주사위 6번");  
}
```

- switch문
```sh
switch(num) {  
case 1:  
    System.out.println("주사위 1번");break;  
case 2:  
    System.out.println("주사위 2번");break;  
case 3:  
    System.out.println("주사위 3번");break;  
case 4:  
    System.out.println("주사위 4번");break;  
case 5:  
    System.out.println("주사위 5번");break;  
default:  
    System.out.println("주사위 6번");break;  
}
```

또 다른 예를 살펴보면 다음과 같다.  
```sh
public class SwitchDemo {  
    public static void main(String[] args) {  
        int month = 8;  
        String monthString = "";  
        switch (month) {  
            case 1:  monthString = "January";  
                     break;  
            case 2:  monthString = "February";  
                     break;  
            case 3:  monthString = "March";  
                     break;  
            case 4:  monthString = "April";  
                     break;  
            case 5:  monthString = "May";  
                     break;  
            case 6:  monthString = "June";  
                     break;  
            case 7:  monthString = "July";  
                     break;  
            case 8:  monthString = "August";  
                     break;  
            case 9:  monthString = "September";  
                     break;  
            case 10: monthString = "October";  
                     break;  
            case 11: monthString = "November";  
                     break;  
            case 12: monthString = "December";  
                     break;  
            default: monthString = "Invalid month";  
                     break;  
        }
        System.out.println(monthString);
    }
}
```

switch문의 입력으로 1이라는 숫자가 올 경우 "January"라는 문자열이 12가 입력으로 올 경우 "December"라는 문자열이 출력되는 예제이다. 위의 예는 month가 8로 고정되어 있기 때문에 "August"라는 문자열이 출력될 것이다.  
  
위 switch문은 month의 값이 1이면 case 1: 문장이 실행되고 2이면 case 2: 문장이, 3이면 case 3: ... 이런식으로 수행되게 된다. 만약 month에 1에서 12사이의 숫자가 아닌 다른 값이 저장되어 있다면 default: 문장이 수행될 것이다.
