package patterprgram;

public class eg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //      *        *
		//      **      **
		//      ***    ***
		//      ****  ****
		//      **********
		//      ****  ****
		//      ***    ***
		//      **      **
		//      *        *
		
		int row=9;
		int col=10;
		int star1=1;
		int space1=4;
		int star2=1;
		int space2=4;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=space1;k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=space2;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
		}
		
		
		
	}

}
