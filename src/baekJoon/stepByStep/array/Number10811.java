package baekJoon.stepByStep.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10811 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

 		
		StringTokenizer st = new StringTokenizer(str," "); 
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		
		// 1 ~ N 바구니
		int[] baskets = new int[N]; 
		for (int k = 0; k< N; k++) {
			baskets[k] = k+1;
		}		
		
		StringTokenizer inv = null;
		int i,j = 0;
		for (int k = 0; k < M; k++) {
			inv = new StringTokenizer(br.readLine()," ");
			i = Integer.parseInt(inv.nextToken());
			j = Integer.parseInt(inv.nextToken());
			
			// 왼쪽으로부터 i번째 ~ j번째 바구니를 역순으로 만들기
			int num = (j-i+1) / 2;
			int temp = 0; // 맨 처음과 맨마지막 짝짝이 바꿔줌
			for (int q = 0; q < num; q++) {
				temp = baskets[i-1 + q];
				baskets[i-1 + q] = baskets[j-1 - q];
				baskets[j-1 - q] = temp;
			}
			
		}
		
		
		br.close();
		String answer = "";
		for (int k = 0; k < N; k++) {
			answer = answer + baskets[k] + " ";
		}
		System.out.print(answer);

 	
	}

}
