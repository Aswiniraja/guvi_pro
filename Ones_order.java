import java.util.ArrayList;
import java.util.Scanner;

public class binary_in_order_of_ones 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		for(int j=0;j<=n;j++)
		{
			for(int i=0;i<Math.pow(2,n);i++)
			{
				if(Integer.bitCount(i)==j)
				{
					String s=Integer.toBinaryString(i);
					if(s.length()<n)
					{
						for(int k=0;k<n-Integer.toBinaryString(i).length();k++)
						{
							s="0"+s;
						}
					}
					System.out.print(s+" ");	
				}
					
			}
		}

	
	}

}
