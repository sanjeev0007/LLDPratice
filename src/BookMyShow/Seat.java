package BookMyShow;

public class Seat {

    Integer seatId;

    Integer rowNo;

    SeatCategory seatCategory;

    public Seat(Integer seatId, Integer rowNo, SeatCategory seatCategory) {
        this.seatId = seatId;
        this.rowNo = rowNo;
        this.seatCategory = seatCategory;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public SeatCategory getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory) {
        this.seatCategory = seatCategory;
    }
}
