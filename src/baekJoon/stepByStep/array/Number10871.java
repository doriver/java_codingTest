package baekJoon.stepByStep.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nx = br.readLine();
		String a = br.readLine(); 		
 		br.close();

 		StringTokenizer st = new StringTokenizer(nx," "); 
 		int n = Integer.parseInt(st.nextToken());
 		int x = Integer.parseInt(st.nextToken());
 		
 		StringTokenizer st2 = new StringTokenizer(a," "); 
 		
 		String answer = "";
 		for (int i = 1; i <= n; i++) {
 			int aa = Integer.parseInt(st2.nextToken());
 			if (aa < x) {
 	 			answer += aa + " ";
 	 		}
 		}
 		
 		
 		System.out.println(answer);
 		
	}


}

