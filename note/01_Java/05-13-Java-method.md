메소드(method)는 객체지향 프로그램이 나오기 전, 효율적인 프로그래밍을 위해 등장하였습니다.  
  
## 1. 객체지향 이전의 프로그래밍  
"1부터 10까지 정수의 합을 구하고, 그 결과값이 짝수인지 홀수인지를 파악하고, 홀수라면 "홀수입니다"를 짝수라면 "짝수입니다"를 출력하시오."  
  
<절차지향>  
위에서부터 순차적으로 실행  
```sh
public static void main(String[] args) {
		int tot=0;
		for(int i=1; i<11; i++){
			tot += i;
		}
		System.out.println("1~10까지 정수합은 "+tot+"입니다");
		System.out.println((tot%2==0)? "짝수입니다":"홀수입니다");
		int tot=0;
		for(int i=10; i<100; i++){
			tot += i;
		}
		System.out.println("10~100까지 정수합은 "+tot+"입니다");
		System.out.println((tot%2==0)? "짝수입니다":"홀수입니다");

	}
```
   
절차지향 방식은 '유지 보수'에 있어서 몇 가지 비효율적인 면을 느끼게 됩니다.  
구하는 수의 범위를 변경할 때, 예를 들어 1부터 10까지의 합을 1부터 1000까지의 합으로 변경하는 등, 다시 코딩하거나 기존 코드를 복사하여 재사용해야하고, 이렇게되면 코드의 양이 너무 길어집니다.  
  
그래서 등장한 방식이 함수 또는 메소드(method) 입니다.  
로직만 만들어 놓고, 그때 그때 데이터를 주면 메소드가 알아서 결과값을 반환하는 방식입니다.  
```sh
public static void main(String[] args) {
		int tot = sum(1,100);
		System.out.println(evenOdd(tot));
	}
private static int sum(int from, int to){
		int result = 0;
		for(int i=from ; i<=to ; i++){
			result += i;
		} 
		return result;
	}
private static String evenOdd(int value){                                 
		String result = new String();
		if(value%2 == 0) {
			result = "짝수입니다";
		} else {
			result = "홀수입니다";
		}                                                   
		return result;    
	}
```

```sh
public class Ex02 {
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		int sum =ex02.sum(1,10);
		System.out.println("1~10까지 정수합은 "+sum+"입니다");
		System.out.println(ex02.evenOdd(sum));
		sum = ex02.sum(1,101);
		System.out.println("1~101까지 정수합은 "+sum+"입니다");
	}
	private String evenOdd(int value) {
		String result = null;
		if(value%2==0)
			result = "짝수입니다";
		else
			result = "홀수입니다";
		return result;
	}
	private int sum(int from, int to) {
		int result = 0;
		for(int i=from ; i<=to ; i++) {
			result += i;
		}
		return result;
	}
}
```

## 객체지향 프로그램의 등장 배경과 이해  
메소드를 이용한 방식으로 개발자들은 효율성을 느낄 수 있었지만, 데이터와 메소드가 많아짐에 따라 코드의 양이 많아지고 어려워지기 시작하는 한계를 느끼게 됩니다. 이에 따라 등장한 방식이 객체지향 프로그래밍입니다.  
객체(object)란 동일한 성질의 데이터와 메소드를 한곳에 모아두고 필요한 곳에서 언제든지 이용할 수 있게 만들어 놓은 덩어리 입니다.  

```sh
public class Arithmetic {
	public String evenOdd(int value) {
		String result = null;
		if(value%2==0)
			result = "짝수입니다";
		else
			result = "홀수입니다";
		return result;
	}
	public int sum(int from, int to) {
		int result = 0;
		for(int i=from ; i<=to ; i++) {
			result += i;
		}
		return result;
	}
	public int abs(int su) {
		int result = (su<0)? -su : su;
		return result;
	}
}
public class ExMain {
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		int sum =ar.sum(1, 10);
		System.out.println("1~10까지 정수합은 "+sum+"입니다");
		System.out.println(ar.evenOdd(sum));
		System.out.println("-5의 절대값은 "+ar.abs(-5)+"입니다");
	}
}
```

## 3. 메소드의 이해
메소드(method)란 작업을 수행하기 위한 명령문의 집합을 말한다. 어떤 값을 입력 받아서 처리하고, 그 결과를 돌려준다. (때때로 입력 받는 값이 없을 수도 있고, 결과를 돌려주지 않을 수도 있다.)  
- 반복적으로 수행되는 여러 문장을 메소드로 작성한다.  
- return이 없을 경우 리턴type은 void로 작성한다. 

#### 1) 매개변수를 갖지 않는 함수
```sh
public class method1 {
	public static void main(String args[]) {
        printCh();
        System.out.println("Hello, Java");
        printCh();
	      System.out.println("Hello, Java");
        printCh();
	      System.out.println("Hello, Java");
        printCh();
    }
   pravate static void printCh(){
	for(int cnt=1 ; cnt<=20 ; cnt++)
		System.out.print('*');
	System.out.println();
    }
}
```

#### 2) 매개변수를 갖는 함수
```sh
public class method1 {
	public static void main(String args[]) {
        printCh('■',15);
        System.out.println("Hello, Java");
        printCh('*',12);
System.out.println("Hello, Java");
        printCh('*',12);
	      System.out.println("Hello, Java");
        printCh('■',15);
    }
    static void printCh(char ch, int i){
		for(int cnt=1 ; cnt<=i ; cnt++)
			System.out.print(ch);
		System.out.println();
    }
}
```

#### 3) Return 값을 갖는 함수
```sh
public class method1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int inputAbs = abs(input);
		System.out.printf("입력하신수 %d의 절대값은 %d", input, inputAbs);
	}
	static int abs(int in){
		int result = (in<0)? -in : in;
		return result;
	}
}
```

#### 4) 메소드의 재귀적 호출
##### a. factorial 계산을 위한 메소드 구현 소스
```sh
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		int result = factorial(su);
		System.out.println(su+"! = "+result);
	}
	private static int factorial(int s){
		// s*(s-1)*(s-2)*(s-3)*......2*1
		int fact = 1;
		for(int i=s ; i>=1 ; i--)
			fact = fact*i;
		return fact;
	}
```

##### b. factorial 계산을 위한 재귀적 메소드 호출 소스
```sh
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su;
		do{
			System.out.print("양수를 입력하세요 ☞ ");
			su = sc.nextInt();
		}while(su<=0);
		System.out.println(su+"! = "+factorial(su));
		sc.close();
	   }
	   private static int factorial(int s){
		// 3! = 3*2! -> s! = s*(s-1)! 재귀적호출
		//return (s==1)? 1:s*factorial(s-1);
		if(s==1) 
			return 1;
		else
			return s * factorial(s-1);			
	   }
```
