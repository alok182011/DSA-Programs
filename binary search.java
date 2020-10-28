import java.util.*;
class binarysearch
{
	public static void binary(int arr[],int size,int x)
	{
		int start=0;
		int end=size-1;
        while(start<=end)
        {
		int mid=(start+end)/2;
		if(arr[mid]==x)
		{
			System.out.print("found! at position:"+mid);
			break;
		}
		else if(x<arr[mid])
		{
			end=mid-1;
		}
		else if(x>arr[mid])
		{
			start=mid+1;
		}
	}
}
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		int arr[]={2,6,13,21,36,47,63,81,97};
		int size=arr.length;
		int x=a.nextInt();
		binary(arr,size,x);
	}
}
