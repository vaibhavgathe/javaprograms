package AabstractCLassss;

public class programpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s ="ABCDDDDdddabcd";
//		String upper="";
//		String lower="";
//		int upper1=0;
//		int lower1=0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			if(ch>=65 && ch<=80)
//			{
//				upper=upper+ch;
//				upper1++;
//			}
//			else
//			{
//				lower=lower+ch;
//				lower1++;
//			}
//		}
//		System.out.println(upper);
//		System.out.println(upper1);
//		System.out.println(lower);
//		System.out.println(lower1);
		
		
//		String s ="this is love";
//		String[] k=s.split(" ");
//		
//		for(int i=k.length-1;i>=0;i--)
//		{
//			System.out.println(k[i]);
//		}
//		
		
//		String s ="velocity";
//		String s1="";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			s1=s1+s.charAt(i);
//		}
//		System.out.println(s1);
		
//		String s ="udvch213423njnj";
//		String s1="";
//		
//		for(int i=0;i<s.length();i++)
//		{
//			if(!Character.isDigit(s.charAt(i)))
//			{
//				s1=s1+s.charAt(i);
//			}
//		}
//		System.out.println(s1);
		
//		String s = "@#$%^&Accenture";
//		
//		String k = s.replaceAll("[@#$%^&]", "");
//		
//		System.out.println(k);
		
		
		String s ="ABGGFJHJJHCD3232jhghabcd";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch>=6)
			{
				count++;
			}
		}	
		
		System.out.println(count);
		
	}

}
