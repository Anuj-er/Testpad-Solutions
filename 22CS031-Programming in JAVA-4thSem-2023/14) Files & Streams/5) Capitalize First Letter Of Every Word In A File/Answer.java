static void capitalizeWords(String source, String dest) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(source));
        BufferedWriter writer = new BufferedWriter(new FileWriter(dest));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            StringBuilder capitalizedLine = new StringBuilder();
            for (String word : words) {
                if (word.length() > 0) {
                    capitalizedLine.append(Character.toUpperCase(word.charAt(0)))
                                   .append(word.substring(1))
                                   .append(" ");
                }
            }
            writer.write(capitalizedLine.toString().trim());
            writer.newLine();
        }
        reader.close();
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}