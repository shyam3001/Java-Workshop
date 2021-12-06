package day4;

import java.io.File;
import java.util.Scanner;

public class DataStoreExample {
    static int[] studentids = new int[500];
    static String[] names = new String[500];
    static int[] ages = new int[500];
    
    public static void main(String[] args) throws Exception {
        File file = new File("students.txt");
        Scanner in = new Scanner(file);
        int count=0;
        
        while (in.hasNextLine()) {
            String[] line = in.nextLine().split(",");
            int studentid = Integer.parseInt(line[0]);
            String name = line[1];
            int age = Integer.parseInt(line[2]);
            
            studentids[count] = studentid;
            names[count] = name;
            ages[count] = age;
            count++;
        }
        
        for (int i=0; i<count; i++) {
            System.out.print(studentids[i] + " ");
            System.out.print(names[i] + " ");
            System.out.print(ages[i] + " ");
            System.out.println("");
        }
    }
}
