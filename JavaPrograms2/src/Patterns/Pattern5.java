package Patterns;

public class Pattern5 {
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(i*2)-1;j++) {
				if(i+j>=n+1)
			System.out.print("*");
			}
			System.out.println();
	}
}
}