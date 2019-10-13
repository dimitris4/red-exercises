import java.util.*;
import java.io.*;

public class Employee { //declare a class

    private String name;
    private String cpr;
    private int hours;
    private int salary;
    private int vacation;
    
    public Employee() {} //constructor 1

    public Employee(String name, String cpr, int hours, int salary, int vacation) { // constructor 2
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;
        this.salary = salary;
        this.vacation = vacation;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }
 
    //to string method
    public String toString() {
        return name + "\t\t" +
               cpr + "\t\t" +
               hours + "\t\t" +
               salary + "\t\t" +
               vacation;   
    }
}
