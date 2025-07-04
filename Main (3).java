import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner in=new Scanner(System.in);
	    boolean flag=true;
	    while(flag)
	    {
	        System.out.println("Enter 1 for login,Enter 2 for signin,Enter 3 for logout");
	        int x=in.nextInt();
	        System.out.println("Enter the number:");
	        switch(x)
	        {
	            case 1:
	                {
	                  System.out.println("Login");  
	                  break;
	                }
	            case 2:
	                {
	                  System.out.println("Signin");  
	                  break;
	                }  
	            case 3:
	                {
	                  System.out.println("Logout");  
	                  break;
	                }  
	        }     
	       System.out.println("Do you need to continue:(Y/N)");
	       char k=in.next().charAt(0);
	       if(k!='y')
	         {
	        flag=false;
	         }
	    }
	   }
	}