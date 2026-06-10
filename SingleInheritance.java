class Electronics{
    public void turnOn(){
        System.out.println("Devices has turned on");
    }
}
class SmartPhone extends Electronics{
    public void takesSelfies(){
        System.out.println("Wow its nice pic!");
    }
}
class SingleInheritance{
    public static void main(String args[]){
        SmartPhone sp=new SmartPhone();
        sp.turnOn();
        sp.takesSelfies();
    }
}