class Student{
    int roll_no;
    String name;
    String branch;
    void can_write()
    {
        System.out.println("A student can write");
    }
    void can_read()
    {
        System.out.println("A student can read");
    }
    void display()
    {
        System.out.println("ROll no:"+roll_no+" "+"Name:"+name+" "+"Branch"+branch);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name="Swetha";
        s1.branch="Aiml";
        s1.roll_no=87;
        s2.name = "jaan";
        s1.can_read();
        s1.display();
    }
}
