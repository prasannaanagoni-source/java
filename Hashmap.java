import java.util.*;
class Hashmap{
   
    public static void main(String args[]){
     
        HashMap<String,Integer> menu=new HashMap<String,Integer>();
        menu.put("biryani",450);
        menu.put("mandi",450);
        menu.put("starters",450);
        menu.put("butter chicken",450);

        int total=0;
        Scanner sc=new Scanner(System.in);
        
        String choice="yes";
        while(choice.equals("yes")){
            System.out.println("enter your food to order:");
            String food=sc.next();
            if(menu.containsKey(food)){
               total+=menu.get(food);
            }else{
                System.out.println("not available");
                
            }
            System.out.println("wants to oredr more(yes/no)");
            choice=sc.next();
        }
    
    System.out.println(total+((total*10)/100));
    }
}