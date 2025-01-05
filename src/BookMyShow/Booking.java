package BookMyShow;

import java.util.List;

public class Booking {

    Integer bookingId;

    List<Seat>seats;

    Payment payment;

    Show show;

    public Booking(List<Seat> seats, Integer bookingId, Payment payment) {
        this.seats = seats;
        this.bookingId = bookingId;
        this.payment = payment;
    }

    public Booking() {

    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
