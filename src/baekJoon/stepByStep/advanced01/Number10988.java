package baekJoon.stepByStep.advanced01;

public class Number10988 {

	public static void main(String[] args) {
		String str = "asdf";
	// 내 풀이	
		StringBuilder sb = new StringBuilder(str);
 		sb.reverse();
 		
 		if (str.equals(sb.toString())) {
 			System.out.println(1);
 		} else {
 			System.out.println(0);
 		}
 		
	// 좋은 풀이인듯	
 		System.out.println(reversedEqual(str)); // 0
 		System.out.println(reversedEqual("abcba")); // 1
 		
	}
	
	static int reversedEqual(String str) {
		int len = str.length();
		
		for (int i =0; i < len/2; i++) {
			if (str.charAt(i) != str.charAt(len- 1 - i)) {
				return 0;
			}
		}
		return 1;
	}

}
