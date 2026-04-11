class bnkAcc{
private String name;
private int accNo;
private Double balance;
public static int totalAcc=0;
public static Double totalBalance=0.0;

bnkAcc(){
    name="Abdul";
    accNo=111111;
    balance=999.9999;
    
    totalAcc++;
    totalBalance+=balance;
}

bnkAcc(String n){
    name=n;
    
    totalAcc++;
    totalBalance+=totalBalance;

}
bnkAcc(String n, int o){
    name=n;
    accNo=o;
    
    totalAcc++;
    totalBalance+=totalBalance;
    
}

bnkAcc(String n,int o,Double b){
    name=n;
    accNo=o;
    balance=b;
    totalBalance+=totalBalance;
    totalAcc++;
}

public void printName(){
    System.out.println("Name="+name);
}

public void printAccNo(){
    System.out.println("AccNo="+accNo);
}
public void printNnN(){
    System.out.println("Name=" +name );
    System.out.println("Accno="+ accNo);
}
public void printAll(){
System.out.println("\nName="+name+"\nAccno="+accNo+"\nBalance="+balance);
    
}
public static void printtotalBalance(){
    System.out.println("\nTotal Balance="+totalBalance);
}
public static void printtotalAcc(){
    System.out.println("Total Acc="+totalAcc);
}


}


class Bank {
    public static void main(String[] args) {
    bnkAcc b1=new bnkAcc();
    bnkAcc b2=new bnkAcc("Ali",222222,676767.90);
    
    b1.printAll();
    b2.printAll();
    
    
    b2.printtotalBalance();
    b1.printtotalAcc();
    
    
    
    }
}