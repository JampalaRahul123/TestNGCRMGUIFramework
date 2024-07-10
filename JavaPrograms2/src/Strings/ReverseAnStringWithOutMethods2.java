package Strings;

public class ReverseAnStringWithOutMethods2 {
	
	public static void main(String[] args) {
		String s= "Java Is Wonderful Language";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}
}
