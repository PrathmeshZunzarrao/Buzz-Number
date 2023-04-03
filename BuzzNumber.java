import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		if (num == 0)
		{
			System.out.println("Invalid");
		}
		else
		{
			if (num % 10 == 7 || num % 7 == 0)
			{
				System.out.println("It is Buzz Number");
			}
			else
			{
				System.out.println("It is not a Buzz Number");
			}
		}
	}
}
