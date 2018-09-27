
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int nu=1,de=1,de1=1;
		for(int i=1;i<=n;i++)
		nu=nu*i;
		for(int i=1;i<=k;i++)
		de=de*i;
		for(int i=1;i<=n-k;i++)
		de1=de1*i;
		System.out.print(nu/(de*de1));
		
	}
}
