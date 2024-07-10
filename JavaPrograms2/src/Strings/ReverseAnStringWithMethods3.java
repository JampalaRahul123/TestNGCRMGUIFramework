package Strings;

public class ReverseAnStringWithMethods3 {
	public static void main(String[] args) {
		String s= "Java Is Wonderful Language";
		String sb = new StringBuffer(s).reverse().toString();
		System.out.println(sb);
	}
}
