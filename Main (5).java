import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int x = in.nextInt(); 
	    for(int i=0 ; i<=x ; i++){
	    for(int j=0 ; j<=x-i ; j++){
	        System.out.print("*" +" ");
	    }
		System.out.println();
	}
}
}