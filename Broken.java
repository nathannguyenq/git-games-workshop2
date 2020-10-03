import java.util.Scanner;

class Broken
{
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("What's your name: ");
		String name = stdin.nextLine();
		
		System.out.println("Welcome to Challenge 2, " + name + "!")
	}
}