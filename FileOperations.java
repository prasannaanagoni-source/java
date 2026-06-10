import java.io.*;
class FileOperations{
    public static void main(String args[]){
        File file=new File("demo.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File is created");
            }else{
                System.out.println("file already exists");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}