import java.io.*;
class User{
	
	String username;
	String password;

	User(){
	}

	User(String username,String password){
		this.username = username;
		this.password = password;
		newUser();
		
	}
	void newUser(){
		//Update login file and create a new expense file
		try{
			File loginf = new File("LoginFile\\loginfile.txt");	
			FileWriter fw = new FileWriter(loginf,true);
			BufferedWriter bw = new BufferedWriter(fw);
			String s = this.username +","+ this.password;
			System.out.println(s);
			bw.write(s);
			bw.newLine();
			System.out.println("Login file updated sucessfully!");
			String ufilename = "UserExpenseFiles\\"+username+".txt";
			File f = new File(ufilename);
			f.createNewFile();
			System.out.println("Expense file for user "+ this.username+" created sucessfully!");
			bw.close();
		}
		catch(Exception e){
			//System.out.println("Some Error2");
			e.printStackTrace();
		}	


	}

	boolean login(String username,String password){
	try{

		File f = new File("LoginFile\\loginfile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bin= new BufferedReader(fr);
		String sr = null;
		while((sr=bin.readLine())!=null){
		   String tokens[] = sr.split(",");
		   //System.out.println(tokens[0]);
		   //System.out.println(tokens[1]);
           if(tokens[0].equals(username) && tokens[1].equals(password))
           	return true;
			} 
		 bin.close();
		}
	catch(Exception e){
		System.out.println("Error");
	}

	return false;
	}

	void menu(){
		System.out.println("please select an operation from the menu");
	}

}