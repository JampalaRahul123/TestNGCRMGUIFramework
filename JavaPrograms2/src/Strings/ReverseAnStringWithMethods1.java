package Strings;

public class ReverseAnStringWithMethods1 {
	public static void main(String[] args) {
		String s= "Java Is Wonderful Language";
		String sb = new StringBuilder(s).reverse().toString();
		System.out.println(sb);
	}
}
