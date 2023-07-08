import java.io.*;
import java.util.Scanner;
class UserClass
{
	String username;
	String password;
UserClass()
{
	username = "NULL";
	password = "NULL";
}
void CreateID()
{
	File f = new File("UserPass.txt");
	Scanner sc = new Scanner(System.in);
	try
	{
		FileWriter fp = new FileWriter(f,true);
		BufferedWriter bout = new BufferedWriter(fp);
		System.out.println("Please enter your username: ");
		username = sc.nextLine();
		bout.write("\n"+username);
		System.out.println("Please enter password for your account: ");
		password = sc.nextLine();
		bout.write(" "+password);
		String u = username;
		String a = ".txt";
		String s = u.concat(a);
		File myObj = new File (s);
		{
			if(myObj.createNewFile())
				System.out.println("Expense file for the new user has been created Succesfully");
			else
				System.out.println("User already exists");
		}
		bout.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Exception Error");
	}
}

boolean Login(String u, String p)
{
	File f = new File("UserPass.txt");
	Scanner sc = new Scanner(System.in);
	try
	{
		FileReader fin = new FileReader(f);
		BufferedReader bin = new BufferedReader(fin);
		String sr = null;
		while((sr=bin.readLine())!=null)
		{
			String tokens[] = sr.split(" ");
			if((tokens[0].equals(u)) && (tokens[1].equals(p)))
				return true;
		}
		bin.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return false;
}
String ReturnUsername()
{
	return this.username;
}
}