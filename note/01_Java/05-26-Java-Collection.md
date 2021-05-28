### 1. Collection 이란?

컬렉션이란 우리말로 쉽게 말해 "자료구조"를 의미한다. 다수의 데이터, 즉 데이터 그룹을 의미하는 것이다.

데이터 군을 저장하기 위해서 우리는 배열을 사용해왔지만, 배열과 비슷한 구조에다가 다수의 데이터를 쉽게 처리할 수 있는 방법(method)을 제공하는 API이다.

 

무수히 많은 데이터를 어떤 형식으로 잘 정리하느냐에 따라 추후 데이터를 찾아서 사용할 때 업무의 효율성이 높아질 수 있다. 그래서 자바는 다양한 자료구조형을 제공하고 있다. 다양한 자료구조형이 제공되는 이유는 데이터의 성질에 따라서 데이터를 관리(정리)해야 하는 방식이 다르기 때문이다. 자료구조형 안에서는 객체의 레퍼런스 만을 관리한다.

 

### 2. List / Set / Map 특징

 

1) List : 순서가 있는 데이터의 집합. 데이터의 중복 허용.

ex. 대기자 명단

* 구현 클래스 : ArrayList, LinkedList, Stack, Vector 등

 

2) Set : 순서를 유지하지 않는 데이터의 집합. 데이터의 중복 허용하지 않음.

* 구현 클래스 : HashSet, TreeSet 등

 

3) Map : 키(key)와 값(value)의 쌍(pair)으로 이루어진 데이터의 집합. 순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용.

* 구현 클래스 : HashMap, HashTable 등