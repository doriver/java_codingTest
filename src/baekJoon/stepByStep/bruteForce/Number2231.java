package baekJoon.stepByStep.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// for문 안에서 i를 변하게 해서 틀림
// 다른풀이도 봐보기
public class Number2231 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		br.close();
		int length = str.length();
		
		int N = Integer.parseInt(str);
 		

 		int answer = 0;
 		
 		
 		int sum;
 		int number;

 		for (int i = N - (length*9); i <= N; i++) {
 			sum = 0;
 			number = i; // 이거 안해줘서 틀림
 			
 			while (number != 0) {
 				sum = sum + (number % 10);
 				number = number / 10;
 			}
 			
 			if ((i + sum) == N ) {
 				answer = i;
 				break;
 			}
 		}
 		
 		System.out.println(answer);
 	
 		
	}

}
