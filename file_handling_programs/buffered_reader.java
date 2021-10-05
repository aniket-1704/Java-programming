package file_handling_programs;

import java.io.*;

class BufferedReaderExample {
    public static void main(String args[]) {
        // java.io.BufferedReader DECLARATION
        BufferedReader br = null;
        InputStreamReader ir = null;
        try {
            char c;
            //links inputstream with the buffer stream
            //buffered stream allows use to reaad line by line and is of a large size(can be user defined)is faster
            ir = new InputStreamReader(System.in);
            br = new BufferedReader(ir);
            System.out.println("Enter Characters, q to Quit : ");
            do {
                //read a characters
                c = (char) br.read();//fr string is br.readLine()
                System.out.println("Char : " + c);
            } while (c != 'q');
        } catch (Exception e) {
            System.out.println("Error Occurred : " + e.getMessage());
        } finally {
            // SHOULD CLOSE STREAMS FINALLY
            try {
                if (br != null)
                    br.close();
                if (ir != null)
                    ir.close();
            } catch (Exception ex) {
                System.out.println("Error Occurred : " + ex.getMessage());
            }
        }
    }
}