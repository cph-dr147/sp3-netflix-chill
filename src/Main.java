
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
ReadFile readFile = new ReadFile();


ArrayList<String> movieData = readFile.readFile("/Users/danarulle/Documents/java/SP3 - Streamingtjeneste/Data_resource/movie.csv");
        for (int i = 0; i < movieData.size(); i++) {
            System.out.println(movieData.get(i));
        }
ArrayList<String> serieData = readFile.readFile("/Users/danarulle/Documents/java/SP3 - Streamingtjeneste/Data_resource/serie.csv");
for (int i = 0; i < serieData.size(); i++) {
    System.out.println(serieData.get(i));
}

    }
}