import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class reader {
    public static void main(String[] args) {
        int g = 0;
        int count = 0;
        try {
            File ob = new File("File.txt");
            Scanner reader1 = new Scanner(ob);
            while (reader1.hasNextInt()) {
                int ci = reader1.nextInt();
                count = count + 1;
                g = ci + g;
            }
            g = g / count;
            reader1.close();
        } catch (FileNotFoundException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }
        System.out.println(g);

    }

    public static ArrayList<Integer> createList(String file) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        try {
            File file1 = new File(file);
            Scanner reader1 = new Scanner(file1);

            while (reader1.hasNextInt()) {
                nums.add(reader1.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }
        return nums;
    }
}