

import java.util.Arrays;
import java.util.Scanner;

public class leastno {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int v=sc.nextInt();
	String s=String.valueOf(n);
	StringBuffer sb;
	
	int[] a=new int[String.valueOf(n).length()];
	int i=0;
	
	do
	{
		a[i]=n%10;
		n=n/10;
		i++;
		
	}while(n>0);
	Arrays.sort(a);
	i=0;
	sb=new StringBuffer(s);
	for(int j=s.length()-v;j<a.length;j++)
	{
	sb.deleteCharAt(sb.indexOf(String.valueOf(a[j])));
	}
	s=sb.toString();
	System.out.println(s);

	}

}
