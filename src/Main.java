

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
ReadFile readFile = new ReadFile();

ArrayList<String> lines = readFile.readFile("/Users/danarulle/Documents/java/SP3 - Streamingtjeneste/Data_resource/movie.csv");
for (int i = 0; i < lines.size(); i++) {
    System.out.println(lines.get(i));
}

    }
}