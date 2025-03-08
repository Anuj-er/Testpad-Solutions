import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    // Function to read data from file
    private static List<Integer> readDataFromFile(String filename) {
        List<Integer> numbers = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            if (line != null) {
                String[] items = line.split(",");
                
                for (String item : items) {
                    // Remove any leading/trailing spaces
                    item = item.trim();
                    try {
                        int num = Integer.parseInt(item);
                        numbers.add(num);
                    } catch (NumberFormatException e) {
                        System.out.println("Error parsing number: " + item);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: File '" + filename + "' not found or could not be read.");
        }
        
        return numbers;
    }
    
    // Function to generate and display histogram
    private static void generateHistogram(List<Integer> numbers) {
        // Initialize counts for each range
        int[] ranges = new int[10]; // 0: 0-10, 1: 11-20, ..., 9: 91-100
        
        // Count numbers in each range
        for (int num : numbers) {
            if (0 <= num && num <= 10) ranges[0]++;
            else if (11 <= num && num <= 20) ranges[1]++;
            else if (21 <= num && num <= 30) ranges[2]++;
            else if (31 <= num && num <= 40) ranges[3]++;
            else if (41 <= num && num <= 50) ranges[4]++;
            else if (51 <= num && num <= 60) ranges[5]++;
            else if (61 <= num && num <= 70) ranges[6]++;
            else if (71 <= num && num <= 80) ranges[7]++;
            else if (81 <= num && num <= 90) ranges[8]++;
            else if (91 <= num && num <= 100) ranges[9]++;
        }
        
        // Display histogram
        String[] rangeLabels = {
            "00-10", "11-20", "21-30", "31-40", "41-50", 
            "51-60", "61-70", "71-80", "81-90", "91-100"
        };
        
        for (int i = 0; i < 10; i++) {
            System.out.print(rangeLabels[i] + ":");
            for (int j = 0; j < ranges[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            String filename = inputReader.readLine();
            
            List<Integer> numbers = readDataFromFile(filename);
            
            if (!numbers.isEmpty()) {
                generateHistogram(numbers);
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
