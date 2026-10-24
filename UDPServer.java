
import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5000);
        byte[] b = new byte[1024];

        System.out.println("UDP Server is waiting...");

        DatagramPacket p = new DatagramPacket(b, b.length);
        ds.receive(p);

        String msg = new String(p.getData(), 0, p.getLength());
        msg = msg.toUpperCase();

        Thread.sleep(6);

        byte[] data = msg.getBytes();
        DatagramPacket reply = new DatagramPacket(
            data, data.length, p.getAddress(), p.getPort());

        ds.send(reply);
        ds.close();
    }
}

