package MockCodingQuestions;
import java.util.Scanner;
public class SumDigitMock {
	public static int sumDigit(int num)
	{
	int sum=0;
	while(num>0)
	{
	int temp=num%10;
    sum=sum+temp;
	num=num/10;
	}
	return sum;
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(sumDigit(num));
		scan.close();
	}
}
