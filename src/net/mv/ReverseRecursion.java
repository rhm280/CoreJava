package net.mv;

public class ReverseRecursion {

	String reverse = "";

	public String reverseString(String str) {

		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
			return reverse;
		}
	}

	public static void main(String a[]) {
		ReverseRecursion sr = new ReverseRecursion();
		System.out.println("Result: " + sr.reverseString("Java2 novice"));
	}
}