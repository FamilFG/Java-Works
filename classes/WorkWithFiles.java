package classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(" smth.txt"));
        bufferedWriter.write("Hello b");
        bufferedWriter.close();
    }
}
