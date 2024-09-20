package baekJoon.stepByStep.operation;

public class Number2588 {

	public static void main(String[] args) {

		String upLine = "472"; 
		String downLine = "385"; 
		
		int u = Integer.parseInt(upLine);
		int d = Integer.parseInt(downLine);

//	 좋은 풀이인듯 		
	 	System.out.println(u * (downLine.charAt(2) - '0'));
	 	System.out.println(u * (downLine.charAt(1) - '0'));
	 	System.out.println(u * (downLine.charAt(0) - '0'));
	 	System.out.println(u * d);
	 		
//	내가 했던 풀이, 별로임
 		int u100 = (u / 100) * 100 ;
 		int u10 =  ((u / 10) % 10) * 10;
 		int u1 = u % 10; 

 		int d100 = d / 100;
 		int d10 = (d / 10) % 10;
 		int d1 = d % 10; 
 		
 		int l1 = (d1 * u1) + (d1 * u10) + (d1 * u100);
 		int l2 = (d10 * u1) + (d10 * u10) + (d10 * u100);
 		int l3 = (d100 * u1) + (d100 * u10) + (d100 * u100);

 		System.out.println(l1); 
 		System.out.println(l2); 
 		System.out.println(l3); 
 		System.out.println(l1+ l2*10+ l3*100); 


	}

}
