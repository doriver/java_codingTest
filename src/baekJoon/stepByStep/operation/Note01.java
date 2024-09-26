package baekJoon.stepByStep.operation;

import java.util.Arrays;

public class Note01 {

	public static void main(String[] args) {

		System.out.println(47 % 10); // 7 , 나머지
		System.out.println(47 / 10); // 4 , 몫

		// 각 자릿수
		System.out.println(472 / 100); // 4
		System.out.println((472 / 10) % 10); // 7
		System.out.println(472 % 10); // 2
		
		int number = 1234;
	//  몇의 자리수인가
		int k = 0;
		while(number != 0) {
			k = k + 1;
			number = number / 10;
		}
		System.out.println(k); // 4
		
	// 각 자리수 파지
		number = 1234;
		int[] a = new int[4];
		for (int i = 0; i < 4; i++) {
			a[i] = number % 10;
			number = number / 10;
		}
		System.out.println(Arrays.toString(a)); // [4, 3, 2, 1]
	
	// 각 자리수 더하기
		number = 1234;
		int sum = 0;
		while (number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		System.out.println(sum); // 10
		
		
	}

}
