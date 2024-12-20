package MesageApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    static int port = 9999;

    public static void main(String[] args) throws IOException {
        System.out.println("\t\t Simple server");
        System.out.println("\t\t ============");

        ServerSocket serversocket = new ServerSocket(port);
        try {
            while (true) {
                Socket socket = serversocket.accept();
                System.out.println("\t\t Client is connected... \t\t\t");
                try {

                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.println("welcome to socket programming");
                } finally {
                    socket.close();
                }
            }
        } finally {
            serversocket.close();
        }
    }
    }

