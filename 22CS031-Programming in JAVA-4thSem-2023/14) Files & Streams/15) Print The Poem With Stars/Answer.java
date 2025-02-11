import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFile = scanner.next();
        int width = scanner.nextInt();
        scanner.close();
        try {
            printPoemWithStars(inputFile, width);
        } catch (IOException e) {
            System.out.println("Error processing the file");
        }
    }
    public static void printPoemWithStars(String fileName, int width) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.isEmpty()) {
                line = line.substring(0, 1).toUpperCase() + line.substring(1).toLowerCase();
            }
            if (line.length() > width - 2) {
                line = line.substring(0, width - 2);
            }
            lines.add(line);
        }
        reader.close();
        System.out.println("*".repeat(width));
        for (String text : lines) {
            System.out.printf("*%-" + (width - 2) + "s*\n", text);
        }
        System.out.println("*".repeat(width));
    }
}