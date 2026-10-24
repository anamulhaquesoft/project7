
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        String msg = "hello world";
        byte[] b = msg.getBytes();

        DatagramPacket p = new DatagramPacket(
            b, b.length, InetAddress.getByName("localhost"), 5000);

        ds.send(p);

        byte[] data = new byte[1024];
        DatagramPacket reply = new DatagramPacket(data, data.length);
        ds.receive(reply);

        System.out.println("Server: " +
            new String(reply.getData(), 0, reply.getLength()));

        ds.close();
    }
}
