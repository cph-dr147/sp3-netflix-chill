import java.util.ArrayList;


public class Serie extends Media {
    int season;
    int episode;
    int startYear;
    int endYear;

    public Serie(String Title, String genre, double Rating, int season, int episode, int startYear, int endYear) {
        super(Title, genre, Rating);
        this.season = season;
        this.episode = episode;
        this.startYear = startYear;
        this.endYear = endYear;

    }

    public int getSeason() {
        return season;
    }

    public int getEpisode() {
        return episode;
    }
}
