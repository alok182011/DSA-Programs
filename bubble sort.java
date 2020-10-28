class bubblesort
{
	public static void main(String args[])
	{
		int[] a={36,19,29,12,5};
		//for number of rounds
		int i,j,flag,temp;
		for(i=0;i<a.length;i++)
		{
			flag=0;
			for(j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int k:a)
		{
			System.out.print(k+" ");
		}
	}
}
