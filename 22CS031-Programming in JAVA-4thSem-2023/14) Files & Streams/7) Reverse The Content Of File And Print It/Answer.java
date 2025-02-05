import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine(); // Take file name as input
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File not found: " + fileName);
                return;
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line;
            // Read all lines from the file
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            // Reverse the order of lines
            Collections.reverse(lines);
            // Print each line in reverse word order
            for (String reversedLine : lines) {
                String[] words = reversedLine.split(" ");
                Collections.reverse(Arrays.asList(words));
                System.out.println(String.join(" ", words));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}