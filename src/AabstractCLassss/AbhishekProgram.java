package AabstractCLassss;

public class AbhishekProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//reverse string
//		String s = "velocity";
//		String s1="";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			s1=s1+s.charAt(i);
//		}
//		System.out.println(s1);
		
		//reverse character in string
//		String s = "this is velocity";
//		String[] k = s.split(" ");
//		
//		for(int i=k.length-1;i>=0;i--)
//		{
//			System.out.print(k[i]+" ");
//		}
		
		//remove alphabet in string

//		String s = "ABCD1234@%^$";
//		
//		String k = s.replaceAll("[A-Z0-9]", "");
//		
//		System.out.println(k);
		
		//remove alphabets from string in using for loop
		
//		String s = "12avvdg54hftgh";
//		String s1 ="";
//		
//		for(int i=0;i<=s.length()-1;i++)
//		{
//			if(!Character.isDigit(s.charAt(i)))
//			{
//				s1 = s1+s.charAt(i);
//			}
//		}
//		
//		System.out.println(s1);
		
		
	//seperate uppercase and lowercase and count it	
//		String s= "ABCDDDDDdZzdddFFFabcd";
//		String upper="";
//		String lower="";
//		int upper1=0;
//		int lower1=0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			
//			if(ch>=65 && ch<=90)                   
//			{
//				upper=upper+ch;
//				upper1++;
//			}
//			else
//			{
//				lower=lower+ch;
//				lower1++;
//			}
//			
//		}
//		System.out.println(upper);
//		System.out.println(upper1);
//		System.out.println(lower);
//		System.out.println(lower1);
		
		
//	String s = "abhaaaaaishek";
//	int count =0;
//	
//	for(int i=0;i<s.length();i++)
//	{
//		if(s.charAt(i)=='a')
//		{
//			count++;
//		}
//	}
//		System.out.println(count);
		
		String s = "abhaaaaaishekz";
		int count =0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='i')
			{
				count++;
				System.out.println("character is present");
			}
			else
			{
				System.out.println("character is absent");
			}
			break;
		}
			
		
		
		
		
	}

}
