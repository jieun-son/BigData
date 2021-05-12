## 반복문이란?
반복적으로 수행하도록 하는 동작을 말한다.  
조건을 잘못 걸면, 무한 loop(영원히 정지하지 않는 동작)가 되므로 조심하자!  
  
“열 번 찍어 안 넘어 가는 나무 없다” 라는 속담을 적용시켜 보면 다음과 같이 될 것이다.
```sh
int treeHit = 0;  
while (treeHit < 10) {  
    treeHit++;  
    System.out.println("나무를  " + treeHit + "번 찍었습니다.");  
    if (treeHit == 10) {  
        System.out.println("나무 넘어갑니다.");  
    }
}
```
여기서 treeHit++는 treeHit 값을 계속 1씩 증가한다는 뜻으로, treeHit += 1 과 같다.  
결과는 다음과 같다.  
```sh
나무를  1번 찍었습니다.
나무를  2번 찍었습니다.
나무를  3번 찍었습니다.
나무를  4번 찍었습니다.
나무를  5번 찍었습니다.
나무를  6번 찍었습니다.
나무를  7번 찍었습니다.
나무를  8번 찍었습니다.
나무를  9번 찍었습니다.
나무를  10번 찍었습니다.
나무 넘어갑니다.
```

### 무한 루프(Loop)란?
무한 루프는 무한히 반복한다는 의미로, 자바에서는 while문으로 구현할 수가 있다.  
  
while의 조건문이 true 이므로 조건문은 항상 참이 되어, while에 속해있는 문장들을 계속해서 수행하게 된다.  
다음의 예를 보자.  
```sh
while (true) {  
    System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");  
}
```

출력 결과는 다음과 같다.  
(이클립스에서는 "중지(■)" 버튼을 클릭하자.)  
```sh
Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.  
Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.  
...
```

### while문 빠져 나가기(break)
다음의 예를 살펴보자.  
money가 300으로 고정되어 있으니까 while (money > 0)에서 money는 0보다 크기 때문에 항상 참이다. 따라서 무한 루프를 돌게 된다. 그리고 while문의 내용을 한번 수행할 때 마다 coffee--에 의해서 coffee의 개수가 한 개씩 줄어들게 된다. 만약 coffee가 0이 되면 if (coffee == 0) 라는 문장이 참이 되므로 if문 다음의 문장들이 수행이 되고 break가 호출되어 while문을 빠져 나가게 된다.  
```sh
int coffee = 10;  
int money = 300;  
  
while (money > 0) {  
    System.out.println("돈을 받았으니 커피를 줍니다.");  
    coffee--;  
    System.out.println("남은 커피의 양은 " + coffee + "입니다.");  
    if (coffee == 0) {  
        System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");  
        break;  
    }  
}  
```

### while문 조건문으로 돌아가기(continue)
while문 안의 문장을 수행할 때 어떤 조건을 검사해서 조건에 맞지 않는 경우 while문을 빠져나가는 것이 아니라 다시 while문의 맨 처음(조건문)으로 돌아가게 하고 싶을 경우가 생기게 된다. 만약 1부터 10까지의 수중에서 홀수만을 출력하는 것을 while문을 이용해서 작성한다고 생각해 보자.  
```sh
int a = 0;  
while (a < 10) {  
    a++;  
    if (a % 2 == 0) {  
        continue;  
    }  
    System.out.println(a);  
}  
```
위의 예는 1부터 10까지의 수 중 홀수만을 출력하는 예이다. a가 10보다 작은 동안 a는 1만큼씩 계속 증가한다. if (a % 2 == 0) (2로 나누었을 때 나머지가 0인 경우)이 참이 되는 경우는 a가 짝수일 때이다. 즉, a가 짝수이면 continue 문장을 수행한다. 이 continue문은 while문의 맨 처음(조건문: a<10)으로 돌아가게 하는 명령어이다.  
따라서 위의 예에서 a가 짝수이면 System.out.println(a)는 수행되지 않을 것이다.  
