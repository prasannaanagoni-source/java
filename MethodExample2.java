
class MethodExample2{
    public  void sayHello(String name){
        System.out.println("Hello"+name);
    }
    public static void main(String args[]){
        MethodExample2 me=new MethodExample2();
       me.sayHello("nani");
        me.sayHello("sweety");
    }
}