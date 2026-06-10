import java.util.Arrays;
class Anagram{
    public static void main(String args[]){
        String s1="mat";
        String s2="atm";
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String res1=new String(ch1);
        String res2=new String(ch2);
        if(res1.equals(res2)){
            System.out.println("Anagram");

        }else{
            System.out.println("not Anagram");
        }
    }
}