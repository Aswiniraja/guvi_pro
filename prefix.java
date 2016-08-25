
import java.util.ArrayList;
import java.util.Scanner;

public class prefix
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> a=new ArrayList<String>();
		
		int n=sc.nextInt();
		String s1="";
		int f=0;
		for(int i=0;i<n;i++)
			a.add(sc.next());
		
		for(int i=0;f==0;i++)
		{
			f=0;
			s1=a.get(0).substring(0, i+1);
			for(int j=0;j<a.size();j++)
			{
				if(a.get(j).startsWith(s1))
				{}
				else
					f=1;
			}
			if(f==1)
				s1=s1.substring(0, s1.length()-1);
			
		}
		System.out.println(s1);

	}

}
