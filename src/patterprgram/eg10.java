package patterprgram;

public class eg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//     *****
		//      ****
		//       ***
		//        **
		//         *
		//        **
		//       ***
		//      ****
		//     *****
		
		int row =9;
		int col=5;
		int star=5;
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
			if(i<5)
			{
				star--;
				space++;
			}
			else
			{
				star++;
				space--;
			}
		}
		
		
		
	}

}
