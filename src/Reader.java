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

    public static void main(String[] args) throws FileNotFoundException {
        Reader r = new Reader();
        System.out.println(r.words);
        System.out.println(r.search("holmer"));
        System.out.println(r.search("Zygotic"));
    }

    public boolean search(String target) {
        for (String word : words)
            if (word.equals(target)) return true;
        return false;
    }
}
