import java.io.*;
import java.util.Scanner;
class CalculateExpense1
{
	String Item_name;
	String Item_cost;
	String date;

CalculateExpense1()
{
	Item_name = "Null";
	Item_cost = "0.0";
	date = "00.00.00";
}
void CalculateTotal()
{
	//int count = 0;
	double sum=0;
	File f = new File("User.txt");

	try
	{
		/*FileReader fin = new FileReader(f);
		BufferedReader bin = new BufferedReader(fin);
		String sr = null;
		while((sr = bin.readLine())!=null)
		{
				count++;
		}
		String[] a;
		int i = 0;
		String[] pr = null;
		while(i<=count)
		{
			pr[i]=bin.readLine();
			String tokens[] = pr[i].split(" ");
			a[i] = tokens[2];
			Double d = Double.parseDouble(a[i]);
			sum = sum + d;
		}
		bin.close();
		System.out.println("The sum of all expenses of the day is : "+sum);*/
		FileReader fin = new FileReader(f);
		BufferedReader bin = new BufferedReader(fin);
		String sc;
		while((sc=bin.readLine())!=null)
		{
			String tokens[] = sc.split(" ");
			String a = tokens[1];
			Double d = Double.parseDouble(a);
			sum = sum + d;
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
	
}

class CalculateExpense
{
	public static void main(String[] args)
	{
		CalculateExpense1 c1 = new CalculateExpense1();
		c1.CalculateTotal();
	}
}