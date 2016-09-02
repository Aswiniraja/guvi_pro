import java.util.ArrayList;
import java.util.Scanner;

public class binary 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		binary b=new binary();
		
		int le=sc.nextInt();
		String[] a=new String[Math.pow(2,le)];
		for(int i=0;i<Math.pow(2,le);i++)
			a[i]=Integer.toBinaryString(i);
		
		String temp="";
		
		for(int i=0;i<Math.pow(2,le);i++)
		{
			for(int j=i+1;j<Math.pow(2,le);j++)
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
