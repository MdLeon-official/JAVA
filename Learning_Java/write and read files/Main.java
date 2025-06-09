import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // File I/O = Input/Output operations with files
        //           = Reading from and writing to files
        //           = Java provides several classes for file I/O, such as FileReader, FileWriter, BufferedReader, BufferedWriter, PrintWriter, FileInputStream, and FileOutputStream

        // How to read a file using Java

        // FileReader = Good for small or medium-sized text files
        // BufferedReader = Good for larger text files, as it buffers the input to improve performance
        // PrintWriter = Best for structured data, like reports or logs, as it provides convenient methods for formatting output
        // FileInputStream = Good for binary files or when you need to read raw bytes


        // EXAMPLE OF WRITE FILES
        // try(FileWriter writer = new FileWriter("/JAVA/Path/writetest.txt"))
        
        // try(FileWriter writer = new FileWriter("writetest.txt")){
        //     writer.write("I like beef.");
        //     System.out.println("File has been written");
        // }
        // catch (FileNotFoundException e) {
        //     System.out.println("Could not locate file location.");
        // }
        // catch(IOException e) {
        //     System.out.println("Could not write file");
        // }

        // EXAMPLE OF READ FILES
        // BufferedReader + FileReader = Good for reading text files line by line
        // FileInputStream: Best for reading binary files or when you need to read raw bytes
        // RandomAccessFile: Good for reading and writing files at specific positions, allowing for random access to the file's content


        // try(FileReader reader = new FileReader("/JAVA/Path/readtest.txt"))
        try(BufferedReader reader = new BufferedReader(new FileReader("readtext.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("File has been read");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file location.");
        }
        catch(IOException e) {
            System.out.println("Could not read file");
        }
    }
   
}
