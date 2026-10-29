/* 
1. Definition: Multilevel inheritance is a type of inheritance in which a class inherits from another derived class.
2. Keyword: The extends keyword is used to achieve multilevel inheritance in Java.
3. Example: Bank → SavingsAccount → PremiumSavingsAccount.
4. Code Reusability: The last child class can access its own and inherited accessible methods and variables from parent and grandparent classes.
5. Object Creation: We can create an object of the last child class to access accessible members throughout the inheritance chain. 
*/


class Bank 
{
    String Bank="CanaraBank";
    String Branch="Mumbai";
    String IFSC="CNRB0001589";
    void display_Bank_details()
    {
        System.out.println("Bank Name:"+Bank+"\n Branch:"+Branch+"\n IFSC code:"+IFSC);
        
    }
}
class savings_account  extends Bank
{
    String Name="Balu";
    int acno=12345678;
    double Balance=100000;
    void display_account_details()
    {
        System.out.println("\n Name:"+Name+"\n acno:"+acno+"\n Balance:"+Balance);
    }
    
}

class premimum_savings extends savings_account
{
    double interest=0.5;
    void calculate_interest()
    {
        double total=((Balance*1*interest)/100)+Balance;
        System.out.println("\n total interest is:"+total);
        
    }
    
}
public class Main
{
	public static void main(String[] args) 
	{
	    premimum_savings p=new premimum_savings();
	    p.display_Bank_details();
	    p.display_account_details();
	    p.calculate_interest();
	}
}
