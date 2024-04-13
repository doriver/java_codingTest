package note01;

import java.util.StringTokenizer;

/**
 *   java.util.StringTokenizer
 * 
 * Java에서 문자열을 구분자(delimiter)를 기준으로 토큰(token)으로 분리하는데 사용되는 클래스
 * 주로 문자열을 파싱할 때 유용하게 쓰임
 * 
 * String.split() 메서드보다 성능이 좋음
 */

public class AaStringTokenizer {

	public static void main(String[] args) {
		
		String a = "1 2 3 4 5 ";
		
		// StringTokenizer(String str, String delim)
		// : 주어진 문자열을 지정된 구분자를 사용하여 분리 하여 파징
		StringTokenizer stkn = new StringTokenizer(a, " ");
		
		// int countTokens(): 남아 있는 토큰의 개수를 반환
		System.out.println(stkn.countTokens()); // 5
		
		// boolean hasMoreTokens(): 토큰이 더 존재하는지 여부를 확인
		while (stkn.hasMoreTokens()) { 
			// String nextToken(): 다음 토큰을 반환
			System.out.println(stkn.nextToken()); // 1 ~ 5 출력
		}
	}

}
