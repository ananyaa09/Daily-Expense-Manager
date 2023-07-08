import java.io.*;
import java.util.Scanner;
class Expense
{
	String Item_name;
	String Item_cost;
	String date;

Expense()
{
	Item_name = "Null";
	Item_cost = "0.0";
	date = "00.00.00";
}
void AddExpense(String a)
{
	String ab = ".txt";
	String abc = a.concat(ab);
	File f = new File(abc);
	
	try
	{
		FileWriter fout = new FileWriter(f,true);
		BufferedWriter bout = new BufferedWriter(fout);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the date: ");
		date = sc.nextLine();
		//bout.write(date);
		System.out.println("Please enter the product name:");
		Item_name = sc.nextLine();
		//bout.write(" "+Item_name);
		System.out.println("Please enter the cost of item: ");
		Item_cost = sc.nextLine();
		//String s = Item_cost.toString();
		bout.write(date+" "+Item_name+" "+Item_cost);
		bout.newLine();
		bout.close();
		System.out.println("-------------Expense has been added successfully-------------");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();

	}
	
}
void Update(String g)
{
	System.out.println("1. Add an expense \n2. Delete an expense");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	switch(n)
	{
		case 1: AddExpense(g);
		break;
		case 2: {
					try
					{
						DeleteExpense(g);
					}
					catch(MyException e)
					{
						e.printStackTrace();
					}
				}
		break;
	}
}

void DeleteExpense(String b) throws MyException
{
	int counter = 1;
	Scanner sc = new Scanner(System.in);
	String ab = ".txt";
	String abc = b.concat(ab);
	File f1 = new File(abc);
	File f2 = new File("Temp.txt");
	System.out.println(abc);
	boolean check = false;
	int count = 0;
	System.out.println("Please enter the name of the expense to be deleted: ");
	String del = sc.nextLine();
	try
	{
		FileReader f5 = new FileReader(f1);
		BufferedReader b2 = new BufferedReader(f5);

		String sr = null;
		while((sr = b2.readLine())!=null)
		{
				count++;
				System.out.println(count);
				String tokens[] = sr.split(" ");
				if(tokens[1].equals(del))
				{
					check = true;
					break;
				}
		}
		if(check == false)
		{
			throw new MyException("Expense could not be found in your record");	
		}
		b2.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.err.println("Error in first try block of delete");
	}
	if(check==true)
	{
	try
	{
		FileReader fin = new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);
		FileWriter fout = new FileWriter(f2);
		BufferedWriter bout = new BufferedWriter(fout);
		int line = 0;
		String sy = null;
		while((sy = bin.readLine())!=null)
		{
			
			line++;
			System.out.println("Line"+line);
			System.out.println("Count"+count);
			if(line != count)
			{
				bout.write(sy);
				bout.newLine();

			}
			else
			{
				System.out.println("Are you sure you want to delete the expense "+del+" ?");
				System.out.println("1. Yes \n2. No");
				int n = sc.nextInt();
				if(n==2)
				{
					bout.write(sy);
					bout.newLine();
					System.out.println("The expense has not been deleted");
				}
				else
					System.out.println("Expense deleted");
			}
			bout.flush();
		}
		bin.close();
		bout.close();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.err.println("Error while deleteing an expense");
	}	
		//boolean success = false;
		boolean success = f1.delete(); 
		if(success == false)
			System.out.println("Error while deleting the original file");
		else
		{
			//boolean delsuccess = false;
			boolean delsuccess = f2.renameTo(f1);
			if(delsuccess == true )
				System.out.println("File modification successfull");
			else
				System.out.println("Error while renaming the file user");	
		}
	}
	
}
void CalculateTotal(String c)
{
	int sum=0;
	//int count = 0;
	String ab = ".txt";
	String abc = c.concat(ab);
	File f = new File(abc);

	try
	{
		FileReader fin = new FileReader(f);
		BufferedReader bin = new BufferedReader(fin);
		String sc;
		while((sc=bin.readLine())!=null)
		{
			//count++;
			//if(count>=2)
			//{
				String tokens[] = sc.split(" ");
				String a = tokens[2];
				int d = Integer.parseInt(a);
				sum = sum + d;
			//}
			
		}
		bin.close();
		System.out.println("Todays total expense is: "+sum);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Error");
	}
} 
void Display(String d)
{
	String ab = ".txt";
	String abc = d.concat(ab);
	File f = new File(abc);
	try
	{
		FileReader fin = new FileReader(f);
		BufferedReader bin = new BufferedReader(fin);
		String sr = null;
		while((sr=bin.readLine())!=null)
		{
			System.out.println("\t"+sr);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Error in display function");
	}
}
	
}