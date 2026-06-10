import java.util.*;
class OnlineShopping3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String newItem=sc.nextLine();
        List<String>products=new ArrayList<String>();
        products.add("mobile");
        products.add("laptop");
        products.add("Ac");
        if(products.contains(newItem)){
            System.out.println("Already Exists");
        }else{
            products.add(newItem);
            System.out.println("item added successfully");
            System.out.println(products);
        }
    }
}