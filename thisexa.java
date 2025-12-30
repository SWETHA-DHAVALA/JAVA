public class thisexa {
    int id;
    String name ;
    int age;    
    String branch;
    String phne;
    thisexa()
    {
        System.out.println("Default Constructor");
    }   
    thisexa(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    thisexa(int id , String name , int age)
    {
        this(id,name); // calling constructor
        this.age = age;
    }
    thisexa(int id , String name , int age , String branch)
    {
        this(id,name,age); // calling constructor
        this.branch = branch;
    }
    thisexa(int id , String name , int age , String branch , String phne)
    {
        this(id,name,age,branch); // calling constructor
        this.phne = phne;
    }
    void display()
    {
        System.out.println("Id: "+id+" name :"+ name +" age :"+age+" branch :"+branch+" phone :"+phne);
    }
    public static void main(String args[])
    {
        thisexa obj1= new thisexa();
        thisexa obj2 = new thisexa(21, "Swetha");
        thisexa obj3 = new thisexa(22, "Anusha", 22);
        thisexa obj4 = new thisexa(23, "Kavya", 21, "CSE");
        thisexa obj5 = new thisexa(24, "Siri", 20, "ECE", "9876543210");
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
        obj5.display();
    }
}
