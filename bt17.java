package btchapter3;
import java.util.Scanner;
public class bt17 {

	public static void main(String[] args) {
		int s=1;
		int t=2;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			System.out.print(s+" ");
			s=s+t;
			t*=2;
		}

	}

}
