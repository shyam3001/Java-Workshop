package package1;

import java.util.Arrays;

public class StringExample {

    public static void main(String[] args) {
        String input = "   hello world good morning how are you   ";
        input = input.trim();
        int total = input.length();
        int words = input.split("\\s+").length;

        String inputnospaces = input.replace(" ", "");
        int totalnospaces = inputnospaces.length();

        int index1 = input.indexOf("o");
        System.out.println(index1);

        while (true) {
            int index2 = input.indexOf("o", index1 + 1);
            if (index2 == -1) break;
            System.out.println(index2);
            index1 = index2;
        }

    }
}
