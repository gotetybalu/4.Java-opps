//Java Program to Demonstrate Classes, Objects, and Constructors in Employee Details Management
import java.util.*;

class employee
{
    String name;
    int empid;
    String role;
    
    employee(String Name,String role,int id)
    
    {
        this.name=Name;
        this.role=role;
        this.empid=id;
    }
    
    public void print_employe_data()
    {
        
        System.out.println("Employeeid"+" "+"Employee_name"+" "+"Employee role");
        System.out.println(empid+" "+name+" "+role);
        return;
    }
}

public class employee_details
{
	public static void main(String[] args) 
	
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter name:");
	    String name=sc.nextLine();
	    
	    System.out.print("Enter id");
	    int id=sc.nextInt();
	    sc.nextLine(); // Consume the leftover newline
	    
	    System.out.print("Enter role of employee:");
	    String role=sc.nextLine();
	    
	    
		employee e=new employee(name,role,id);
		e.print_employe_data();
	}
}

