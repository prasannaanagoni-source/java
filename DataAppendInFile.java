import java.io.*;
class DataAppendInFile{
    public static void main(String args[]){
        try{
            File file=new File("demo.txt");
            FileWriter writer=new FileWriter(file,true);
            writer.write("new data got added:");
            writer.close();
            System.out.println("data written successfully!");
        }
        catch(IOException e){
            System.out.println("issue to write the file");
        }
    }
}