public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int sum1=0;
		int sum2=0;
		int i=0;
		
		for(i=0;i<a;i++)
			al.add(sc.nextInt());
		
		for(i=0;i<al.size();i++)
		{
			sum1=0;
			sum2=0;
			for(int j=0;j<=i;j++)
				sum1+=al.get(j);
			
			for(int k=i+1;k<al.size();k++)
				sum2+=al.get(k);
			
			if((sum1/(i+1))==(sum2/(al.size()-i-1)))
				break;
				
				
		}
		if(i<al.size())
		{
			for(int j=0;j<=i;j++)
				System.out.print(al.get(j)+" ");
			System.out.println();
			
			for(int k=i+1;k<al.size();k++)
				System.out.print(al.get(k)+" ");
		}
		else
			System.out.println("not present");
	}

