package patterprgram;

public class eg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//      *
		//      **
		//      ***
		//      ****
		//      *****
		//      ****
		//      ***
		//      **
		//      *
		
		
		int row=9;
		int col=5;
		int star=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star++;
			}
			else
			{
				star--;
			}
			
		}
		
		
		
	}

}
