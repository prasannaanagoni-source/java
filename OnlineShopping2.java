import java.util.*;
class OnlineShopping2{
    public static void main(String args[]){
        List<String>products=new ArrayList<String>();
        products.add("mobile");
        products.add("laptop");
        products.add("Ac");
        products.remove(0);
        System.out.println(products.size());
    }
}