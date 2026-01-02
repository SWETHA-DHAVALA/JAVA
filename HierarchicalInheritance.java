class Animal{
    void eat(){
        System.out.println(" ANimal can eat...");
    }
    void makeSound(){
        System.out.println(" Animal makes sound...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println(" Cat meows...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println(" Dog barks...");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();    
        a.makeSound();
        Cat c = new Cat();
        c.eat();
       c.meow();
        Dog d = new Dog();
        d.bark();
    }
}
