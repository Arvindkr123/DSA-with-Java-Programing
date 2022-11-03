class Member{
    String name;
    int age;
    int salary;
    String Address;

    public Member(String name, int age, int salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Address = address;
    }
    void printSalary(){
        System.out.print("Name of Employee "+this.name);
        System.out.println(" and  Employee Salary is "+this.salary);
    }
}



public class MemberExample {
    public static void main(String[] args) {
        Member member= new Member("Arvind",22,20000,"Surajpur tappa Bais");
        member.printSalary();
    }
}