static void appendFiles(String f1, String f2, String f3) {
    try {
        BufferedReader reader1 = new BufferedReader(new FileReader(f1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(f3, true));
        String line;
        while ((line = reader1.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        reader1.close();
        BufferedReader reader2 = new BufferedReader(new FileReader(f2));
        while ((line = reader2.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        reader2.close();
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}