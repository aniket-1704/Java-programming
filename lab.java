
import java.util.InputMismatchException;
import java.util.Scanner;

class range_exception extends Exception
{
    public range_exception(String s)
    {
        super(s);
    }  
}
class student_marks
{
    int n;
    float arr[][];
    String[] names=new String[100];
    public student_marks(int num,float a[][])
    {
        n=num;
        arr=new float[n][6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("enter marks for student : "+(i+1));
            System.out.println("enter the name of the student");
            String name;
            name=sc.nextLine();
            names[i]=name;
            for(int j=0;j<6;j++)
            {
                System.out.println("enter marks for subject : "+ (j+1));
                try{
                    float m=sc.nextInt();
                    test(m);
                }
                //modifications
                catch(InputMismatchException e)
                {
                    System.out.println("enter valid input");
                    System.out.println("enter marks for subject  "+(j+1)+"  again");
                    j--;
                    continue;
                }
                catch(ArithmeticException e)
                {
                    System.out.println("arithematic error");

                    System.out.println("enter marks for subject  "+(j+1)+"  again");
                    j--;
                    continue;
                }
                catch(Exception e)
                {
                    System.out.println("error: "+e);
                    
                    System.out.println("enter marks for subject  "+(j+1)+"  again");
                    j--;
                    continue;
                }
                a[i][j]=m;
                arr[i][j]=a[i][j];
            }
        }
        sc.close();
    }
    void display()
    {
        System.out.println("number of students = "+ n);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("name of the student is : "+names[i]);
            System.out.println("marks of student "+(i+1));
            for(int j=0;j<6;j++)
            {
                System.out.println("marks of student in subject :"+ (j+1) +" = "+ arr[i][j]);
                sum+=arr[i][j];
            }
            System.out.println("percentage of student = "+(sum/3)+"%");
        }
    }
    void test(float n)throws range_exception
    {
        if(n>50)
        {
            throw new range_exception("cannot enter marks above 50");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        int n=sc.nextInt();
        float arr[][]=new float[n][6];
        System.out.println("enter marks in 6 subjects");
        student_marks  obj=new student_marks(n,arr);
        System.out.println("marks displayed:");
        obj.display();
        sc.close();
    }
}
