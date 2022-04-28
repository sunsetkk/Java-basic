# Java-basic


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
|단축키|동작|단축키|동작|
|--|--|--|--|
|Ctrl + F11|실행| | |
|Ctrl + /|주석 처리<br>(주석이 되어있는 줄이라면 해제)| | |
|Ctrl + Spacebar|자동완성| | |

# 출력 메서드
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
	
	

