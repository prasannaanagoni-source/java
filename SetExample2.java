import java.util.*;
class SetExample2{
    public static void main(String args[]){
        TreeSet<Integer>s=new TreeSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
       //s.remove(50);
       //System.out.println(s.contains(30));
        //System.out.println(s.size());
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}