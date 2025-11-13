import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    public ArrayList<String> readFile(String filePath) {
        String file = "movie.csv";
        String file2 = "serie.csv";

        String line;
        ArrayList<String> output = new ArrayList<String>();

        //  save each line in the list after reading the file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                output.add(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;

    }
}
