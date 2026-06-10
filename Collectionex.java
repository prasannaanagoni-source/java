import java.util.*;
class Collectionex{
    public static void main(String args[]){
        Stack<String>stack=new Stack<String>();
        stack.push("apple");
        stack.push("mango");
        stack.push("orange");
        stack.push("orange");
        stack.push("kiwi");
     stack.remove("orange");
     stack.pop();
     
        System.out.println(stack);
    }
}