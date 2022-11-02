public class Example {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.getInfo(400, 7);
        obj.AddSal();
        obj.AddWork();
    }
}

class Employee {
    private int salary;
    private int hours_per_day;

    void getInfo(int salary, int hours_per_day) {
        this.salary = salary;
        this.hours_per_day = hours_per_day;
    }

    void AddSal() {
        if (this.salary < 500)
            this.salary += 10;
    }

    void AddWork() {
        if (this.hours_per_day > 6) {
            this.salary += 5;
        }
        System.out.println("Employee final salary "+this.salary);
    }
}