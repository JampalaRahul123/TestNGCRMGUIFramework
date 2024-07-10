package Strings;

public class ReverseAnStringWithOutMethods1 {

	public static void main(String[] args) {
		String s= "Java Is Wonderful Language";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		System.out.print(s1);
	}
}
