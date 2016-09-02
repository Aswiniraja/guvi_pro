public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the key value for "+n+" students");

	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();

	int m;
	int sum=0;
	int count=1;

	do
	{
	m=0;
		for(int i=0;i<n;i++)
		{
		if(m==0||m>a[i])
			m=a[i];

		}

		if(m>0)
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]==m)
				{
					sum=sum+count;		
					a[i]=0;
				}
			}
		}


	count++;

	}while(m>0);

	System.out.println(sum);

}
