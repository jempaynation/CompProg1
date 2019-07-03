import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		String name;
		int age;
		int grade;
		char fgrade = 'F';
		
		Scanner Name = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = Name.nextLine();
		
		Scanner Age = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = Age.nextInt();
		
		Scanner Grade = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		grade = Grade.nextInt();
		
		//Final Grade
		if (grade<=100 && grade>=95) {
			fgrade = 'A';
		}else if (grade>=90 && grade<=94) {
			fgrade = 'B';
		}else if (grade>=85 && grade<=89) {
			fgrade = 'C';	
		}else {
			System.out.println("Failed");
		}
		
		//Output
		if (age==18 && fgrade=='A') {
			System.out.println("Name: " + name + "\nAge: " + age + "\nGrade: " + fgrade);
		}else {
			System.out.println(name + " age " + age + " has a grade of " + fgrade);
		}		
	}
}
