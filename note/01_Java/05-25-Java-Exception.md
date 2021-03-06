### 1. 예외(Exception) 란?

문제가 없을 것 같은 프로그램도 외부환경요인 등에 의해서 문제가 발생하곤 한다.

프로그램에서 문제가 발생될 만한 곳을 예상하여 사전에 "문제가 발생하면 이렇게 해라"라고 프로그래밍 하는 것을 예외처리라고 한다.

 

[에러]
 
1) 문법에러 : 문법적으로 나타나는 에러

2) 실행에러(실행 시 에러)

(a) 논리에러 : 프로그래머가 잘못 작성해서 이상한 결과가 나오는 경우

(b) 시스템에러 : 프로그래머의 의지와 상관없이 나타나는 에러

(c) 예외사항 : 정상적으로 프로그램이 동작하는 과정에서 나타나는 에러. 프로그램 실행 중에 발생하는 예기치 않은 사건.

ex. 정수를 0으로 나누는 경우, 배열 인덱스를 벗어난 경우, 부적절한 형변환이 일어나는 경우, 입출력을 위한 파일이 없는 경우 등

 

 

### 2. 예외처리의 필요성

어느 한 부분에서 예외가 발생하더라도 계속해서 프로그램이 동작되도록 하는 데 그 목적이 있다.

어떤 문제가 하나 발생되었다고 그 프로세스가 완전히 정지되어 시스템을 재가동하기 전까지는 구동을 아예 못한다고 하면 너무 큰 손실이 발생한다. 그래서 사소한 문제 같은 경우에는 그 문제를 우회해서 가는 방법으로 프로세스가 죽지 않고 계속 구동하도록 프로그래밍 하는 방법이 필요하다.

 

- try ~ catch

- throws
