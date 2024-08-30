package baekJoon.stepByStep.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number2798 {

	public static void main(String[] args) throws IOException {
		
/*
 * 가장 원초적인 방법, 쌩노가다  , 다른방법도 봐볼만 할듯
 * 최악의 경우 수행시간이 O(N^3) 
 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
 		br.close();

 		StringTokenizer st1 = new StringTokenizer(str1," "); 
 		int N = Integer.parseInt(st1.nextToken());
 		int M = Integer.parseInt(st1.nextToken());
 		
 		StringTokenizer st2 = new StringTokenizer(str2," "); 
 		int[] numbers = new int[N];
 		
 		for (int i=0; i<N; i++) {
 			numbers[i] = Integer.parseInt(st2.nextToken());
 		}
 		
 		int temp = 0;
 		int result = 0;
 		
 		loopOut:
 		for (int i =0; i< N-2; i++) {
 			for (int j=i+1; j< N-1; j++) { // j= 1 , k=2 이렇게 해서 틀렸었음
 				for (int k=j+1; k < N; k++) {
 					temp = numbers[i] + numbers[j] + numbers[k];
 					if (temp == M) {
 						result = temp;
 						break loopOut;
 					}
 					
 					if (result < temp && temp < M) {
 						result = temp;
 					}
 					
 				}
 			}
 		}
 		
 		System.out.println(result);
 		
	}

}
