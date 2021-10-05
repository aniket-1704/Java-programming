package Collections;

import java.util.*;

class Treeset {
        // Java TreeSet class implements the Set interface that uses a tree for storage.
        // It inherits AbstractSet class and implements the NavigableSet interface. The
        // objects of the TreeSet class are stored in ascending order.

        // The important points about Java TreeSet class are:

        // Java TreeSet class contains unique elements only like HashSet.
        // Java TreeSet class access and retrieval times are quiet fast.
        // Java TreeSet class doesn't allow null element.
        // Java TreeSet class is non synchronized.
        // Java TreeSet class maintains ascending order.
        public static void main(String args[]) {
                TreeSet<Integer> set = new TreeSet<Integer>();
                Scanner sc = new Scanner(System.in);
                System.out.println("enter size for treeset");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                        System.out.println("enter value in treeset");
                        int val = sc.nextInt();
                        set.add(val);
                }
                sc.close();
                System.out.println("Highest Value: " + set.pollFirst());
                System.out.println("Lowest Value: " + set.pollLast());
        }
}