package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String secondName;
	private String department;
	private String password;
	private String companyName;
	
	public Email() {
		Scanner in = new Scanner(System.in);
		System.out.println("Your first name: ");
		firstName = in.next();
		System.out.println("Your last name");
		lastName = in.next();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Preaparing Email for: " + this.firstName + " " + this.lastName);
		
		this.department = SetDepartment();
		System.out.println("Departmen: " + this.department);
		
		System.out.println("How many numbers should the password have?: ");
		int length = in.nextInt();
		this.password = RandomPassGen(length);
		System.out.println("Your Password is created:" + this.password);
		
		this.companyName = "mindtor";
		String emailAdress = this.firstName + "." + this.lastName + "@" + this.department + "." + this.companyName + "." + "com";
		System.out.println("Email adress is created: " + emailAdress.toLowerCase());
	}
	
	
	
	private String SetDepartment() {
		System.out.println("DEPARTMENTS:\n1 for Marketing\n2 for HRn\n3 for Development\nEnter the department code: ");
		Scanner in = new Scanner(System.in);
		int depCode = in.nextInt();
		if (depCode == 1) { return "marketing";}
		else if (depCode == 2) { return "hr"; }
		else if (depCode == 3) { return "development"; }
		else {return "Enter a valid number.";}	
	}
	
	
	private String RandomPassGen(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int random = (int) (Math.random() * characters.length());
			password[i] = characters.charAt(random);
		}
		return new String(password);
	}
	
	

}
