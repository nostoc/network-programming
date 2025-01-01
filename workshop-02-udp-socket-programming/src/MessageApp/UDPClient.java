package MessageApp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket();
        InetAddress ipAddress = InetAddress.getLocalHost();

        String str = "Hello UDP socket programming";
        byte[] buf = str.getBytes();

        DatagramPacket packet = new DatagramPacket(buf,buf.length,ipAddress,4411);
        client.send(packet);

        client.close();

    }
}
