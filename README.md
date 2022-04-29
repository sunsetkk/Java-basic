# Java-basic
본 문서는 _2022-04-28_ 에 작성되었습니다.

# JDK 설치
> Java 8 버전 이용<br>
> https://www.oracle.com/java/technologies/downloads/

운영체제 선택해서 설치 파일 다운로드 > resource 폴더에 옮기기 <br> 
설치파일 실행해서 설치 진행(경로는 Program Files 안에 Java 폴더인지 확인) <br>
	> 윈도우 검색에다 환경 검색 > 시스템 환경 변수 편집 클릭 > 환경 변수 버튼 클릭 <br>
	> 아래쪽에 새로만들기 클릭해서 변수 만들기 <br>
	변수명 : JAVA_HOME <br>
	변수 값 : jdk 설치된 경로(C:\Program Files\Java\jdk1.8.0_311) <br>
	> Path변수 찾아서 편집 > 새로운 창에서 새로 만들기 클릭 > <br>
	%JAVA_HOME%\bin 작성 후 확인 > 모든 창 닫고 cmd 실행 > javac -version 명령어 수행 <br>

# 통합 개발 환경(IDE)
> Eclipse 19-12버전 이용<br>
> https://www.eclipse.org/downloads/packages/release/2019-12/r

Perspective 는 Java로 바꿔준다


# 단축키
|단축키|동작|
|--|--|
|Ctrl + F11|실행|
|Ctrl + Spacebar|자동완성|
|Ctrl + /|주석 처리<br>(주석이 되어있는 줄이라면 해제)|
|Alt + Shift + N > ↓ > Enter|프로젝트 만들기
|Ctrl + N|New창<br>(클래스, 패키지, .. 등등 만드는 창)|
|Ctrl + Alt + ↓(↑)|아래(위)쪽으로 한줄 복사|
|Alt + ↓(↑)|아래(위)쪽으로 한줄 이동|

# 1. 출력 메서드
`System.out`

- .print(값) <br>
괄호 안에 있는 값을 그대로 출력<br>
마지막에 줄바꿈을 하지 않는다.<br>

- .println(값)<br>
print()와 동일, 마지막에 줄바꿈을 한다.

- .printf()<br>
System.out.printf("서식문자열",값1,값2,...);<br><br>
서식문자열 : 서식문자가 포함된 문자열 <br>
ex) "%fcm" --> 실수한개 뒤에 "cm"라는게 붙은 문자열<br><br>
뒤에 올 값들은 앞에 문자열에 있는 서식문자대로 따라와야 한다.<br>
printf("키 : %fcm",170.24); ---> 키 : 170.24cm<br>

## 서식문자(format문자)
> 따옴표 안에 존재한다.<br>
> %와 함께 쓰인다.

|서식문자|동작|
|--|--|
| %d | 정수|
| %c | 문자 |
| %s | 문자열 |
| %f | 실수 |
| %% | % |

## 제어문자
> 따옴표 안에 존재한다.<br>
> \와 함께 쓰인다.

|제어문자|동작|
|--|--|
|`\n`|Enter(줄바꿈)|
|`\t`|Tab(공백)|
|`\"`|"|
|`\'`|'|
|`\\`|`\`|
	
# 2. 변수<br>
`단 하나의 값을 저장할 수 있는 메모리 공간`<br>
프로그래밍언어에서의 변수란, 값을 저장할 수 있는 메모리상의 공간을 의미한다.<br>

하나의 변수에 단 하나의 값만 저장할 수 있으므로, <br>
새로운 값을 저장하면 기존의 값은 사라진다.

## 자료형
|자료형|type|byte|예|
|--|--|--|--|
|정수형|int|4|0, -110, 244, ...(-21억 ~ 21억)
|   |long|8|0L, -110L, 244l, ...
|실수형|float|4|0.0F, -1207.1f, 12.417f, ...
|   |double|8|0.0, -1207.1, 12.417, ...
|문자형|char|2|'0', '가', 'A', '~', ...
|문자열|String|??|"0", "HELLO", "", ...

## 변수의 선언과 주의사항 <br>
자료형 변수명 = 초기값;
자료형 변수명;
- 같은 이름의 변수를 선언할 수 없다.
- 초기화를 해준다.
- 되도록 선언부(메서드 상단)에 한꺼번에 선언한다.

# 3. 입력 메서드
`new Scanner(System.in)` <br>
매번 반복해서 써주기엔 너무 길기 때문에 아래처럼 사용한다.
```java
Scanner scan = new Scanner(System.in);
scan.next();
scan.nextLine();
scan.nextInt();
```
- .next() <br>
사용부분 통째로 사용자가 입력한 문자열 값<br>
공백 또는 엔터를 구분점으로 판단하고 분리하여 입력받는다.<br>
해 진이 : "해", "진이"로 분리하여 "해"만 입력받는다.<br>
띄어쓰기가 포함된 경우에는 값의 개수만큼 next()를 사용해 주어야 한다.<br>

- nextLine() <br>
사용부분 통째로 사용자가 입력한 문자열 값
공백도 문자로 입력받는다.
앞에 다른 입력이 있다면 의미없는 nextLine()을 한번 미리 써주어야 한다.

- nextInt() <br>
사용부분 통째로 사용자가 입력한 정수 값











