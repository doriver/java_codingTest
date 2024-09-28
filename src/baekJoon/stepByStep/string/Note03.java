package baekJoon.stepByStep.string;

public class Note03 {

	public static void main(String[] args) {
	// char 대소문자
		char c1 = 'a';
		char c2 = 'A';
		System.out.println(Character.toUpperCase(c1) + " " + Character.toUpperCase(c2)); // A A
		System.out.println(Character.toLowerCase(c2)); // a
		System.out.println(Character.isLowerCase(c1) + " " + Character.isUpperCase(c2)); // true true

	// String 대소문자
		String str1 = "abc";
		String str2 = "QWE";
		System.out.println(str1.toUpperCase() + " " + str2.toLowerCase()); // ABC qwe
	}

}
