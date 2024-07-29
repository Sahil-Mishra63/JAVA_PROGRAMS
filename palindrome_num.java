import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
	    int og = num;
	    int rev = 0;
	    while(num != 0){
	        int digit = num % 10;
	        rev = rev * 10 + digit;
	        num = num / 10;
	    }
	    
	    if(rev == og){
	        System.out.println("The number is palindrome");
	    }
	    else{
	        System.out.println("The number is not palindrome");
	    }
	}
}
