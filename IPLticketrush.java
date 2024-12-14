import java.util.*;
class IPLticketrush
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int N=sc.nextInt();
		    int M=sc.nextInt();
		    if(N<=M)
		    System.out.println(0);
		    else
		    System.out.println(N-M);
		}

	}
}
