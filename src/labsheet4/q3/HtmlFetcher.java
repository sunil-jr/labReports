package labsheet4.q3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HtmlFetcher {

    public static void main(String[] args) {
        String url = "https://www.google.com";

        try {
            String htmlContent = fetchHtmlContent(url);

            System.out.println("HTML Content:\n" + htmlContent);

            saveHtmlToFile(htmlContent, "output.html");

            System.out.println("HTML content has been saved to 'output.html'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String fetchHtmlContent(String url) throws IOException {
        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try {
            URL urlObject = new URL(url);

            connection = (HttpURLConnection) urlObject.openConnection();

            connection.setRequestMethod("GET");

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder htmlContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                htmlContent.append(line);
            }

            return htmlContent.toString();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    private static void saveHtmlToFile(String htmlContent, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(htmlContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

