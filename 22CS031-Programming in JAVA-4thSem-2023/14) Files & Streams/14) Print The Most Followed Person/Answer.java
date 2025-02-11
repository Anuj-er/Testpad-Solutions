import java.util.Scanner;
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFile = scanner.next();
        scanner.close();
        try {
            printMostFollowed(inputFile);
        } catch (IOException e) {
            System.out.println("Error processing the file");
        }
    }
    public static void printMostFollowed(String inputFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        Map<String, Set<String>> followersMap = new HashMap<>();
        Map<String, Integer> popularityMap = new HashMap<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] names = line.split("\\s+");
            String follower = names[0];
            String followed = names[1];
            followersMap.putIfAbsent(followed, new HashSet<>());
            followersMap.get(followed).add(follower);
            followersMap.putIfAbsent(follower, new HashSet<>());
        }
        reader.close();
        for (String user : followersMap.keySet()) {
            int popularity = 0;
            for (String follower : followersMap.get(user)) {
                popularity += followersMap.get(follower).size();
            }
            popularityMap.put(user, popularity);
        }
        String mostPopular = "";
        int maxPopularity = -1;
        for (Map.Entry<String, Integer> entry : popularityMap.entrySet()) {
            if (entry.getValue() > maxPopularity) {
                mostPopular = entry.getKey();
                maxPopularity = entry.getValue();
            }
        }
        System.out.println(mostPopular);
    }
}