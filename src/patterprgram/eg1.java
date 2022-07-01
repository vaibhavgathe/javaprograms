package patterprgram;

public class eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//     *********
		//      *******
		//       *****
		//        ***
		//         *
		
		int row=5;
		int col=9;
		int star=9;
		int space=0;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}
		
		
	}

}
