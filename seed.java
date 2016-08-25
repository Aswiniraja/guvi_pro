import java.util.Scanner;
public class seed
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0;
		int pro=0;
		int f=0;
		
		for(int i=1;i<n/2;i++)
		{
		
			if(n%i==0)
			{
				pro=i;
				n1=i;
				do
				{
					pro=pro*(n1%10);
					n1=n1/10;
				}while(n1>0);
				
				if(pro==n)
				{
					System.out.println(i);
					f=1;
				}
					
			}
			
		}
		if(f==0)
			System.out.println("No seed present");

	}

}
