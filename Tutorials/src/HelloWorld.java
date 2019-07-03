import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println ("What is your name?"); 
		
		//Input and Output
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name + " :) ");
		
		//Variable and String
		String string = new String("This is a string"); //variable
		String easier = "Wow, that was easy!! " + string; //literal, same function as ln 14
		System.out.println(easier);

	}

}
