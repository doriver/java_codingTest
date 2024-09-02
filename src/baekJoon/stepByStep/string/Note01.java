package baekJoon.stepByStep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Note01 {

	public static void main(String[] args) throws IOException {

		
/*
 * 문자열의 i번째 글자 뽑기
 * char 문자열변수 = 문자열.charAt(12) // 12번째 문자1개만 반환		
 */
		String a = "asdklfjl";
		String b = "강낭콩";
		
		System.out.println(a.charAt(2)); // d
		System.out.println(b.charAt(2)); // 콩
/*
 * 문자열의 길이
 * 문자열.length()		
 */
		System.out.println(a.length()); // 8
		System.out.println(b.length()); // 3	
/*
 * 	아스키 코드
 * 	char <-> int , 여기서 int가 아스키 코드값이 됨
 */
		char q = 'A';
		char y = 'B';
		System.out.println(q+y); // 131 나옴 , AB출력 안됨
		
		int i = (int)q;
		System.out.println(i); // 65
		System.out.println((char)i); // A
		
		char e = '3';
		System.out.println((int)e); // 51
	}
}
