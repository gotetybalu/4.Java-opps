/*       Hierarchical Inheritance in Java:
         1. Definition: Hierarchical inheritance is a type of inheritance in which multiple child classes inherit from a single parent class.
         2. Keyword: The extends keyword is used to achieve hierarchical inheritance in Java.
         3. Code Reusability: All child classes can reuse the accessible variables and methods of the parent class.
         4. Independent Features: Each child class can have its own variables and methods in addition to inherited members.
         5. Example: Bank → SavingsAccount and Bank → CurrentAccount. Java supports hierarchical inheritance using classes.    */

class Bank 
{
    String BankName="CanaraBank";
    String Branch="Mumbai";
    String IFSC="1234";
    
    void Bank_Details()
    {
        System.out.println("BankName:"+BankName+"\n Branch:"+Branch+"\n  IFSC"+IFSC+"\n");
    }
}
class saving_Account extends Bank
{
    String Name="Bala";
    long Account_Number=12345;
    double Balance=100000;
    void saving_Account_details()
    {
        System.out.println("saving_Account_details:");
        System.out.println("Account Holder Name"+Name+"\n Account number:"+Account_Number+"\n");
    }
}
class current_Account extends Bank
{
    String Name="Bala";
    long  Account_Number=98765;
    double Balance=100000;
    void current_Account_details()
    {
        System.out.println("current_Account_details:");
        System.out.println("Account Holder Name"+Name+"\n Account number:"+Account_Number);
    }
}
public class Main
{
	public static void main(String[] args) 
	{
		saving_Account s1=new saving_Account();
		s1.Bank_Details();
		s1.saving_Account_details();
		
		current_Account c1=new current_Account();
		c1.Bank_Details();
		c1.current_Account_details();
	}
}

