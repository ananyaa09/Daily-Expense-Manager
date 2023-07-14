# Daily-Expense-Manager
Java project on Daily Expense Manager

CalculateExpense.java: 
This file contains the logic for calculating expenses. It includes the method for calculating total expenses of the user.

DriverClass.java: 
This file contains the main method and is responsible for interacting with the user.

Expense.java: 
This file defines the Expense class which contains three main methods - 
1. AddExpense(): This method is to add an expense to the Expense list.
2. UpdateExpense(): This method is to update the expense list - you can either add or delete an expense.
3. DeleteExpense(): This method is to delete an expense from the Expense list.
4. CalculateTotal(): This method is to calculate the total expenses of the user.
5. Display(): This method is to display all the expenses of the user.

ExpenseManager.java: 
This file contains the ExpenseManager class, which gives you three choices out of which you have to choose one. It asks you:
1. If you are an existing user - You have to first login using your credentials then you will be displayed with a menu out of which you will have to choose one. The choices include:
   1. Add an expense.
   2. Update expenses.
   3. Delete an expense.
   4. Calculate the total expenses.
   5. Display the Expense list.
   6. Quit
3. If you are a new user - You will have to create a new id by entering a new username and password.
4. If you wish to quit - By choosing quit, you will be displayed with a message "Thank you for visiting!" and you will exit the program.

MyException.java: 
This file defines a custom exception class, MyException, which is used to handle all the exceptions or errors specific to the expense management system.
User.java: 
This file defines the User class, which represents an individual user of the expense management system. It includes username and password of each user. It is responsible for updating the login file and creating a new expense file for new user.

UserClass.java: 
This file contains the UserClass class, which provides functionalities for managing user-related operations, such as creating a new id and login. It contains two methods - one is to create a new id wherein you have to enter new username and password so as to create a new expense file, the other is to login to an existing account wherein the user has to enter the username and password already set by him.

UserTest.java: 
This file contains the unit tests for the UserClass. It is the testing class where the main purpose is to check that the UserClass is working correctly and producing the expected results or not.

These Java files work together to create a Daily Expense Manager System in Java, allowing users to manage their expenses by creating an expense list under their name.
