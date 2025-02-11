import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        scanner.close();
        try {
            System.out.println(countUniqueWords(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("0");
        }
    }
    public static int countUniqueWords(String fileName) throws FileNotFoundException {
        HashSet<String> uniqueWords = new HashSet<>();
        Scanner fileScanner = new Scanner(new File(fileName));
        while (fileScanner.hasNext()) {
            String word = fileScanner.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); 
            if (!word.isEmpty()) {
                uniqueWords.add(word);
            }
        }
        fileScanner.close();
        return uniqueWords.size();
    }
}