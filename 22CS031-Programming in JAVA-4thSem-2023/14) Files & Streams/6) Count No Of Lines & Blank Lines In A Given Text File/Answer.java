static void countLines(String f1) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(f1));
        int totalLines = 0;
        int blankLines = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            totalLines++;
            if (line.trim().isEmpty()) {
                blankLines++;
            }
        }
        reader.close();
        System.out.println(totalLines + " " + blankLines);
    } catch (IOException e) {
        e.printStackTrace();
    }
}