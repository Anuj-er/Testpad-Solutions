import java.io.*;

public class Main {
    /**
     * Reads an HTML file and returns the content with all HTML tags removed.
     * @param filename The name of the HTML file to process
     * @throws IOException If there's an error reading the file
     */
    public static void stripHtmlTags(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            StringBuilder content = new StringBuilder();
            String line;
            
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            
            // Process the content to remove HTML tags
            String htmlContent = content.toString();
            StringBuilder result = new StringBuilder();
            boolean inTag = false;
            
            for (int i = 0; i < htmlContent.length(); i++) {
                char c = htmlContent.charAt(i);
                
                if (c == '<') {
                    inTag = true;
                } else if (c == '>') {
                    inTag = false;
                } else if (!inTag) {
                    result.append(c);
                }
            }
            
            // Print the result
            System.out.println(result.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filename);
            throw e;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            throw e;
        }
    }
    
    public static void main(String[] args) {
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            String filename = inputReader.readLine();

            stripHtmlTags(filename);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
