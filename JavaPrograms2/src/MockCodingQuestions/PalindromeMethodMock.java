package MockCodingQuestions;

import java.util.Scanner;
public class PalindromeMethodMock {
	public static int palindromeNumber(int num)
	{
		int result=0;
		while(num>0)
		{
		int temp=num%10;// retrieves last digit
		result=result*10+temp;// combines number with digit 
		num=num/10; // removes last digit
		}
		return result;
		}
		public static boolean palindrome(int num)
		{ 
		int res=palindromeNumber(num);
		if(res==num)
		{
		return true;
		}
		else
		{
		return false;
		}
		}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(palindrome(num));
		scan.close();
	}
}
