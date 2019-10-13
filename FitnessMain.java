import java.util.*;
import java.io.*;

public class FitnessMain {
   public static void main(String[] args) throws FileNotFoundException {
      int LINE_SEPARATOR = 75;
      intro();
      promptEnterKey();
      System.out.println();
      System.out.println();
      System.out.println("To begin with, add some employees and members of your Fitness center.");
      System.out.println("How many employees do you want to enter?");
      Scanner console = new Scanner(System.in);
      int n = console.nextInt();
      Employee[] array = new Employee[n];
      for (int i = 0; i < n; i++) {      
         Employee employee = new Employee();
         userSetAttributes(employee);
         array[i] = employee;
      }
      
      //print Employees in the file
      PrintStream output = new PrintStream(new File("fitness.txt"));
      output.println("FITNESS EMPLOYEES");
      output.println();
      output.println("Name\t\tCpr\t\tHours\t\tSalary\t\tVacation");
      for (int i = 1; i<=LINE_SEPARATOR; i++) {
         output.print("*");
      }
      output.println();
      for (int i = 0; i < n; i++) {
         output.println(array[i]); 
      }
      output.println();
      for (int i = 1; i<=LINE_SEPARATOR; i++) {
         output.print("=");
      }
      
      //create members
      System.out.println();
      System.out.println();
      System.out.println("How many members do you want to enter?");
      int k = console.nextInt();
      Member[] array1 = new Member[k];
      for (int i = 0; i < k; i++) {      
         Member member = new Member();
         userSetAttributes(member);
         array1[i] = member;
      }
      
      menu();
      String x = console.next();
      while (!x.equals("0")) {
         if (x.equals("3")) {
            deleteMember(array1);
         } else if (x.equals("1")) {
            for (int i = 1; i<=3; i++) {
               System.out.println();
            }
            System.out.println("FITNESS MEMBERS");
            System.out.println();
            System.out.println("Name\t\tCpr\t\tMemberType\tFee");
            for (int i = 1; i<=LINE_SEPARATOR; i++) {
               System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < k; i++) {
                  System.out.println(array1[i]); 
            }
            System.out.println();
            for (int i = 1; i<=LINE_SEPARATOR; i++) {
               System.out.print("=");
            }
            System.out.println();
            System.out.println("Press \"ENTER\" to go back to MENU");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
          } else if (x.equals("2")) {
            searchMember(array1);
            System.out.println();
            System.out.println("Press \"ENTER\" to go back to MENU");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
         }
         menu();
         x = console.next();
         }
    
         
     //print Members in the file
     for (int i = 1; i<=3; i++) {
         output.println();
     }
      output.println("FITNESS MEMBERS");
      output.println();
      output.println("Name\t\tCpr\t\tMemberType\tFee");
      for (int i = 1; i<=LINE_SEPARATOR; i++) {
         output.print("*");
      }
      output.println();
      for (int i = 0; i < n; i++) {
         output.println(array1[i]); 
      }
      output.println();
      for (int i = 1; i<=LINE_SEPARATOR; i++) {
         output.print("=");
      }
      
      // print employees + members together
      for (int i = 1; i<=3; i++) {
         output.println();
      }
      output.println("EMPLOYEES & MEMBERS Name and Cpr");
      output.println();
      output.println("Name\t\tCpr");
      for (int i = 1; i<=LINE_SEPARATOR; i++) {
         output.print("*");
      }
      output.println();
      for (int i = 0; i < n; i++) {
         Employee employee = array[i];
         output.println(employee.getName() + "\t\t" + employee.getCpr()); 
      }
      for (int i = 0; i < n; i++) {
         Member member = array1[i];
         output.println(member.getName() + "\t\t" + member.getCpr()); 
      }
      output.println();
      for (int i = 1; i<=LINE_SEPARATOR; i++) {
         output.print("=");
      }  
      closingdown();
   } // end of main method
   
   
   public static void userSetAttributes(Employee employee) {
         Scanner console = new Scanner(System.in);
         System.out.println();
         System.out.println("Enter details about the next employee: ");
         System.out.println("Name: ");
         employee.setName(console.next());
         System.out.println("Cpr (XXXXXX-XXXX): ");
         employee.setCpr(console.next());
         System.out.println("Hours: ");
         employee.setHours(console.nextInt());
         System.out.println("Salary: ");
         employee.setSalary(console.nextInt());
         System.out.println("Vacation days: ");
         employee.setSalary(console.nextInt());
       }
   
   public static void userSetAttributes(Member member) {
         Scanner console = new Scanner(System.in);
         System.out.println();
         System.out.println("Enter details about the next member: ");
         System.out.println("Name: ");
         member.setName(console.next());
         System.out.println("Cpr (XXXXXX-XXXX): ");
         member.setCpr(console.next());
         System.out.println("Member Type ('Basic' or 'Full'): ");
         member.setMemberType(console.next());
         System.out.println("Monthly Fee: ");
         member.setFee(console.nextInt());
   }

   public static void processLine(String line) {
         Scanner data = new Scanner(line);
         String name = data.next();
         String cpr = data.next();
         int hours = data.nextInt();
         int salary = data.nextInt();        
         }      
   
   public static void deleteMember(Member[] array) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter name of the member to be deleted : ");
        String elem = console.next();
        for (int i = 0; i < array.length; i++) {
            String str = array[i].getName();
            if (elem.equals(str)){
                // shifting elements
                for (int j = i; j < array.length - 1; j++){
                    array[j] = array[j+1];
                }
                System.out.println(str + " has been deleted.");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException ie) {
                   Thread.currentThread().interrupt();
               }
                break;
            }
        }
    }
    
    public static void menu() {
         System.out.println();
         for (int i = 0; i<=45; i++) {
            System.out.print("*");
         }
         System.out.println();
         System.out.println();
         System.out.println("MENU");
         System.out.println();
         System.out.println("Enter 1 to view member list");
         System.out.println("Enter 2 to search for a member");
         System.out.println("Enter 3 to delete a member");
         System.out.println("Enter 0 to exit");
    }
    
    public static void intro() {
      System.out.println("Hi Faisal,");
      System.out.println();
      System.out.println("I'm Dimitrios and this is my Fitness program. Welcome!!!");
      System.out.println(" :)  :)  :)  :)  :)  :)  :)  :)  :)  :)  :)  :)  :)  :)");
    } 
    
   public static void promptEnterKey(){
      System.out.println();
      System.out.println("Ready?? \"ENTER\" to continue...");
      Scanner scanner = new Scanner(System.in);
      scanner.nextLine();
   }
   
   public static void searchMember(Member[] array) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter name of the member : ");
        String elem = console.next();
        for (int i = 0; i < array.length; i++) {
            String str = array[i].getName();
            if (elem.equals(str)){
               System.out.println();
               System.out.println("Name\t\tCpr\t\tMemberType\tFee");
               System.out.println(array[i]);
            }
        }
    }
    
    public static void closingdown() {
      System.out.println("The file 'fitness.txt' has been generated.");

      try {
         Thread.sleep(1000);
      } catch (InterruptedException ie) {
         Thread.currentThread().interrupt();
      }
    }
   
}





