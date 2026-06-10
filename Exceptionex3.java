class Exceptionex3{
    public static void main(String args[]){
        int n=5;
        int[] arr=new int[n];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        try{
            System.out.println(arr[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("cannot access the index"+e.getMessage());
        }

    }
    }
    
