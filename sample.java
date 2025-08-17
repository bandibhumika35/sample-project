class A{
	public static void main(String [] abc){
		int a=10,b=100;
		int s=0;
		for(int i=a;i<=b;i++)
		{
			int fc=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					fc++;
				}
			}
			if (fc==2)
			{
				s=s+i;
			}
			System.out.print(s);
		}
		System.out.print(s);
	}
}
