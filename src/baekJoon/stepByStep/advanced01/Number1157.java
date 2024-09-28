package baekJoon.stepByStep.advanced01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
m 1개
i 4개
s 4개
p 1개

 */

// 존나 잘푼듯, 완벽히 이해는 못함, 다른풀이 봐볼만도 할듯
public class Number1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

 		br.close();
 		
 		char cc = '0';
 		Map<Character, Integer> mm = new HashMap<>();
 		// Map은 key는 단 하나
 		
 		// Map을 이용해 각 단어별로 몇개있는지 체크 
 		for (int i = 0; i < str.length(); i++ ) {
 			cc = Character.toUpperCase(str.charAt(i));
 			
 			if (mm.containsKey(cc)) {
 				mm.put(cc, mm.get(cc) + 1);
 			} else {
 				mm.put(cc, 1);
 			}
 		}
 		
 		int max = 0;
 		int temp = 0;
 		boolean duplication = false;
 		char answer = '0';
 		
 		// 가장 많이 사용된 단어 찾기
 		for (char key : mm.keySet()) {
 			temp = mm.get(key);
 
 			if (temp > max) {
 				max = temp;
 				duplication = false;
 				answer = key;
 			} else if (temp == max) {
 				duplication = true;
 			}
 		}
 		
 		
 		if (duplication) {
 			System.out.println("?");
 		} else {
 			System.out.println(answer);
 		}
	}
}
