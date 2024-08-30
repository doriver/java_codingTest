package baekJoon.stepByStep.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Note01 {
	public static void main(String[] args) throws IOException {
		
/*
 * 	N개의 정수가 공백으로 구분해서 주어지는 경우 ex) 20 10 35 30 7
 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = 4;
		
		StringTokenizer st = new StringTokenizer(str," "); 
		
		for (int i = 1; i <= N; i++) {
 			int aa = Integer.parseInt(st.nextToken());
 			// 여기에 각 수에대해 logic 작성
		}
	}
}
