import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String username;
		double age;
		String gender;
		String marital_status;
		int telephone_number;

		// Allows a person to enter his/her name
		Scanner one = new Scanner(System.in);
		System.out.print("Enter Name: ");
		username = one.next();
		System.out.println("Name accepted " + username);

		Scanner two = new Scanner(System.in);
		System.out.print("Enter Age: ");
		age = two.nextDouble();
		System.out.println("Age accepted " + age);

		Scanner three = new Scanner(System.in);
		System.out.print("Enter Gender: ");
		gender = three.next();
		System.out.println("Gender accepted " + gender);

		Scanner four = new Scanner(System.in);
		System.out.print("Enter Marital Status: ");
		marital_status = four.next();
		System.out.println("Marital Status accepted " + marital_status);

		Scanner five = new Scanner(System.in);
		System.out.print("Enter Telephone Number: ");
		telephone_number = five.nextInt();
		System.out.println("Telephone Number accepted " + telephone_number);

		System.out.println("\nName: " + username + "\nAge: " + age + "\nGender: " + gender + "\nMarital Status: "
				+ marital_status + "\nTelephone Number: " + telephone_number);

	}

}
