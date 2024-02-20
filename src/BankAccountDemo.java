public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Muhammad Naseem", 5000);
        BankAccount bobsAccount = new BankAccount("Bob Robinson");

        bobsAccount.deposit(500);
        System.out.println("owner: " + bobsAccount.getOwner());
        System.out.println("balance: " + bobsAccount.getBalance());

        bobsAccount.withdraw(1000); //cause a warning!
        System.out.println("owner: " + bobsAccount.getOwner());
        System.out.println("balance: " + bobsAccount.getBalance());
        System.out.println();

        System.out.println("Deposit 1000?");
        myAccount.deposit(1000);

        System.out.println("owner: " + myAccount.getOwner());
        System.out.println("balance: " + myAccount.getBalance());

    }//end main
}//end class
