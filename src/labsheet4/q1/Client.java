package labsheet4.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        final String SERVER_HOST = "localhost";
        final int SERVER_PORT = 12345;

        try (Socket socket = new Socket(SERVER_HOST, SERVER_PORT)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            writer.println("Hello from client!");

            String serverResponse = reader.readLine();
            System.out.println("Received from server: " + serverResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
