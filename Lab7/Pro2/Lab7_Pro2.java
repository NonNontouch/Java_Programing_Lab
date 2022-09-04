public class Lab7_Pro2 {
    public static void main(String[] args) {
        Pro2Account george = new Pro2Account();
        Transactions transac = new Transactions();
        System.out.println("Name : " + george.getname());
        System.out.println("Account ID: " + george.getid());
        System.out.println("Annual interest rate: " + george.getannualinterestrate());
        System.out.println("Banlance: " + george.getBalance());
        System.out.println("Date\t\t\t\tType\t\t\tAmount\t\t\tBalance");
        george.deposit(30);
        transac.gettransiction("D",30,george.getBalance());
        george.deposit(40);
        transac.gettransiction("D",40,george.getBalance());
        george.deposit(50);
        transac.gettransiction("D",50,george.getBalance());
        george.withdraw(5);
        transac.gettransiction("W",5,george.getBalance());
        george.withdraw(4);
        transac.gettransiction("W",4,george.getBalance());
        george.withdraw(2);
        transac.gettransiction("W",2,george.getBalance());
        transac.printtransaction();
    }
}
