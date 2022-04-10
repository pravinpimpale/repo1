import java.util.Scanner;
public class Api
{
    public static void main(String[] args) 
    {
     
	Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int [n1];
		int b[]=new int [n2];
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
			c[i]=a[i];
		for(int i=0;i<b.length;i++)
			c[i+a.length]=b[i];
		for(int i=0;i<c.length;i++)
		System.out.println(c[i]);
	}
}