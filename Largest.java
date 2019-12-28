import java.util.Scanner;



public class Largest{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter 3 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b && a==c)
			System.out.println("All values are equal");
		else if(a>b && a>c)
			System.out.println(a+ " is largest");
		else
		if(b>c && b>a)
			System.out.println(b+ " is largest");
		else
			System.out.println(c+ " is largest");
	}

}
