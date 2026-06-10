abstract class Bank{
    abstract public void loan(float perc);
    public void netBankig(){
        System.out.println("yes net banking is available");
    }
}
class HDFC extends Bank{
    public void loan(float perc){
        System.out.println("HDFC gives loan on"+perc+"ROI");
    }
}
class SBI extends Bank{
    public void loan(float perc){
        System.out.println("SBI gives loan on"+perc+"ROI");
    }
}
class MyMainClass{
    public static void main(String args[]){
        HDFC hobj=new HDFC();
        hobj.loan(6.9f);
        SBI sobj=new SBI();
        sobj.loan(13.4f);
        sobj.netBankig();
    }
}