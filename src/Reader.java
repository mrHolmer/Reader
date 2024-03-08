import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    private final ArrayList<String> words;

    public Reader() throws FileNotFoundException {
        words = new ArrayList<>();
        File file = new File("src/allwords.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            if (word.length() != 0)
                words.add(word);
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
