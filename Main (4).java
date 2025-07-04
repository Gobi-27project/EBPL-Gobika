import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner in=new Scanner(System.in);
	    int k=in.nextInt();
	    System.out.println();
	    int  fact=1;
	    while(k>1)
	    {
	        fact=fact*k;k--;
	        System.out.println(fact);
	    }
	}
}