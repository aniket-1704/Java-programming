package file_handling_programs;

import java.io.*;
import java.util.*;

class copy1 {

    public static void copyContent(File a, File b) throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);

        try {

            int n;

            // read() function to read the
            // byte of data
            while ((n = in.read()) != -1) {
                // write() function to write
                // the byte of data
                out.write(n);
            }
        } finally {
            if (in != null) {

                // close() function to close the
                // stream
                in.close();
            }
            // close() function to close
            // the stream
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // get the source file name
        System.out.println("Enter the source filename from where you have to read/copy :");
        String a = sc.nextLine();

        // source file
        File x = new File(a);

        // get the destination file name
        System.out.println("Enter the destination filename where you have to write/paste :");
        String b = sc.nextLine();

        // destination file
        File y = new File(b);
        sc.close();
        // method called to copy the
        // contents from x to y
        copyContent(x, y);
    }
}

// copy contents
// using cmmd
// line args
// // program to copy one file to anothe using command line arguments
// import java.io.*;

// class CopyFile {
//     public static void main(String args[]) throws IOException {
//         int i;
//         // First, confirm that both files have been specified.
//         if (args.length != 2) {
//             System.out.println("Usage: CopyFile from to");
//             return;
//         }
//         // Open and manage two files via the try statement.
//         try (FileInputStream fin = new FileInputStream(args[0]);
//                 FileOutputStream fout = new FileOutputStream(args[1])) {
//             do {
//                 i = fin.read();
//                 if (i != -1)
//                     fout.write(i);
//             } while (i != -1);

//         } catch (IOException e) {
//             System.out.println("I/O Error: " + e);
//         }
//     }
// }