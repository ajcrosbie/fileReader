import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class writer {
    public static void main(String[] args) {
        try {
            FileWriter F = new FileWriter("File.txt");
            for (int i = 0; i < 100; i++) {
                int x = generateRandom();
                F.write(new Integer(x).toString());
                F.write("\r");
            }
            F.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int generateRandom() {
        Random rand = new Random();
        int randint = rand.nextInt(100);
        return randint;
    }

}
