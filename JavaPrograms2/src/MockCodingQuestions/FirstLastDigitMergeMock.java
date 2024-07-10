package MockCodingQuestions;

import java.util.Scanner;
public class FirstLastDigitMergeMock {
	public static int merge(int num)
	{
	int n1=num%10;
	int n2=1;
	while(num>0)
	{
	n2=num%10;
	num=num/10;
	}
	int res=n2*10+n1;
	return res;
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	System.out.println(merge(num));
	scan.close();
	}

}
