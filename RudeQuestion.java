import java.util.Scanner;

public class RudeQuestion {
	public static void main( String[] args ){
		String name;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);
		System.out.print( "Hello, what is your real name?" );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you?" );
		age = keyboard.nextInt();

		System.out.println( "So, you're " + age + " eh? That's not very old." );
		System.out.print( "So, how much do you weigh? " );
		weight = keyboard.nextInt();

		System.out.println( "So your name is " + name + "you are " + age + " years old, and you weight " + weight + " pounds." );

	}
}