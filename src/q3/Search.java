package q3;

import java.io.File;
import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        String filename = args[0];
        ArrayList<String> filenames = new ArrayList<String>();
        ArrayList<String> searchResults = new ArrayList<String>();

        for (int i = 1; i < args.length; i++) {
            filenames.add(args[i]);
        }

        for (String f : filenames) {
            try {
                File file = new File(filename);

                if (!file.exists()) {
                    System.out.println("File does not exist");
                    continue;
                }

                // read line by line
                // search for the string
                // if found, add the filename to searchResults
                // print the searchResults
                Scanner scanner = new Scanner(file);
                boolean found = false;

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains(f)) {
                        searchResults.add(filename + " : " + line);
                        found = true;
                        break;
                    }
                }
                scanner.close();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.exit(1);
            }
        }
    }
}
