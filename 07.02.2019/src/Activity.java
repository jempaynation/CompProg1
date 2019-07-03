import java.util.Scanner;

public class Activity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String name;
		Long USN;

		System.out.println("AMA University");

		Scanner one = new Scanner(System.in);
		System.out.print("Input Name: ");
		name = one.nextLine();

		Scanner two = new Scanner(System.in);
		System.out.print("Input Student Number: ");
		USN = two.nextLong();

		System.out.println("My name is " + name + " with student # " + USN);

	}

}
