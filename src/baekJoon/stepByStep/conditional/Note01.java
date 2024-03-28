package baekJoon.stepByStep.conditional;

public class Note01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int int01 = 2;
		int int02 = 3;
		
		// 두 수 비교에선 3가지 경우밖에 없음, 3가지로 완전히 분할됨 
		if (int01 < int02) {
			System.out.println("<");
		} else if (int01 > int02) {
			System.out.println(">");			
		} else {
			System.out.println("==");						
		}
		
		// 수의 연속성인가?
		if (int01 >= 90) {
			// 90 이상인 수들
 		} else if (int01 >= 80) { // if문에선 앞에서 걸러져서 89 쪽은 따로 언급 안해도 됨
 			// 80 ~ 89
 		} else if (int01 >= 70) {
 			// 70 ~ 79
 		} else if (int01 >= 60) {
 			// 60 ~ 69
 		} else {
 			// 60 미만인 수들
 		}
		
		Boolean A = null;
		Boolean B = null;
		
		if ( A && B ) {
			
		}
		
		if ( A ) {		
 			if ( B ) {
 				// A && B
 			} else {
 				// A && ~B 				
 			}
 		} else {
 			// ~A 			
 		}
		
	}

}
