class Parent {
    void display() {
        System.out.println("Parent display method");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("This is the child class  ") ;
    }
}
public class MethodOverloading {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.display();
        Parent p = new Parent();
        p.display();
    }
}
