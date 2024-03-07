import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Reader r = new Reader();
        System.out.println(r.getWords());
        System.out.println(r.search("holmer"));
        System.out.println(r.search("Zygotic"));
    }
}
