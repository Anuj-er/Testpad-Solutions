static void replaceTabs(String input, String output) {
    try (BufferedReader reader = new BufferedReader(new FileReader(input));
         BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
        String line;
        while ((line = reader.readLine()) != null) {
            StringBuilder newLine = new StringBuilder();
            int column = 0;
            for (char ch : line.toCharArray()) {
                if (ch == '\t') {
                    int spaces = 8 - (column % 8);
                    newLine.append(" ".repeat(spaces));
                    column += spaces;
                } else {
                    newLine.append(ch);
                    column++;
                }
            }
            writer.write(newLine.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}