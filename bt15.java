package btchapter3;

public class bt15 {

	public static void main(String[] args) {
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=7;j++)
			{
				if (j>=-i+5 && j<=i+3)
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		for (int i=1;i<=7;i++)
		{
			if (i>1 && i<7)
				System.out.print("* ");
				else System.out.print("  ");
		}
	}

	}
