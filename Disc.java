class Disc{
    public static void towerOfHanoi(int n,char s,char d,char aux){
        if(n==0)
            return;
        else
            towerOfHanoi(n-1,s,aux,d);
            System.out.println("Disk "+n+"transfer from "+s+"to"+d);
            towerOfHanoi(n-1,aux,d,s);
    }
    public static void main(String args[]){
        towerOfHanoi(3,'A','c','B');
    }
}