# inflearn-codingtest

- static에서 인스턴스 메소드를 호출하려면 객체 생성이 필요함
- static은 객체 생성 필요없음

ex)  

public class Main{

        public static void main(String [] args){
             Main m = new Main(); // Main class 객체 생성
   }
   
}

### (string).ChatAt(인덱스 번호)

- string으로 저장된 문자열 중에서 한글자만 선택해서 char 타입으로 변환

### (string).toCharArray()

- 문자열을 char형 배열로 변환

### Character.isLowerCase() / Character.isUpperCase()

- 소문자인지 아닌지 T,F로 리턴 / 대문자인지 아닌지 T,F로 리턴

### Character.toLowerCase() / Character.toUpperCase()

- 소문자로 변환 / 대문자로 변환

- 아스키 넘버로 대문자는 65(A) ~ 90(Z) , 소문자는 97(a) ~ 122(z)
- 대소문자 차이 32,  소문자 - 32 = 대문자,  대문자 +32 = 소문자

### (string).split()

- 특정 문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴

### (string).indexOf()

- 특정 문자나 문자열에서 해당하는 문자의 첫번째 인덱스 값 반환, 찾지 못했을 경우 -1 리턴 (아스키 코드 가능)

### (string).substring()

- 입력 받은 인자값 index 포함하여 이후 문자열 모두 리턴
- substring(a,b) 처음과 끝 지정 가능, b-1 인덱스까지 리턴

### Character.isAlphabetic()

- 알파벳인지 아닌지 T,F 리턴

### (다른 데이터 타입).valueOf()

- string으로 변환 (static 메소드)

### .tostring()

- 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드

정규 표현식

- [x-z] : x부터 z의 문자들
- [^x-z] : x부터 z의 문자가 아닌 것

### (string).replaceAll(”A”, “B” )

- A를 B로 바꾸는 것

### (string).replace

### StringBuilder()

- string 문자를 붙일 때 +연산자를 사용해 붙이지 않고 .append()를 이용해 문자들을 붙일 수 있다.
- 객체 생성으로 사용

### .reverse()

- StringBuilder, StringBuffer, Collection클래스에서 reverse() 메서드를 제공, 그냥 String에서 제공하지 않음
- 문자열 뒤바꿔주는(반전) 메소드, StringBuilder, StringBuffer 객체를 리턴하기 때문에 문자열 변환 과정이 따로 필요함

### Integer.parseInt(문자) / Integer.parseInt(문자,N진수)

- 문자열을 숫자로 바꿔준다, 문자열을 10진수로 읽어서 int로 반환
- 해당 문자를 N진수 읽어 드릴 것인지에 대한 것 ex) String s = 54;  parseInt(s,2) → s 문자를 2진수로 읽어서 int로 반환

### Character.isDigit()

- 숫자인지 아닌지 T,F 리턴

### Scanner. next( )과 nextLine()

- next( )는 공백이 없는 문자열
- nextLine( )은 공백이 있는 문자열

두번째에  있는 문자열 있을 때 char c = sc.next().chatAt(0)

## HashMap 생성

- HashMap<key 데이터 타입, value 데이터 타입> 객체 이름 = new HashMap<>();
- HashMap<Character, Integer> map = new HashMap<>();

## HashMap 다양한 메소드

### HashMap 값 추가

- 객체이름.put(key 값 , value 값);
- map.put(’A’ , 3);

### 해당 key가 HashMap 안에 있다면 value 반환, 없다면 지정된 값 리턴

- 객체이름.getOrDefault(key 값, key 값이 없을 때 리턴 값);
- map.getOrDefault(’A’, 0); → key 값 A 가 없으면 0을 반환, 있으면 해당 key의 value 값 반환

### key 탐색 방법

- 객체이름.keySet()
- map.keySet()

### value 탐색 방법

- 객체이름.get(key 값)
- map.get(’A’) - key 값이 A인 value 리턴

### 입력한 key 값이 있는지 없는지 T,F 리턴

- 객체이름.containskey(key 값)
- map.containskey(’A’)

### key들과 사이즈 리턴

- 객체이름.size()
- map.size()

### 특정 key 삭제

- 객체이름.remove(key 값)
- map.remove(’A’)
