import java.io.*;
class DataWriteInFile{
    public static void main(String args[]){
        try{
            File file=new File("demo.txt");
            FileWriter writer=new FileWriter(file);
            writer.write("hello good afternoon!");
            writer.close();
            System.out.println("data written successfully!");
        }
        catch(IOException e){
            System.out.println("issue to write the file");
        }
    }
}