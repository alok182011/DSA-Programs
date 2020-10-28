import java.util.*;
class calculator
{
	static public void main(String args[])
	{
		int a,b,d;
		String c,s;
		Scanner z=new Scanner(System.in);
		do{
			System.out.print("enter first number:");
			a=z.nextInt();
			System.out.print("enter second number:");
			b=z.nextInt();
			System.out.print("enter symbol(+,-,*,/):");
			c=z.next();
			switch(c)
			{
				case "+":
					d=a+b;
					System.out.print(d);
					break;
				case "-":
					d=a-b;
					System.out.print(d);
					break;
				case "*":
					d=a*b;
					System.out.print(d);
					break;
				case "/":
					d=a/b;
					System.out.print(d);
					break;
				default:
					System.out.print("wrong choice!");
					break;
			}
			System.out.print("\ndo u want to continue?press y to continue!!");
			s=z.next();
		}while(s.equals("y"));
	}
}
