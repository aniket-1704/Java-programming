package Collections;

import java.io.*;
import java.util.*;

class serialize_deserialize {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        try{
            // Serialization
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();
            // Deserialization
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //casting
            ArrayList<String> list = (ArrayList<String>) ois.readObject();
            fis.close();
            ois.close();
            System.out.println(list);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}