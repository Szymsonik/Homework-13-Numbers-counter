import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Util {
    public static void numberCounter(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<Integer, Integer> numbers = new TreeMap<>();

        while (scanner.hasNextInt()) {
            int key = scanner.nextInt();
            if (numbers.get(key) == null) {
                numbers.put(key, 1);
            } else {
                int counter = numbers.get(key) + 1;
                numbers.put(key, counter);
            }
        }
        Object[] keys = numbers.keySet().toArray();

        for (int i = 0; i < keys.length; i++) {
            System.out.println("Wartość " + keys[i] + " występuje " + numbers.get(keys[i]) + " razy");
        }
    }

}
