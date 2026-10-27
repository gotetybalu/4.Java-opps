//Java Program to Demonstrate Classes, Objects, and Constructors in Employee Details Management
public class employee_details
{
	public static void main(String[] args) 
	{
		employee e=new employee("Bala","SDE",1);
		e.print_employe_data();
	}
}
class employee
{
    String name;
    int empid;
    String role;
    
    employee(String Name,String role,int id)
    
    {
        this.name=name;
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
