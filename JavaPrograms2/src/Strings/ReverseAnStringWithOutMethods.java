package Strings;

public class ReverseAnStringWithOutMethods {

	public static void main(String[] args) {
		
		String s= "Java Is Wonderful Language";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
