class Student{
    int id;
    String name;
    String branch;
    String email;
  static String college="bits";
    
  public Student(int id,String name,String branch,String email){
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.email=email;

    }
    public void displayDetails(){
        System.out.println("Id is:"+this.id);
        System.out.println("Name is:"+this.name);
        System.out.println("Branch is:"+this.branch);
        System.out.println("Email is:"+this.email);
        System.out.println("College is:"+Student.college);
    }
}

 public class StdData1{
    public static void main(String args[]){
        Student s1=new Student(101,"nani","csd","nani@123");
        s1.displayDetails();
    }

 }
