import java.util.*;
class goodturn
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int X = sc.nextInt();
    		int Y = sc.nextInt();
    		if(X+Y>6){
    		System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}
}
