package baekJoon.stepByStep.string;

import java.util.StringTokenizer;

public class Note02 {

	public static void main(String[] args) {
	
//	StringBuilder
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		
		System.out.println(sb); // 만든 별 찍힘
		
		
		StringBuilder sb01 = new StringBuilder("789");
		sb01.reverse();
		System.out.println(Integer.parseInt(sb01.toString())); // 987
		
//	StringTokenizer( "문자열" , 구분자 );
		StringTokenizer st = new StringTokenizer("가 나다 라 바사  "," "); 
		System.out.println(st.countTokens()); // 4
		System.out.println(st.nextToken()); // 가
		System.out.println(st.nextToken()); // 나다
		System.out.println(st.nextToken()); // 라
		System.out.println(st.nextToken()); // 바사

		System.out.println(st.countTokens()); // 0
		
//	String > int , long
		String a = "1234";
		int ai = Integer.parseInt(a);
		long al = Long.parseLong(a);
		System.out.println(ai + " " + al); // 1234 1234
		
	}

}
