/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int x=in.nextInt();
	    for(int i=1;i<=x;i++){
	        for( int space=1; space<=x-i;space++){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print(j); 
	        }
	        System.out.println( );
	    }
		
	}
}