package ThreadChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread extends Thread{
    private Socket client;
    private BufferedReader in;
    private PrintWriter out;
    private Scanner scannerInput;
    private int client_id;

    public ServerThread(Socket client_socket,int c_id) throws IOException {
        this.client = client_socket;
        this.client_id = c_id;
        in = new BufferedReader((new InputStreamReader(client.getInputStream())));
        out = new PrintWriter(client.getOutputStream(), true);
        scannerInput = new Scanner(System.in);

    }

    public void run() {
        try {
            while (true) {
               String input = in.readLine();
                System.out.println("Client " +client_id +" Says " + input);

                System.out.println("Server: ");
                String output = scannerInput.nextLine();
                out.println(output);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client.close();
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
