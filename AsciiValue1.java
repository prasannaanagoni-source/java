class AsciiValue1{
    public static void main(String args[]){
        String s="a1s2c5d8";
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sum+=(int)s.charAt(i)-'0';
            }
        }
       
           System.out.println(sum);
         
        }
       
    }
