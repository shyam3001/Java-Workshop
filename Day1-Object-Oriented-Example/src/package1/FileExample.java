package package1;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class FileExample {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("(0) Exit (1) Create New File, (2) Read from File");
            System.out.println("(3) Write to File (4) List Files (5) File Exists");
            System.out.print("Enter option 1 to 5: ");
            int option = in.nextInt();

            if (option == 0) {
                in.close();
                System.exit(0);
            }

            System.out.print("enter filename: ");
            String filename = in.next();
            File file = new File(filename);

            switch (option) {
                case 1: {
                    // create a new file
                    file.createNewFile();
                    break;
                }
                case 2: {
                    // reading from file
                    Scanner fr = new Scanner(file);
                    while (fr.hasNextLine()) {
                        String line = fr.nextLine();
                        System.out.println(line);
                    }
                    break;
                }
                case 3: {
                    // write to file
                    PrintWriter out = new PrintWriter(file);
                    System.out.println("Enter text: ");
                    in.nextLine(); // skip
                    String line = in.nextLine();
                    out.println(line);
                    out.close();
                    break;
                }
                case 4: {
                    // list files
                    System.out.println(Arrays.toString(file.list()));
                    break;
                }
                case 5: {
                    // file exists
                    System.out.println(file.exists());
                    break;
                }
                default:
                    break;
            }
        }
    }
}
