package MockCodingQuestions;
import java.util.Scanner;
public class ArmStrongNumber {
	public static int countDigits(int num)
	{
		int count=0;
		for(int i=num;i>0;i=i/10)
		{
		count++;
		}
		return count;
	}
	public static int findPower(int digit,int power)
	{
		int res=1;
		for(int j=1;j<=power;j++) // for(j=power;j>0;j--)
		{
		res=res*digit;
		}
		return res;
	}
	public static boolean check(int sum,int num)
	{
	return sum==num;
	}
	public static  boolean armStrong(int num)
	{
		int sum=0;
		int power= countDigits(num);
		for(int k=num;k>0;k=k/10)
		{
		int temp=k%10;
		int result= findPower(temp,power);
		sum=sum+result;
		}	
		 return check(sum,num);
	}
	public static void main(String[] args) {
		System.out.println("program started");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(armStrong(num));
		System.out.println("program ended");
		scan.close();
	}
}
