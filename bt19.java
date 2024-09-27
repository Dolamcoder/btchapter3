package btchapter3;

import java.util.Scanner;

public class bt19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=1;
		int t=2;
		for (int i=1;i<=n;i++)
		{
			System.out.print(s+" ");
			s+=t;
			t*=3;
		}
	}

}
