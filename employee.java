import java.util.*;

public class employee {
    private String emp_name;
    private int emp_id;
    private String emp_des;
    private double bas_sal;
    private double sal_in_hand;

    // setter and getter function
    public employee(String name,int id,String des,double base) 
    {
        emp_name=name;
        emp_id=id;
        emp_des=des;
        bas_sal=base;
        sal_in_hand=0.7*bas_sal;
    }

    // public double getBas_sal() {
    //     return bas_sal;
    // }

    // public void setBas_sal(double bas_sal) {
    //     this.bas_sal = bas_sal;
    // }

    // public void setsal_in_h() {
    //     this.sal_in_hand = 0.7 * bas_sal;
    // }

    // public double getsal_in() {
    //     return sal_in_hand;
    // }

    // public String getEmp_des() {
    //     return emp_des;
    // }

    // public void setEmp_des(String emp_des) {
    //     this.emp_des = emp_des;
    // }

    // public int getEmp_id() {
    //     return emp_id;
    // }

    // public void setEmp_id(int emp_id) {
    //     this.emp_id = emp_id;
    // }

    // public String getEmp_name() {
    //     return emp_name;
    // }

    // public void setEmp_name(String emp_name) {
    //     this.emp_name = emp_name;
    // }

    public void display() {
        System.out.println("name of the employee :" + emp_name);
        System.out.println("id of the employee :" + emp_id);
        System.out.println("designation of the employee :" + emp_des);
        System.out.println("basic salary of the employee :" + bas_sal);
        System.out.println("salary in hand of the employee :" + sal_in_hand);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of employees");
        int n = sc.nextInt();
        employee[] emp;
        emp=new employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter the name of employee");
            String name = sc.next();
            System.out.println("enter the id of employee");
            int id = sc.nextInt();
            System.out.println("enter the designation of employee");
            String des = sc.next();
            System.out.println("enter the basic salary of employee");
            double base = sc.nextDouble();
            emp[i]=new employee(name, id, des, base);
        }
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        sc.close();

    }

}
