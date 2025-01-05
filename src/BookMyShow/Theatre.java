package BookMyShow;

import java.util.List;

public class Theatre {

    Integer theatreId;

    List<Show> shows;

    List<Screen>screens;

    City city;

    public Theatre(Integer theatreId, List<Show> shows, List<Screen> screens, City city) {
        this.theatreId = theatreId;
        this.shows = shows;
        this.screens = screens;
        this.city = city;
    }

    public Theatre() {

    }

    public Integer getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Integer theatreId) {
        this.theatreId = theatreId;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
