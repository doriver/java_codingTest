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
		
		System.out.println((int)'0'); // 48
		
/*
 *  getBytes() : byte배열을 리턴함		
 */
		String str = "12345";
		for (byte value : str.getBytes()) {
			System.out.print(value); // 49 ~ 53
		}
		System.out.println();
		for (byte value : "asdf".getBytes()) {
			System.out.println(value); // 97 , 115 , 100 , 102
		}
/*
 * indexOf() 메서드 
 * 특정 문자열이 존재하면 해당 문자열의 첫 번째 인덱스가 반환되고 그렇지 않으면 -1이 반환
 * String, char다 입력받아짐
 */
		System.out.println("abcde".indexOf("a")); // 0
		System.out.println("abcde".indexOf("c")); // 2
		System.out.println("abcde".indexOf('c')); // 2
		
		
		for (char j = 'a'; j <= 'z'; j++) {
			System.out.print("abcde".indexOf(j));
		} // 01234-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1
		System.out.println();
		
		for (char j = 'a'; j <= 'z'; j++) {
			
 			System.out.print(j + " ");
 		} // a b c d e f g h i j k l m n o p q r s t u v w x y z 
		System.out.println();
	}
}
