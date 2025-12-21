package httpworks;

import java.io.*;
import java.net.*;

public class ServerClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 5000);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            out.println("Hello server");


        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
