package baekJoon.stepByStep.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 10950 번
 * */
public class Number10950 {

	public static void main(String[] args) throws IOException {
/*
 * 1. 내가 푼 풀이, Map에 넣음
 * */
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String str = br.readLine();
// 		
// 		Map<Integer,String> tool = new HashMap<>();
//
// 		int T = Integer.parseInt(str);
// 		
// 		for (int i = 1; i <= T; i++) {
// 			tool.put(i, br.readLine());
// 		}
// 		
// 		StringTokenizer st = null; 
// 		
// 		for (int i = 1; i <= T; i++ ) {
// 			st = new StringTokenizer(tool.get(i)," ");
// 			int a = Integer.parseInt(st.nextToken()); // 1 2 입력시 a = 1 , b = 2
// 			int b = Integer.parseInt(st.nextToken());
// 			System.out.println(a+b);
// 		}
// 		
// 		br.close();

/*
 * 2. 내가 푼거 배열로 변형
 * */
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String str = br.readLine();
// 		
//
// 		int T = Integer.parseInt(str);
// 		int arr[] = new int[T];
// 		
// 		StringTokenizer st = null;
// 		
// 		for (int i = 1; i <= T; i++) {
// 			st = new StringTokenizer(br.readLine()," ");
// 			arr[i-1] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
// 		}
// 		
// 		for (int k : arr) {
// 			System.out.println(k);
// 		}
// 		
// 		br.close();		
		
/*
 * 3. StringBuilder 에 계산한 식을 넣어준 뒤 나중에 한 번에 출력해주는 방식
 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		String str = br.readLine();
 		
 		int T = Integer.parseInt(str);
 		
 		StringTokenizer st = null;
 		StringBuilder sb = new StringBuilder();
 		
 		for (int i = 1; i <= T; i++) {
 			st = new StringTokenizer(br.readLine()," ");
 			sb.append( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) );
 			sb.append('\n'); // 오버로드? 로 다양한 파라미터 받음
 		}
 		
 		System.out.println(sb);
 		br.close();		
		
/*
 * 4. 다른 풀이, nextInt()라는 펑션 있나봐
 * */
//		Scanner in = new Scanner(System.in);
//		 
//		int c = in.nextInt();
//		int arr[] = new int[c];
// 
//		for (int i = 0; i < c; i++) {
//			int a = in.nextInt();
//			int b = in.nextInt();
//			arr[i] = a + b;
//		}
//		in.close();
// 
//		for (int k : arr) {
//			System.out.println(k);
//		}
	}

}
