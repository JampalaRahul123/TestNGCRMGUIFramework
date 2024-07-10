package MockCodingQuestions;

import java.util.Scanner;
public class PrimeMock {
	public static int primeNumber(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
		if(num%i==0)
		{
		count++;
		}
		}
		return count;
		}
		public static boolean prime(int num)
		{
		int c=primeNumber(num);
		if(c==2)
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
		System.out.println(prime(num));
		scan.close();
	}
}

