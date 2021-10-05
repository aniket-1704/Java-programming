import java.util.Scanner;

public class car {
    private int model;
    private String make;
    private int speed;

    public car(int model, String make, int speed) {
        this.model = model;
        this.make = make;
        this.speed = speed;
    }
    public  void accelerate()
    {
        speed+=5;
    }
    public  void brake()
    {
        speed-=5;
    }
    public void display_speed()
    {
        System.out.println("speed is :"+speed+" km/hr");
    }
    public  void display()
    {
        System.out.println("model year :"+ model);
        System.out.println("model name:"+ make);
        System.out.println("speed of car :"+ speed);
    }
   public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of cars");
        int n=sc.nextInt();
        car []obj=new car[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter model year");
            int model=sc.nextInt();
            System.out.println("enter name of car");
            String make=sc.next();
            System.out.println("enter speed");
            int speed=sc.nextInt();
            obj[i]=new car(model,make,speed);
        }
        System.out.println("details of cars");
        for(int i=0;i<n;i++)
        {
            obj[i].display();
        }

        for(int i=0;i<5;i++)
        {
            System.out.println("speed after accelerating");
            obj[0].display_speed();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("speed after brake");
            obj[0].display_speed();
        }
        sc.close();     
    }  
}
