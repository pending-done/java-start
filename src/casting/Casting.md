```java
int intValue = 10;
long longValue;
double doubleValue;

longValue = intValue; // int -> long은 기본적으로 가능 (작은걸 큰 그릇에 넣으니까 당연히됨)

doubleValue = intValue; // int -> double (10.0)

doubleValue = 20L // long -> double (20.0)
```

다른 타입의 값을 대입하면 다음과 같이 동작함

- `int` -> `long` 을 비교해보면 `long`이 `int` 보다 더 큰 숫자 범위를 표현하기 때문에 
작은 범위 숫자 타입에서 큰 범위 숫자 타입에 대입을 할 경우 문제가 발생하지 않음
- `long` -> `double`의 경우에도 `double`은 부동 소수점을 사용하기  때문에 더 큰 숫자 범위를 표현하기 때문에 대입할 수 있음
- 정리하면 작은 범위 -> 큰 범위로의 대입은 가능하다

**자동 형변환**  
하지만 결국 대입하는 타입을 맞추어야 하기 때문에 개념적으로는 다음과 같이 동작한다.
```java
//intValue = 10

doubleValue = intValue;
doubleValue = (double) intValue // 형 맞추기
doubleValue = (double) 10 // 변수 값 읽기
doubleValue = 10.0 // 형 변환
```

이렇게 앞에 `(double)`과 같이 적어주면 `int` 형이 `double`형으로 변한다. 이러한 것을 형 변환이라 한다.
작은 범위 타입에서 큰 범위 숫자 타입으로의 대입은 직접 형변환을 하지 않아도 된다. 
이런 과정이 자동으로 일어나기 때문에 `자동 형변환` 또는 `묵시적 형변환` 이라 한다.

---

**명시적 형변환**
반대로 큰 범위 -> 작은 범위로 형 변환을 한다면  `명시적 형변환`이 필요하다.

`double`은 실수를 표현할 수 있다. 따라서 `1.5`라는 값을 넣을 수 있다. 
하지만 `int`는 실수를 표현할 수 없다. 이 경우 `double` -> `int`로 대입한다면 ?

```java
double doubleValue = 1.5;
int intValue = 0;

// intValue = doubleValue; // 컴파일 오류 발생
intValue = (int) doubleValue; // 형변환
```

---






