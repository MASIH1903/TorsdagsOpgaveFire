import java.util.Scanner;

public class MainScanner{
	
	public static void main(String[] args){

		String  name;
		int age;
		int retirement = 67;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please type your name");
		name = scan.nextLine();

		scan.nextLine();

		System.out.println("Hi " + name + ", please type your age");
		age = scan.nextInt();

		System.out.println(age);


		if(age > retirement || age < 0){

			System.out.println("Invalid");


		}
		else{

			System.out.println("You have" + retirement - age + "left");
		}










	}
}