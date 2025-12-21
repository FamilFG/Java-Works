package httpworks;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;

public class SocketServer {
    public static void main(String[] args) {
        try (var serverSocket = new ServerSocket(8080);
             var socked = serverSocket.accept();
             var inputStream = new DataInputStream(socked.getInputStream());
             var outputStream = new DataOutputStream(socked.getOutputStream());
             Scanner sc = new Scanner(System.in)
        ) {
            var request = inputStream.readUTF();
            while (!request.equals("cancel")) {
                System.out.println("server : " + request);
                outputStream.writeUTF(sc.nextLine());
                request = inputStream.readUTF();

            }
        } catch (IOException e) {
            throw new RuntimeException();

        }
    }
}
