package esof322hw3;


/**
 *
 * @author Karl Molina, Dana Parker
 */
public class LinkedList {
    private Employee first, last;
    
    public LinkedList() {
        
    }
    
    public void add(Employee e) {
        
    }
}

class Employee {
    private String name, socialSecurity;
    private float salary;
    private Employee next;
    
    public Employee(String name, String socialSecurity, float salary) {
        this.name = name;
        this.socialSecurity = socialSecurity;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSocialSecurity() {
        return socialSecurity;
    }
    
    public float getSalary() {
        return salary;
    }
    
    public void setNext(Employee e) {
    	next = e;
    }
    
    public Employee getNext() {
    	return next;
    }
}