import java.util.*;
import java.lang.String;

class retail {
    private String name;
    private String desc;
    private int quant;
    private double price;
    private double total;

    retail(String n, String d, int q, double p) {
        name = n;
        desc = d;
        quant = q;
        price = p;
        total = quant * price;
    }

    public void display() {
        System.out.println();
        System.out.println();
        System.out.println("name of product:" + name);
        System.out.println("description of product:" + desc);
        System.out.println("quantity of product:" + quant);
        System.out.println("price of product per kg:" + price);
        System.out.println("total:" + total);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the product");
        String name = sc.next();
        System.out.println("enter the description of the product");
        String desc = sc.next();
        System.out.println("enter the quantity of the product");
        int quan = sc.nextInt();
        System.out.println("enter the price of the product perkg");
        double price = sc.nextDouble();
        retail r = new retail(name, desc, quan, price);
        r.display();
        sc.close();
    }

}
