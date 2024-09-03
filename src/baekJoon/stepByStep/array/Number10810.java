package baekJoon.stepByStep.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// new int[3] 에서 3은 원소개수임, 즉 마지막 index는 2
// for문 반복변수 범위 조심
public class Number10810 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
 		StringTokenizer st = new StringTokenizer(str," "); 
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
			
		int[] bucket = new int[N]; // N-1 이라 했다가 틀림
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i=0; i <M; i++) {
	 		st = new StringTokenizer(br.readLine()," "); 
	 		
	 		a = Integer.parseInt(st.nextToken()); 
	 		b = Integer.parseInt(st.nextToken()); 
	 		c = Integer.parseInt(st.nextToken()); 
	 		
	 		for (int j = a-1; j < b; j++) { // b-1이라 했다가 틀림
	 			bucket[j]=c;
	 		}
		}
		
 		br.close();

 		String answer = "";
 		for (int i=0; i< N; i++) {
 			answer += bucket[i] + " ";
 		}
 		System.out.println(answer);
 		
	}

}
