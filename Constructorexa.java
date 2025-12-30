public class Constructorexa {
    int id;
    String name ;
    int age;
    Constructorexa()
    {
        System.out.println("Default Constructor");
    }
    Constructorexa(int a , String s)
    {
        id = a;
        name = s;
    }
    void display()
    {
        System.out.println("Id: "+id+" name :"+ name +" age :"+age);
    }

public static void main(String args[])
{
    // constructorexa obj = new constructorexa();
    Constructorexa obj1 = new Constructorexa(10,"swetha");
    // obj.display();
    obj1.display();
}
}

