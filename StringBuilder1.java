public class StringBuilder1 {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder();
        //capacity tells you the how many elements it can hold
        //StringBuildername.capacity();
        System.out.println("Inital capacity:"+sb.capacity());
        sb.append("Java programming abcdefghijklmnopqrstuvwxyz");
        System.out.println("Lenght:"+sb.length());
        System.out.println("Capacity:"+sb.capacity());
    }
    
}
