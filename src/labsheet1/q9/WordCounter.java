package labsheet1.q9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

    public static void main(String[] args) {
        String filePath = "input.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int wordCount = 0;

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");

                wordCount += words.length;
            }

            bufferedReader.close();

            System.out.println("Total number of words: " + wordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
