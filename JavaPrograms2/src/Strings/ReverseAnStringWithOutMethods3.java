package Strings;

public class ReverseAnStringWithOutMethods3 {

	public static void main(String[] args) {
		
		String s= "Java Is Wonderful Language";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
	}

}
