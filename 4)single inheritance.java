/*
   Single inheritance is a type of inheritance in which one child class inherits from one parent class.
   In Java, we use the extends keyword to achieve single inheritance.
   The child class can access the accessible properties and methods of the parent class and define its own methods.
   Example: class SavingsAccount extends BankAccount — SavingsAccount inherits from BankAccount.
*/
class Account_details
{
    String name="Balu";
    double amount=100000;
    String Actype="savings";
     double interest=0.4;
    void display_details()
    {
        System.out.println("Account details");
        System.out.println("Ac name:"+name);
        System.out.println("Amount:"+amount);
        System.out.println("Ac type:"+Actype);
        
    }
}
class savings extends Account_details
{
   
    void display_interest()
    {
        interest=(amount*1*interest)/100;
        System.out.println("total interest amount per is:"+interest);
    }
    
}
class Main
{
    public static void main (String[] args) 
    {
        savings c1=new savings();
        
        c1.display_details();
        c1.display_interest();
    }
}
