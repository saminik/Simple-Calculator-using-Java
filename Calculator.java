import java.util.Scanner;

public class Calculator {
	public static boolean isBetween(int num, int lower, int upper)
	{
		return lower<=num && upper>=num;
	}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	int i;
	do {
	// System.out.println("Input"+sc.nextInt());
	System.out.println();
	System.out.println(" "+"Enter 1 for Addition\n Enter 2 for Subtraction\n Enter 3 for Multiplication\n Enter 4 for Division \n Enter 5 for Mod \n Enter 6 for Power\n Enter 7 for Square\n"+" "+"Enter 8 for Square Root"+" "+"\n Enter 9 for Stopping");
	System.out.println();
	System.out.println(" "+"Enter the Operation");
	 i=sc.nextInt();
	long a=0,b=0;
	if(isBetween(i, 1, 6))
	{
	System.out.println("Enter Number 1");
	a=sc.nextLong();
	System.out.println("Enter Number 2");
	b=sc.nextLong();
	}
	else if(i==7 || i==8)
	{
		System.out.println("Enter a Number");
		a=sc.nextLong();
	}
	else if(i==9)
	{
		System.out.println("Stopping..");
	}
	else
	{
		System.out.println("Invalid Option!");
	}
	
	long c;
	double d;
	switch(i) {
	case 1:
		c=a+b;
		System.out.println("Operation Addition:");
		System.out.println(a+"+"+b+"="+c);
		break;
	case 2:
		c=a-b;
		System.out.println("Operation Subtraction:");
		System.out.println(a+"-"+b+"="+c);
		break;
	case 3:
		c=a*b;
		System.out.println("Operation Multiplication:");
		System.out.println(a+"*"+b+"="+c);
		break;	
	case 4:
		d=a/b;
		System.out.println("Operation Division:");
		System.out.println(a+"/"+b+"="+d);
		break;
	case 5:
		c=a%b;
		System.out.println("Operation MOD:");
		System.out.println(a+"%"+b+"="+c);
		break;
	case 6:
		c=(long) Math.pow(a, b);
		System.out.println("Operation Power:");
		System.out.println(c);
		break;
	case 7:
		c=a*a;
		System.out.println("Operation Square :");
		System.out.println("Square is"+c);
		break;
	case 8:
		d=(long) Math.sqrt(a);
		System.out.println("Operation Square Root:");
		System.out.println("Square Root is"+d);
		break;	
	}
	}
	while(i!=9);
	System.out.println("Stopped!");
	sc.close();
}
}
