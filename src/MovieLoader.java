import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieLoader {
    private MovieLoader() {}

    public static List<Movie> load(Path csvPath) throws IOException { // Open the CSV file to read the lines
        List<Movie> movies = new ArrayList<>();


        try (BufferedReader br = Files.newBufferedReader(csvPath)) {
            String line;
            boolean first = true;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

// Skip the first line because it's just the header
                if (first && line.toLowerCase().startsWith("title;") ) {
                    first = false;
                    continue;
                }
                first = false;

                try {
                    Movie movie = new Movie();
                    movie.parseDataString(line); // Indlæser data fra linjen
                    movies.add(movie);
                } catch (Exception e) {
                    System.out.println("️ Skipping invalid line: " + line);
                }
            }
        }

        return movies;
    }
}
