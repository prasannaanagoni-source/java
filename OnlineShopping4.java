import java.util.*;
class OnlineShopping4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String newItem=sc.nextLine();
        List<String>products=new ArrayList<String>();
        products.add("mobile");
        products.add("laptop");
        products.add("Ac");
        boolean undi=false;
        for(String ele:products){
            if(ele.equals(newItem)){
                undi=true;
                break;
            }

        }
        if(undi==true){
            System.out.println("Already exists");
        }else{
            products.add(newItem);
            System.out.println("item added successfully");
            System.out.println(products);

        }

    }
}
