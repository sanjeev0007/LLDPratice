package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Show {

    Integer ShowId;

    Movie movie;

    Integer startTime;

    Screen screen;

    List<Integer> bookedSeatIds=new ArrayList<>();

    public Show(Integer showId, Movie movie, Integer startTime, Screen screen, List<Integer> bookedSeatIds) {
        ShowId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.screen = screen;
        this.bookedSeatIds = (bookedSeatIds != null) ? bookedSeatIds : new ArrayList<>();
    }

    public Integer getShowId() {
        return ShowId;
    }

    public void setShowId(Integer showId) {
        ShowId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Integer> getBookedSeatIds() {
        return bookedSeatIds;
    }

    public void setBookedSeatIds(List<Integer> bookedSeatIds) {
        this.bookedSeatIds = bookedSeatIds;
    }
}
