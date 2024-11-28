package Oops_Concept_all;

//Abstraction Use
abstract class Bankk{
    private int account_num; //Encapsulation Use
    private double balance; //Encapsulation Use


//    Using Getter And Setter Method For Account Number And Balance
    public int getAccount_num(){
        return account_num;
    }

    public void setAccount_num(int account_num){
        this.account_num = account_num;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }


    public abstract void deposit(double Ammount);
    public abstract void withdraw(double Ammount);
}

//Inheritance and polymorpism Use
    class Customerr extends Bankk{

    private String Customer_Name;

    //Constructor
    Customerr(String Customer_Name, int account_num, double i_balance){
        this.Customer_Name = Customer_Name;
        setAccount_num(account_num);
        setBalance(i_balance);
    }

    public String getCustomer_Name(){
        return Customer_Name;
    }

    @Override
    public void deposit(double Ammount) {
        setBalance(getBalance()+Ammount);
        System.out.println("Deposit Success..Your Balance: "+getBalance());
    }

    @Override
    public void withdraw(double Ammount) {
        if(Ammount <= getBalance()){
            setBalance(getBalance()-Ammount);
            System.out.println("Withdraw Success..Your Current Balance: "+getBalance());
        }
        else{
            System.out.println("Empty Balance..");
        }
    }
}
public class Bank_new {
    public static void main(String[] args) {
        Customerr cc = new Customerr("Devendra",864575215,2000.20);
        System.out.println("Customer Name: "+ cc.getCustomer_Name());
        System.out.println("Accoount Number: "+cc.getAccount_num());

        cc.deposit(200);
        cc.withdraw(220.20);
        cc.withdraw(2200.20);

    }
}
