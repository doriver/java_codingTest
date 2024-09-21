package baekJoon.stepByStep.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// set으로 할까 고민도함
// 2개 숫자 보관, 비교하는 과정
public class Number5597 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 0;
 		
		
		int[] array = new int[30];
		for (int i = 0; i < 28; i++) {
			N = Integer.parseInt(br.readLine());
			array[N-1] = 1;
		}
		br.close();
		
		int f = 0; // 작은거
		int s = 0;
		
		for (int i = 0; i < 30; i++) {
			if (array[i] == 0) {
				if ( f == 0 ) {
					f = i+1;					
				}
				if (f > i+1) {
					s = f;
					f = i+1;
				} else {
					s = i+1;
				}
				
			}
		}
		
		System.out.println(f);
		System.out.println(s);
	}

}
