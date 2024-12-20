package MesageApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {
    static int port = 9999;

    public static void main(String[] args) throws IOException {
        System.out.println("\t\t Simple Chat Server");
        System.out.println("\t\t ============");

        ServerSocket serversocket = new ServerSocket(port);
        Scanner scannerInput = new Scanner(System.in);
        String input, output;
        try {
            while (true) {
                Socket socket = serversocket.accept();
                System.out.println("\t\t Client is connected... \n");

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader((new InputStreamReader(socket.getInputStream())));

                try {
                    out.println("welcome to Chat Application");
                    while (true) {
                        input = in.readLine();
                        System.out.println("Server Says: " + input);

                        System.out.println("Server: ");
                        output = scannerInput.nextLine();
                        out.println(output);
                    }
                } finally {
                    socket.close();
                    out.close();
                    in.close();
                }
            }
        } finally {
            serversocket.close();
        }
    }
}

