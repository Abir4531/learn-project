package mentoring2;

import java.util.Scanner;

public class UsingScanner {

	
	public static void main(String[] args) {			
	Scanner NameInput= new Scanner(System.in);
	
	System.out.println("Enter your name :");
	String name = NameInput.nextLine();
	System.out.println("Your name is :" +name);
	
	System.out.println("Enter your address :");
	String address =NameInput.nextLine();
	System.out.println("your address is :" +address);
	
	System.out.println("Enter your age :");
	int age= NameInput.nextInt();
	System.out.println("Your age is :" +age);
	
	
	System.out.println(name+" :" +address+ " : " +age);
	
	
	
}
} 