import java.util.*;
class factorial
{
	static public void main(String args[])
	{
		int pr=1,i;
		Scanner a=new Scanner(System.in);
		System.out.print("enter a number:");
		int b=a.nextInt();
		for(i=1;i<=b;i++)
		{
			pr=pr*i;
		}
		System.out.print(pr);
	}
}
