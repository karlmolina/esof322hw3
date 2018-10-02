package esof322hw3;


/**
 *  ESOF 322 HW 3
 * @author Karl Molina, Dana Parker
 */
public class LinkedList {
    private Employee first;
    
    /**
     * Adds an employee to the linked list
     * @param e employee to add
     */
    public void add(Employee e) {
        if (first == null) {
            first = e;
        } else {
            e.setNext(first);
            first = e;
        }
    }
    
    /**
     * Gets the first employee in the linked list
     * @return 
     */
    public Employee getFirst() {
        return first;
    }
}

class Employee {
    private String name, socialSecurity;
    private float salary;
    private Employee next;
    
    /**
     * Employee constructor
     * @param name name of employee
     * @param socialSecurity employee's social security number
     * @param salary employee's salary
     */
    public Employee(String name, String socialSecurity, float salary) {
        this.name = name;
        this.socialSecurity = socialSecurity;
        this.salary = salary;
    }
    
    /**
     * Gets the name of the employee
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the social security number of the employee
     * @return 
     */
    public String getSocialSecurity() {
        return socialSecurity;
    }
    
    /**
     * Gets the salary of the employee
     * @return 
     */
    public float getSalary() {
        return salary;
    }
    
    /**
     * Sets the next employee for the linked list
     * @param e 
     */
    public void setNext(Employee e) {
    	next = e;
    }
    
    /**
     * Gets the next employee
     * @return 
     */
    public Employee getNext() {
    	return next;
    }
}