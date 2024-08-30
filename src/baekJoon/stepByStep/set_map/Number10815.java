package baekJoon.stepByStep.set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Number10815 {
	public static void main(String[] args) throws IOException {

		// 시간초과 나옴, 알고리즘으로 풀어야 하는듯
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str1 = br.readLine();
		int M = Integer.parseInt(br.readLine());
		String str2 = br.readLine();
 		
 		br.close();
 		
 		StringTokenizer st1 = new StringTokenizer(str1," "); 

 		Set<Integer> nSet = new HashSet<>();
 		for (int i = 0; i < N; i++) {
 			nSet.add(Integer.parseInt(st1.nextToken()));
 		}

 		StringTokenizer st2 = new StringTokenizer(str2," "); 
 		String answer = "";
 		
 		for (int i = 0; i < M; i++) {
 			
 			if (nSet.contains(Integer.parseInt(st2.nextToken()))) {
 				answer += 1 + " ";
 			} else {
 				answer += 0 + " ";
 			}
 		}
 		
 		System.out.println(answer);
 
 		
 	
 		
	}
}
