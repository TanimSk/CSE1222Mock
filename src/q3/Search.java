// package q3;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

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
                File file = new File("./" + filename);

                if (!file.exists()) {
                    System.out.println("File does not exist");
                    continue;
                }

                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains(f)) {
                        searchResults.add(f + " : " + line);
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
