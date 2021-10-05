package file_handling_programs;
//program to write to a file using PrintWriter(character stream)
import java.io.*;

class Main {
  public static void main(String[] args) {

    String data = "This is the chapter for file handling and i/o in java.";

    try {
      PrintWriter output = new PrintWriter("tester1.txt");

      output.print(data);
      output.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}