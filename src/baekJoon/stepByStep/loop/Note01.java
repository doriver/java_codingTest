package baekJoon.stepByStep.loop;

public class Note01 {

	public static void main(String[] args) {
		int sum = 0;
 		for (int i = 1; i <= 10; i++) {
 			sum += i; // i를 다 더한값 ( 앞변수에, 뒤변수를 더해주는거 )
 		}
// 		sum += i * (i+1) ; 이런 형태도 생각 가능
 		
 		System.out.println(sum); // 55
	}

}
