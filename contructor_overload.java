public class contructor_overload {
    int id;
    String name;
    int age;
    contructor_overload()
    {
        System.out.println("Default Constructor");
    }
    contructor_overload(int a , String s)
    {
        id = a;
        name = s;
    }
    contructor_overload(int a , String s , int b)
    {
        id = a;
        name = s;
        age = b;
    }
    void display()
    {
        System.out.println("Id: "+id+" name :"+ name +" age :"+age);
    }
    public static void main(String args[])
    {
        // contructor_overload obj = new contructor_overload(); constructor_overload obj = new contructor_overload();
        contructor_overload obj1 = new contructor_overload(10,"swetha");
        contructor_overload obj2 = new contructor_overload(20,"anusha",22);
     
        obj1.display();
        obj2.display();
    }
}
