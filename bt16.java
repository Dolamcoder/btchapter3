package btchapter3;
import java.util.Scanner;
public class bt16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("nhap so luong phan tu cua day: ");
		int n=sc.nextInt();
		int s=0;
		int t=3;
		for (int i=1;i<=n;i++)
		{
			System.out.print(s+" ");
			s=s+t;
			t+=2;
		}
	}

}
