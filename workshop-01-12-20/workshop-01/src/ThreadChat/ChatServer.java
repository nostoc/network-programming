package ThreadChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    static int port = 4001;

    public static void main(String[] args) throws IOException {
        System.out.println("\t\t  Chat Server");
        System.out.println("\t\t ============");

        ServerSocket serversocket = new ServerSocket(port);

        int current_client =1;
        try {
            while (true) {
                Socket client = serversocket.accept();
                System.out.println("\t\t Client is connected... \n");

                ServerThread ct = new ServerThread(client,current_client);
                ct.start();
                current_client++;

            }
        }
        finally {
            serversocket.close();
        }
    }

}

// server is listening to the server
// when there is a client, he will get accepted
// the server will assign a thread for each client


