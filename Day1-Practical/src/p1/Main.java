package p1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {       
        System.out.println("Simple File Handling Application");
        System.out.println("Press (1) to create a file: ");
        System.out.println("Press (2) to write to a file: ");
        System.out.println("Press (3) to read from a file: ");
        System.out.println("Press (4) to list files in folder: ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Option: ");
        int option = Integer.parseInt(in.nextLine().trim());
        
        if (option == 1) {
            System.out.print("Enter File Name: ");
            String fileName = in.nextLine().trim().toLowerCase();
            File file = new File(fileName);
            if (file.exists()) {
                System.out.println("Error: File Already Exists");
            }
            else {
                file.createNewFile();
                System.out.println("Successfully Created");
            }
        }
        else if (option == 2) {
            System.out.print("Enter File Name: ");
            String fileName = in.nextLine().trim().toLowerCase();
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("Error: File Does Not Exist");
            }
            else {
                PrintWriter out = new PrintWriter(new FileWriter(file,true));
                while (true) {
                    System.out.print("Enter text (enter exit to quit): ");
                    String text = in.nextLine().trim();
                    if (text.equalsIgnoreCase("exit")) {
                        break;
                    }
                    out.println(text);
                    out.flush();                
                }
                out.close();
                System.out.println("File Closed");
            }
        }
        else if (option == 3) {
            System.out.print("Enter File Name: ");
            String fileName = in.nextLine().trim().toLowerCase();
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("Error: File Does Not Exist");
            }
            else {
                FileReader reader = new FileReader(file);
                int i;
                // Holds true till there is nothing to read
                while ((i = reader.read()) != -1)
                // Print all the content of a file
                System.out.print((char)i);              
                }
                System.out.println();
                System.out.println("File Closed");
            }
        else if (option == 4) {
           System.out.print("Enter the path: ");
           String filepath = in.nextLine();
           File folder = new File(filepath);
           File[] listOfFiles = folder.listFiles();
           for (int i = 0; i < listOfFiles.length; i++) {
           if (listOfFiles[i].isFile()) {
            System.out.println("File " + listOfFiles[i].getName());
            } 
        }
        }    
    }//end of main
}//end of class
