import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int number = n;
		sc.close();
		int sum = 0, a = 0;
		while(n>0)
		{
			a = n % 10;
			n = n / 10;
			sum += a * a * a;
		}
		if(number == sum)
			System.out.println("The number " + number + " is an Armstrong number.");
		else
			System.out.println("The number " + number + " is not an Armstrong number.");
	}
}
