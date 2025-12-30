class bank_acc{
    int acc_no;
    String acc_name;
    double bal;
    void deposit_money(double money)
    {
        double tot_bal= money + bal;
        bal=tot_bal;
        System.out.println("Your total balance is "+ tot_bal);
    }
    void withdraw_money(double money)
    {
        if(bal>=money){
        double tot_bal=bal-money;
        bal = tot_bal;
        System.out.println("Now ur balance "+tot_bal);
        }
        else
            System.out.println("You dont have sufficient balance to withdraw");
    }
    void display()
    {
        System.out.println("Name of account holder "+ acc_name);
        System.out.println("Account numnber "+acc_no);
        System.out.println("Current balance "+bal);
    }
}
public class bank {
    public static void main(String[] args) {
        bank_acc b1 = new bank_acc();
        b1.acc_name="SWETHA DHAVALA";
        b1.acc_no=78965;
        b1.bal=10000;
        b1.display();
        b1.deposit_money(5000);
        b1.withdraw_money(10000);
        b1.withdraw_money(10000);
    }
}
