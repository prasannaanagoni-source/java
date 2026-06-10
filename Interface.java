interface Animal{
   int legs=4;
   public void eat();
   public void sound();

}
class Cat implements Animal{
    public void eat(){
        System.out.println("cat eats fish..");
    }
   public void sound(){
    System.out.println("MEOOWWWWW..");
   }
}
class Interface{
    public static void main(String args[]){
        Cat cobj=new Cat();
        cobj.eat();
        cobj.sound();
    }
}
