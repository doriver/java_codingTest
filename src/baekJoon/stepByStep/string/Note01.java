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
	}
}
