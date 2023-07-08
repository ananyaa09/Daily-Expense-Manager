import java.util.Scanner;
class ExpenseManager
{
	public static void main(String [] args)
    {
		UserClass u1 = new UserClass(); 
		boolean quit = false;
        boolean quit2 = false;
        Expense e1 = new Expense();
	   do
       {
	       Boolean x = false;
    	   System.out.println("Press 1 if you are an existing user \nPress 2 if you are a new user\nPress 3 to QUIT");
    	   Scanner sc = new Scanner(System.in);
           Scanner obj = new Scanner(System.in);
            int n = obj.nextInt();
    	   switch(n)
            {
    	       case 1:
                {
    	           System.out.println("Enter your login credentials");
                   System.out.println("Username: ");
                    String u = sc.nextLine();
                    System.out.println("Password: ");
                    String p = sc.nextLine();
                    x = u1.Login(u,p);
                    if(x == true)
                    {
                        do
                        {
                        System.out.println();
                        System.out.println("\t----------MENU----------");
                        System.out.println("\tPress 1 to ADD to an expense");
                        System.out.println("\tPress 2 to UPDATE expense list");
                        System.out.println("\tPress 3 to DELETE any expense");
                        System.out.println("\tPress 4 to CALCULATE TOTAL expenses");
                        System.out.println("\tPress 5 to DISPLAY all expenses");
                        System.out.println("\tPress 6 to QUIT");
                        int m = sc.nextInt();
                        switch(m)
                        {
                            case 1: {
                                        
                                        e1.AddExpense(u);
                                    }
                            break;
                            case 2: {
                                        e1.Update(u);
                                    }
                            break;
                            case 3: {
                                        try
                                        {
                                            e1.DeleteExpense(u);
                                        }
                                        catch(MyException e)
                                        {
                                            e.printStackTrace();
                                        }
                                        
                                    }
                            break;
                            case 4: {
                                        
                                        e1.CalculateTotal(u);
                                    }
                            break;
                            case 5:{
                                        e1.Display(u);
                                    }
                            break;
                            case 6: quit2 = true;
                            break;
                        } 
                        }while(!quit2);  
                    }
                    else
                        System.out.println("Invalid username or password");
                }
    	       break;
    	       case 2:
               {
    	           System.out.println("Enter your login credentials");
                    u1.CreateID();
                }
                break;
                case 3:
                {
        	       quit = true;
                }
                break;
            }
        }
        while(!quit);
        System.out.println("\t -----------Thankyou for visiting-------------");  }
    }
