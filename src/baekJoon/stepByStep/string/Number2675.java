package baekJoon.stepByStep.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// a를 잡아서 aaaa 만들려고 하는데 for문말고 있나?
public class Number2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		String str = "";
		StringTokenizer st = null; 
		
		int R = 0; // 반복 횟수
		String S =""; // 각 글자가 반복할 문자열 
		
		char c = '0';
		String answer = "";
		
		for (int i = 0; i < T; i++) { // 각 테스트 수행
			str = br.readLine();
			st = new StringTokenizer(str," ");
			
			R = Integer.parseInt(st.nextToken());
			S = st.nextToken();
			
			for (int j = 0; j < S.length(); j++ ) { // S의 각 자리를 반복하기 위해
				c = S.charAt(j);
				
				for (int k = 0; k < R; k++) {
					answer += c;
				}
			}
			
			System.out.println(answer);
			answer=""; // 이거 안해줘서 틀렸음
		} 		
 		br.close();

	}

}
