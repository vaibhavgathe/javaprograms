package AabstractCLassss;

import java.util.Scanner;

public class LOgicPrograms5454 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter num1");
//		int num1 = sc.nextInt();
//		System.out.println("enter num2");
//	    int num2 = sc.nextInt();
//	    
//	    int sum = num1+num2;
//	    System.out.println("addition is "+sum);
		
		
		
//		String s = "velocity";
//		String s1="";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			s1=s1+s.charAt(i);
//		}
//		System.out.println(s1);
		
//		String s ="radar";
//		String s1="";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			s1=s1+s.charAt(i);
//			
//			
//		}
//		System.out.println(s1);
//		if(s1.equals(s))
//		{
//			System.out.println("number is palindrome");
//		}
//		else
//		{
//			System.out.println("number is not palindrome");
//		}
		
		
//		int a = 5;
//		int b = 10;
//		
//		int c = 0;
//		
//		for(int i=1;i<=b;i++)
//		{
//			c=c+a;
//		}
//		System.out.println(c);
		
		
//		String s = "this is velocity";
//		String[] k = s.split(" ");
//		
//		for(int i=k.length-1;i>=0;i--)
//		{
//			System.out.print(k[i]);
//		}
		
//		String s = "ABCDffhfhDDDddddabcd";
//		String upper="";
//		int upper1=0;
//		String lower="";
//		int lower1=0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			
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
//			
//		}
//		System.out.println(upper);
//		System.out.println(upper1);
//		System.out.println(lower);
//		System.out.println(lower1);
		
//		String s = "ugvssHXBkh12457dasdasocuhaeuj";
//		
//		int count = 0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			
//			count++;
//		}
//		System.out.println(count);
		
	//odd and even number	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter num1");
//		int num1 = sc.nextInt();
//		
//		int num2 =2;
//		
//		if(num1%2==0)
//		{
//			System.out.println("guven number is even");
//		}
//		else
//		{
//			System.out.println("given number is odd");
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter num1");
//		
//		int num1 = sc.nextInt();
//		int num2 = 2;
//		
//		if(num1%2==0)
//		{
//			System.out.println("number is even");
//		}
//		else
//		{
//			System.out.println("number is odd");
//		}
		
		
		
		//program for armstrong number
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number");
//		int num1 = sc.nextInt();
//		int num2 = 0;
//		
//		for(int i=num1;i>0;i=i/10)
//		{
//			int num3=i%10;
//			num2=num2+(num3*num3*num3);
//		}
//		System.out.println("original number is"+num1);
//		System.out.println("addition of digit cube is"+num2);
//		
//		if(num1==num2)
//		{
//			System.out.println("given number is armstrong");
//		}
//		else
//		{
//			System.out.println("given number is not armstrong");
//		}
//		
//		System.out.println(8/10);
//		System.out.println(88%10);
		
		//prime number
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter num1");
//		
//		int num1 = sc.nextInt();
//		int count = 0;
//		
//		for(int i=2;i<num1;i++)
//		{
//			if(num1%i==0)
//			{
//               count++;
//			}
//			if(count==0)
//			{
//			 System.out.println("number is prime"+num1);	
//			}
//			else
//			{
//				System.out.println("number is not prime"+num1);
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter num1");
//		
//		int num1 = sc.nextInt();
//		
//		int count=0;
//		
//		for(int i=2;i<num1;i++)
//		{
//			if(num1%2==0)
//			{
//				count++;
//				
//			}
//			if(count==0)
//			{
//				System.out.println("number is prime");
//			}
//			else
//			{
//				System.out.println("number is not prime");
//			}
//		}
		
		int input=7;
		int count=0;
		for(int i=2;i<input;i++)
		{
		if(input%i==0) 
		{
		count++;
		}
		if(count==0)
		{
		System.out.println("number "+input+ " is a prime number");
		}
		else {
			System.out.println("number "+input+ " is not a prime");

		}
		
		}
		
		
		
		
	    
	    
	}

}
