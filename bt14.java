package btchapter3;

public class bt14 {

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
	}

}
