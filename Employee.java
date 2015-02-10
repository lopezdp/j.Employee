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
public class Employee {
    
    /** instance variables */
    private String name;
    private double salary;
    
    /** 
     * Constructs an employee object with a 
     * name and yearly salary
     */
    
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
    
    /**
     *  Returns name of employee
     *  @returns name of current employee
     */
    
    public String getName()
    {
        return name;  
    }
    
    /**
     *  Gets current salary of employee and returns it
     *  @returns current salary
     */
    public double getSalary()
    {
        return salary;
    }
 
    /**
     *  Raises the employee salary by a certain percent
     *  must be entered as a decimal
     *  @param byPercent
     */
    public void raiseSalary(double byPercent)
    {
        double newSalary;
        newSalary = salary;
        newSalary *= (1 + (byPercent / 100)); 
        salary = newSalary;
    }
    
}
