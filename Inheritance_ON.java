public class Inheritance_ON {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c = new Child();
        Parent c1 = new Child();
        p1.print();
        c.print();
        c1.print();

    }
}

class Parent{
    void print(){
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent{
    void print(){
        System.out.println("This is the Child class");
    }
}
