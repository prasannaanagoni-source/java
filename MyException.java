class InSufficientFundsException extends Exception{
    public InSufficientFundsException(String msg){
        super(msg);

    }
}
class BankAccount{
    String name;
    int inbal;
    public BankAccount(String name,int inbal){
        this.name=name;
        this.inbal=inbal;
    }
    public void withdraw(int amount)throws InSufficientFundsException{
        if(amount>inbal){
            throw new InSufficientFundsException("not having enough balance");
        }
        else{
            System.out.println("withdraw successful");
            inbal-=amount;
            System.out.println("balance is:"+inbal);
        }

    }
}
class MyException{
    public static void main(String args[]){
        BankAccount obj=new BankAccount("nani",50000);
        try{
            obj.withdraw(2000);
        }
        catch(InSufficientFundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("thankyou visit again");
        }
    }
}