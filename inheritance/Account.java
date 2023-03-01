package inheritance;

public class Account {
    public int account;
    public int amount;
    public String name;
    public String phoneNumber;
    public String DOB;
    public String Address;

    // create a geeter or a setter method

    public int getAcount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String setPhoneNumber(String phoneNum) {
        return this.phoneNumber = phoneNum;
    }

    public String getDOB() {
        return DOB;
    }

    public String setAddress(String addr) {
        return this.Address = addr;
    }

    public String getAddress() {
        return this.Address;
    }

    // create a bank accunt with the help of the contructor
    // public void Account(int accunt , String name){
    // this.account = accunt;
    // this.name = name;

    // }

    // public String Close(){
    // //
    // }

}

class SavingAccount extends Account{
    public void depositAmount (int Newamount){
        amount = amount + Newamount;
        // return amount;
        System.out.println( Newamount + " Amount creadit successfulyy  " + "Update balance is: " + amount);
    }
    public void  withdrawAmount (int Deduct){
        amount = amount - Deduct;
        System.out.println( Deduct + " Amount DEducted  successfulyy  " + "Update balance is: " + amount);
    }
}

class Test {
    public static void main(String[] args) {
        SavingAccount id1 = new SavingAccount();
        id1.name = "Aditya kuumar singh";
        id1.Address = "plot no 68 azad nagar ";
        id1.phoneNumber = "9060447390";
        id1.amount = 20;
        id1.DOB = "14-08-2001";
        

        System.out.println(id1.name);
        System.out.println(id1.amount);
        System.out.println(id1.Address);
        System.out.println(id1.phoneNumber);
        System.out.println(id1.DOB);
        id1.depositAmount(100);
        id1.withdrawAmount(50);
    }
}
