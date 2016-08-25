

import java.util.ArrayList;
import java.util.Scanner;

public class binary 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		binary b=new binary();
		
		int le=sc.nextInt();
		int[] a=new int[le];
		for(int i=0;i<le;i++)
			a[i]=sc.nextInt();
		
		int temp=0;
		
		for(int i=0;i<le;i++)
		{
			for(int j=i+1;j<le;j++)
			{
				if(b.count_1(Integer.toBinaryString(a[i]))<b.count_1(Integer.toBinaryString(a[j])))
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else if(b.count_1(Integer.toBinaryString(a[i]))==b.count_1(Integer.toBinaryString(a[j])))
				{
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i1=0;i1<le;i1++)
			{
				System.out.println(a[i1]);
			}
		}

	}

	int count_1(String s)
	{
		int a=Integer.parseInt(s);
		int count=0;
		int z=0;
		do 
		{
			z=a%10;
			a=a/10;
			if(z==1)
				count++;
		}while(a>0);
		return count;
	}
}
