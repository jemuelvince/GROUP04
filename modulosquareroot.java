import java.util.*;
import java.lang.Math;
 public class modulosquareroot {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
	System.out.print("Input 'm' for modulo and 's' for square root");
	System.out.print("Input operation to be used: ");
	char operation = in.next().charAt(0);

	int result;


	switch(operation)
	{ 
		case 'm':
		System.out.print("Input the first number : ");
        	int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt();
		int divided = a / b;
		result = a - (divided * b);
		System.out.println(result); 
		break;
		
		case 's':
		System.out.print("Input a number : ");
        	int a = in.nextInt();  
		System.out.println(Math.sqrt(a)); 
		
		default:
                System.out.printf("Error! operation is not correct");
                return;
	}
	}
 }