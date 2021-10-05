package file_handling_programs;

import java.io.*;

class C {
    public static void main(String args[]) throws Exception {
        FileInputStream fin = new FileInputStream("output.txt");
        FileOutputStream fout = new FileOutputStream("M.java");
        int i = 0;
        while ((i = fin.read()) != -1) {
            fout.write((byte) i);
        }
        fin.close();
        fout.close();
    }
}
