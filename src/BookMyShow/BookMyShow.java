package BookMyShow;

import javax.sql.rowset.RowSetWarning;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    public static MovieController movieController;
    public static TheatreController theatreController;

    public BookMyShow() {
        movieController=new MovieController();
        theatreController=new TheatreController();
    }

    public static void main(String[] args) {

        BookMyShow bookMyShow=new BookMyShow();

        User user1=new User(1,"Ram",City.Bangalore);
        User user2=new User(2,"Laxman",City.Bangalore);

        Movie movie1=new Movie(1,"Dabang",8);
        Movie movie2=new Movie(2,"Bahubali",16);

        movieController.addMovies(movie1,City.Delhi);
        movieController.addMovies(movie2,City.Bangalore);

        theatreController.createTheatre();

        createBooking(user1,movie2);
        createBooking(user2,movie2);

    }

    public static void createBooking(User user,Movie interestedMovie){

        List<Movie> movies=movieController.getMovieByCity(user.getCity());
        boolean flag=false;
        for(Movie movie:movies) {
            if(interestedMovie==movie) {
                flag=true;
                break;
            }
        }

        if(!flag){
            System.out.println("Interested Movie not found in city "+ user.getCity());
            return;
        }

        Map<Theatre,List<Show>> theatreVsShows=theatreController.getAllShows(interestedMovie ,user.getCity());
        Map.Entry<Theatre,List<Show>>itr=theatreVsShows.entrySet().iterator().next();
        List<Show>shows=itr.getValue();

        Show interestedShow=shows.get(0);
        List<Integer>bookedSeatIds=interestedShow.getBookedSeatIds();

        Integer seatId=3;

        if(!bookedSeatIds.contains(seatId)){
                bookedSeatIds.add(seatId);

                Booking booking=new Booking();
                List<Seat>myBookedSeats=new ArrayList<>();

                for(Seat seat:interestedShow.getScreen().seats){
                    if(seat.getSeatId()==seatId){
                        myBookedSeats.add(seat);
                    }
                }
                booking.setSeats(myBookedSeats);
                booking.setShow(interestedShow);
            System.out.println("BOOKING SUCCESSFUL");
        }else {
            System.out.println("seat already booked, try again");
            return;
        }
    }
}
