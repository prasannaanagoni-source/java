import java.util.*;
class Collectionex1{
    public static void main(String args[]){
        LinkedList<Integer>lis=new LinkedList<Integer>();
        lis.add(10);
        lis.add(20);
        lis.add(30);
        lis.add(40);
        lis.add(50);
      
       // for(Integer ele:lis){
         //   System.out.println(ele);
        //}
       for(int i=lis.size()-1;i>=0;i--){
        System.out.println(lis.get(i));
       }
    }

}