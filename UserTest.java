import java.util.Scanner;
import java.io.*;
class UserTest{
	public static void main(String [] args){


		Scanner s = new Scanner(System.in);
		System.out.print("Enter Username : ");
		String un = s.nextLine();
		System.out.print("Enter Password : ");
		String pass = s.nextLine();

		User u = new User();
		boolean check = u.login(un,pass);
		if(check == false){
			System.out.println("You are not the registered user of Daily Expense App!! Please Register yourself to use the App");
			System.out.print("Enter Username: ");
			un = s.nextLine();
			System.out.print("Enter Password: ");
			pass = s.nextLine();
			new User(un,pass);
		}
		else{
			System.out.println("You are a registered user of Daily Expense App!! ");
			u.menu();
		}
	}


}