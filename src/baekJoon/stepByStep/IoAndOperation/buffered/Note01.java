package baekJoon.stepByStep.IoAndOperation.buffered;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class Note01 {

	public static void main(String[] args) throws IOException {
		
		System.out.println(10/3); // 나눈 몫(/) 3
		System.out.println(10%3); // 나눈 나머지(%) 1
		
		// System.out.println("hello"); 와 유사 
		// 속도가 빠르다고 함
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello World!122");
		bw.flush();
		bw.close();
		
		
		
		
		
		

		
	}

}
