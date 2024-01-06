package labsheet4.q2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        final String SERVER_HOST = "localhost";
        final int SERVER_PORT = 9876;

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            InetAddress serverAddress = InetAddress.getByName(SERVER_HOST);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("You: ");
                String message = scanner.nextLine();
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);
                clientSocket.send(sendPacket);

                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);

                String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server: " + serverResponse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
