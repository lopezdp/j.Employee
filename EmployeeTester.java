/**
 * David P. Lopez
 * COP2800
 * Programming Test Application
 */
package test;
/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class EmployeeTester {
    
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Karel The Robot", 250000);
        
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Starting Salary: " + employee1.getSalary());
        
        employee1.raiseSalary(10); //Karel the Robot gets a 10% raise!!!
        
        System.out.println("Ending Salary:   " + employee1.getSalary());
     
    }
    
    
}
