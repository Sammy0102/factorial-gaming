import java.util.Scanner;

class main
{
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		System.out.println(factorial(new Scanner(System.in).nextInt()));
	}	

	public static int factorial(int n) {
		if(n == 1)
			return n;
		return n * factorial(n-1);
	}
}
