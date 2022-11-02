public class Employee1 {
    private String name;
    private int yearOfJoining;
    private String address;

    public Employee1(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }
    public void showDetails(){
        System.out.println("    "+this.name+"    "+this.yearOfJoining+"    "+"   "+this.address);
    }

    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("Robert",1994, "         64C- WallsStreat");
        Employee1 employee2 = new Employee1("Sam   ",2000, "         68D- WallsStreat");
        Employee1 employee3 = new Employee1("John  ",1999, "         26B- WallsStreat");
        System.out.println("    Name"+"    "+" Year of Joining "+"    "+"Address");
        employee1.showDetails();
        employee2.showDetails();
        employee3.showDetails();



    }
}