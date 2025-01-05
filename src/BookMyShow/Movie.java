package BookMyShow;

public class Movie {

    Integer movieId;

    String movieName;

    Integer movieDuration;

    public Movie(Integer movieId, String movieName, Integer movieDuration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }

    public Movie() {

    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(Integer movieDuration) {
        this.movieDuration = movieDuration;
    }
}
