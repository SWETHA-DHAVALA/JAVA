class Person
{
    String name;
    Person(String name)
    {
        this.name = name;
    }
    void displayPerson()
    {
        System.out.println("Name: "+name);
        System.out.println("I am a person");
    }
}
class Employee extends Person
{
    int empId;
    Employee(int empId,String name)
    {
        super(name);
        this.empId = empId;
    }
    void displayEmployee()
    {
        System.out.println("Employee ID: "+empId);
        System.out.println("I am an employee");
    }
}
class Manager extends Employee
{

    
    void displayManager()
    {
        System.out.println("I am a manager");
    }

}
public enum multi_level_inheritance {
    public static void main(String[] args) {
        Person p= new Person("swetha");
        p.displayPerson();
    }
    
}
