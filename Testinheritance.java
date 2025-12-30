 class inheritanceexa {
    void eat()
    {
        System.out.println("ANimal can eating");
    }
    void makesound()
    {
        System.out.println("Animal makes sound");
    }
}
class Dog extends inheritanceexa
{
    void bark()
    {
        System.out.println("Dog barks");
    }
}
public class Testinheritance {
    public static void main(String args[])
    {
        Dog d = new Dog();
        inheritanceexa a = new inheritanceexa();
        a.eat();
        d.bark();
        d.eat();
        d.makesound();
    }
}
