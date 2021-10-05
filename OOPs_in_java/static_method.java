package OOPs_in_java;
//static variables have only one copy which is shared by all objects of the class
//static methods can only access static variables
//they can call only static methods
class student{  
    int rollno;//instance variable  
    String name;  
    static String college ="BMSCE";//static variable  
    //constructor  
    static void change()
    {
        college="RV";
    }
    student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display the values  
    void display (){System.out.println(rollno+" "+name+" "+college);}  
 }  
 //Test class to show the values of objects  
 public class static_method{  
  public static void main(String args[]){  
  student s1 = new student(111,"ANIKET");  
  student s2 = new student(222,"ARYAN");  
  //we can change the college of all objects by the single line of code  
  //student.college="BBDIT";  
  s1.display();  
  s2.display();
  //call static methods directly byusing class name
  student.change();
  s1.display();
  s2.display();  
  }  
 }  