package MockCodingQuestions;
import java.util.Scanner;
public class ArmStrongNumberMock {
	public static int countDigits(int num)
	{
		int count=0;
		while(num>0)
		{
		count++;
		num=num/10;
		}
		return count;
	}
	public static int findPower(int digit,int power)
	{
		int res=1;
		while(power>0)
		{
		res=res*digit;
		power--;
		}
		return res;
	}
	public static boolean check(int sum,int copy)
	{
	return sum==copy;
	}
	public static  boolean armStrong(int num)
	{
		int sum=0;
		int copy=num;
		int power= countDigits(num);
		while(num>0)
		{
		int temp=num%10;
		int result= findPower(temp,power);
		sum=sum+result;
		num=num/10;
		}	
		 return check(sum,copy);
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
