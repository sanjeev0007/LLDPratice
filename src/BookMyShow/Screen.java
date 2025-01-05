package BookMyShow;

import java.util.List;

public class Screen {

    Integer screenId;

    List<Seat> seats;

    public Screen(Integer screenId, List<Seat> seats) {
        this.screenId = screenId;
        this.seats = seats;
    }

    public Screen() {

    }

    public Integer getScreenId() {
        return screenId;
    }

    public void setScreenId(Integer screenId) {
        this.screenId = screenId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
