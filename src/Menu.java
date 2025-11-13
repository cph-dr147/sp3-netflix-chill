import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//no need to extend Media
public class Menu {
    private List<Movie> movies;

    public Menu(List<Movie> movies) {
        this.movies = movies;
    }


        public void showMoviesByGenre ()
    {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What type of movies would you like to see? (e.g., crime, family, comedy): ");
            String userInput = scanner.nextLine().toLowerCase();

        // Checks if the user's input matches a known genre; otherwise shows an error message.
            String genre = null;
            if (userInput.contains("crime")) {
                genre = "crime";
            } else if (userInput.contains("family")) {
                genre = "family";
            } else if (userInput.contains("comedy")) {
                genre = "comedy";
            } else if (userInput.contains("action")) {
                genre = "action";
            } else if (userInput.contains("drama")) {
                genre = "drama";
            } else {
                System.out.println("Sorry, I don't recognize that genre.");
                return;
            }
        // Finds and lists movies that match the selected genre.
            List<Movie> filteredMovies = new ArrayList<>();
            for (Movie movie : movies) {
                if (movie.getGenre().equals(genre)) {
                    filteredMovies.add(movie);
                }
            }
        // Shows how many movies match the chosen genre.
            if (filteredMovies.isEmpty()) {
                System.out.println("\nNo " + genre + " movies found in the database.\n");
            } else {

                // Displays a list of movies in the chosen genre.
                System.out.println("\nHere is a list of " + genre + " movies:\n");
                for (Movie movie : filteredMovies) {
                    System.out.println("- " + movie.getTitle());
                }
            }
        }
    }
