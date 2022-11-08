import java.util.Arrays;
import java.util.Scanner;

public class SortTheObject {
    public static void main(String[] args) {
        Emp [] arr = new Emp[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = new Emp();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].setDetails();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Employee name is "+arr[i].getName());
            System.out.println(" and Employee salary is "+arr[i].getSalary());
        }
        System.out.println("--------------------------------------------------------");
        // sort using salary
        sort_employee(arr);
        // sort the using name
        sort_employeeUsingName(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Employee name is "+arr[i].getName());
            System.out.println(" and Employee salary is "+arr[i].getSalary());
        }

    }

    private static void sort_employeeUsingName(Emp []arr) {
        Emp temp = new Emp();
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j].name.compareTo(arr[j+1].name)>0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void sort_employee(Emp[] arr) {
        Emp temp = new Emp();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j].salary<arr[j+1].salary){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }
}

class Emp{
    public String name;
    public int salary;

    public void setDetails(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name ");
        this.name = scn.nextLine();
        System.out.println("Enter your salary is ");
        this.salary = scn.nextInt();
    }

    public int getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }
}