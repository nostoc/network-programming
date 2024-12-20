package MesageApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;


public class SimpleClient {
    static int PORT = 9999;

    public static void main(String[] args) throws IOException {
        System.out.println("\t\t Simple client");
        System.out.println("\t\t ============");

        InetAddress ipAddress = InetAddress.getLocalHost();
        Socket socket = new Socket(ipAddress, PORT);
        System.out.println("\t\t server is connected...\n");

        BufferedReader in = new BufferedReader((new InputStreamReader(socket.getInputStream())));
        String input = in.readLine();
        System.out.println("\t\t Server says: " + input);
        System.out.println("\t\t CLosing the connection...");
        socket.close();
        in.close();

        System.exit(0);
        // 0 indicate successful termination


    }
}
