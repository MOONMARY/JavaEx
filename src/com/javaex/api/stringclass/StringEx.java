package com.javaex.api.stringclass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		stringBasic();
//		usefulMethod();
		stringBufferEx();
	}
	
	private static void stringBasic() {
		String s1 = "Java";		//리터럴 : 소스코드에 명시된 데이터 자체
		String s2 = new String("Java");		//메모리에 새로 만들기
		String s3;
		s3 = "Java";	//리터럴
		
		System.out.println(s1 == s2);	//주소비교
		System.out.println(s1 == s3);	//주소비교
		
		//문자열 배열로 String 생성
		char[] letters = {'J', 'a', 'v', 'a', ' ', 'p', 'r', 'o', 'g', 'r', 'a', 'm', '!'};
		String s4 = new String(letters);
		System.out.println(s4);
		System.out.println(s4.length());
		
		//valueOf 메서드
		//다른 데이터타입을 문자열로 변환하는 매서드
		float PI = 3.14159f;
		String s5 = String.valueOf(PI);
		System.out.println(s5);
	}
	
	private static void usefulMethod() {
		//유용한 메서드들
		String str = "Java Programming, JavaScript programming";
		
		//문자열의 길이
		System.out.println(str.length());
		
		//변환 메서드
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//검색 관련 메서드
		System.out.println(str.charAt(5));	//5번 인덱스의 char
		//Java가 어드 인덱스에 있는지 (중요)
		int pos = str.indexOf("Java");	//문자열 내부에서 Java의 위치
		System.out.println("1st Search Java: " + pos);
		pos = str.indexOf("Java", pos + 4);
		System.out.println("2nd Search Java: " + pos);
		pos = str.indexOf("Java", pos + 4);			//이거 8이여야 되는거 아님?????????????????????
		System.out.println("3nd Search Java: " + pos);
		//검색할 부분문자열이 없으면 -1을 반환
		pos = str.lastIndexOf("Java");
		System.out.println("Last Index Java: " + pos);
		
		//문자열 추출
		System.out.println("SUBSTRING: " + str.substring(5));
		System.out.println("SUBSTRING: " + str.substring(5, 16));
		
		//문자열 치환
		System.out.println("REPLACE: "+ str.replace("Programming", "Coding"));
		
		//trimming : 화이트스페이스 제거 (공백,tab,개행문자를 통틀어서 말함)
		String s6 = "                                Hello     ";
		String s7 = ", Java";
		s6 =s6.trim();
		System.out.println(s6 + s7);
		
		//split : 문자열 분리
		String[] tokens = str.replace(",", "").split(" ");
		System.out.println("SPLIT: " + Arrays.toString(tokens));
		
		//Unicode : 문자열 비교
		//compareTo ((매우 중요~))
		//결과값이 0이면 순번이 같다, 작으면 음수, 크면 양수
		System.out.println("ABC".compareTo("ABD"));		
	}
	
	private static void stringBufferEx() {
		//String 클래스는 immutable
		//StringBuffer 클래스는 mutable
		//내부적으로 버퍼를 통해서 문자열을 만들고
		//최종적으로 String을 반환
		
		//버퍼의 생성
		StringBuffer sb = new StringBuffer("This");
		
		//문자열 추가 : append()
		sb.append(" is pencil");
		
		//문자열 삽입 : insert()
		sb.insert(7, " my");
		
		//문자열 치환 : replace() 
		sb.replace(7, 10, " your");
		System.out.println(sb);
		
		//버퍼 길이 변경
		sb.setLength(10);
		System.out.println(sb);
		
		//메서드 체이닝 기법 활용 가능
		StringBuffer sb2 = new StringBuffer("This").append(" is pencil").insert(7, " my").replace(7, 10, "your");
		String s = sb.toString();	//문자열로 변환
		System.out.println(s);
		
		
	}
	

}
