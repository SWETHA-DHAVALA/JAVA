class addition{
    static int add(int a , int b)
    {
        return (a+b);
    }
    static double add(double a , double b)
    {
        return (a+b);
    }
    static int add(int a , int b , int c)
    {
        return (a+b+c);
    }
    static double add(int a , int b , double c)
    {
        return a+b+c;
    }
}
public class poly {
    public static void main(String[] args) {
        
        System.out.println(addition.add(2345676,776445));
        System.out.println(addition.add(2, 4));
        System.out.println(addition.add(2, 67, 2.78));
    }
}
