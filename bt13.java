package btchapter3;

public class bt13 {
	public static void main(String[] args) {
	for (int i=1;i<=4;i++)
	{
		for (int j=1;j<=10;j++)
		{
			if (j>=i && j<=-i+11)
				System.out.print("* ");
			else System.out.print("  ");
		}
		System.out.println();
	}
	for (int i=1;i<=3;i++)
	{
		for (int j=1;j<=10;j++)
		{
			if (j>=-i+4 && j<=i+7)
				System.out.print("* ");
			else System.out.print("  ");
		}
		System.out.println();
	}
	}

}
