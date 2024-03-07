import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    private final ArrayList<String> words;
    private final File file;
    private final Scanner scanner;

    public Reader() throws FileNotFoundException {
        words = new ArrayList();
        file = new File("src/allwords.txt");
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().length() == 0)
                words.add(scanner.nextLine());
        }
    }

    public boolean search(String target) {
        for (String word : words)
            if (word.equals(target)) return true;
        return false;
    }

    public ArrayList<String> getWords() {
        return words;
    }
}
