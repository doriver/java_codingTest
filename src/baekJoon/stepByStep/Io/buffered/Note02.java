package baekJoon.stepByStep.Io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Note02 {

	/* 1 2 입력받아 1+2 출력 */
	// new BufferedReader(new InputStreamReader(System.in));
	// new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
	
		/* 문자열 받기 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		// readLine() 은 한 행을 읽어오고, read() 는 한 문자만 읽어온다.
 		String str = br.readLine();
 		br.close();
 		
 		/* 문자열 분리 */
 		// StringTokenizer( "문자열" , 구분자 );
		StringTokenizer st = new StringTokenizer(str," "); 
		// 구분된 변수꺼내기 , nextToken(); 을 해주면 문자열을 반환해준다.
//		int a = Integer.parseInt(st.nextToken()); // 1 2 입력시 a = 1 , b = 2
//		int b = Integer.parseInt(st.nextToken());
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
//		실수 float은 오차없이 7자리, double은 15자리!
//		실제 정답과 출력값의 절대오차 또는 상대오차가 10(-9) 이하이면 정답이기 때문에 double 사용
		
		/* System.out.println(a+b); */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int c = a+b;
		double c = a/b;
		bw.write(c+"");
		bw.flush();
		bw.close();
	}

}
/*
 * java.lang 패키지의 클래스들은 import 없이 사용가능
 * 
 * public final class System {
 * 
 * public final class Integer extends Number
        implements Comparable<Integer>, Constable, ConstantDesc {
 * 
 * 
 * */

