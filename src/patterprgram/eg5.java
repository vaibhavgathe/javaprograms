package patterprgram;

public class eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//    *
		//   * *
		//  * * *
		// * * * * 
		
		int row =4;
		int col=4;
		int star=1;
		int space=3;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}
		
		
	}

}
