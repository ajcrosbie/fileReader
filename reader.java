import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reader {
    public static void main(String[] args) {
        try {
            File ob = new File("File.txt");
            Scanner reader1 = new Scanner(ob);
            while (reader1.hasNextLine()) {
                String data = reader1.nextLine();
                System.out.println(data);

            }
            reader1.close();
        } catch (FileNotFoundException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }

    }
}