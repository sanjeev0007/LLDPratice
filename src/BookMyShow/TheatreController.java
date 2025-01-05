package BookMyShow;

import java.util.*;

public class TheatreController {

    Map<City, List<Theatre>> cityVsTheatre;

    List<Theatre>theatres;

    public TheatreController(Map<City, List<Theatre>> cityVsTheatre, List<Theatre> theatres) {
        this.cityVsTheatre = cityVsTheatre;
        this.theatres = theatres;
    }

    public TheatreController() {
            cityVsTheatre=new HashMap<>();
            theatres=new ArrayList<>();
    }

    public Map<City, List<Theatre>> getCityVsTheatre() {
        return cityVsTheatre;
    }

    public void setCityVsTheatre(Map<City, List<Theatre>> cityVsTheatre) {
        this.cityVsTheatre = cityVsTheatre;
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(List<Theatre> theatres) {
        this.theatres = theatres;
    }

    public void createTheatre(){
        Theatre theatre1 =new Theatre();
        theatre1.setTheatreId(1);
        theatre1.setCity(City.Bangalore);
        theatre1.setScreens(createScreen());
        theatre1.setShows(createShows(theatre1.getScreens()));
        cityVsTheatre.put(City.Bangalore, Arrays.asList(theatre1));

        Theatre theatre2 =new Theatre();
        theatre2.setTheatreId(2);
        theatre2.setCity(City.Mumbai);
        theatre2.setScreens(createScreen());
        theatre2.setShows(createShows(theatre2.getScreens()));
        cityVsTheatre.put(City.Mumbai, Arrays.asList(theatre2));

        Theatre theatre3 =new Theatre();
        theatre3.setTheatreId(3);
        theatre3.setCity(City.Delhi);
        theatre3.setScreens(createScreen());
        theatre3.setShows(createShows(theatre3.getScreens()));
        cityVsTheatre.put(City.Delhi, Arrays.asList(theatre3));

        theatres.add(theatre1);
        theatres.add(theatre2);
        theatres.add(theatre3);

    }

    public List<Screen> createScreen(){

        List<Screen>screens=new ArrayList<>();

        Screen screen1 =new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeat());
        screens.add(screen1);

        Screen screen2 =new Screen();
        screen2.setScreenId(1);
        screen2.setSeats(createSeat());
        screens.add(screen2);

        return screens;
    }

    public List<Seat> createSeat(){
        List<Seat>seats=new ArrayList<>();

        seats.add(new Seat(1,1,SeatCategory.GOLD));
        seats.add(new Seat(2,1,SeatCategory.GOLD));
        seats.add(new Seat(3,1,SeatCategory.SILVER));
        seats.add(new Seat(4,2,SeatCategory.SILVER));
        seats.add(new Seat(5,2,SeatCategory.PLATINUM));

        return seats;

    }

    public List<Show>createShows(List<Screen>screens){
        Movie movie1=new Movie(1,"Dabang",8);
        Movie movie2=new Movie(2,"Bahubali",16);

        List<Show>shows=new ArrayList<>();
        shows.add(new Show(1,movie1,8,screens.get(0),null));
        shows.add(new Show(2,movie2,16,screens.get(0),null));

        return shows;

    }

    public Map<Theatre,List<Show>> getAllShows(Movie movie,City city){
        List<Theatre>theatreList=cityVsTheatre.get(city);

        Map<Theatre,List<Show>>theatreVsShow=new HashMap<>();

        for(Theatre theatre:theatreList){
            List<Show>shows=theatre.getShows();
            List<Show> matchedShow=new ArrayList<>();

            for(Show show:shows){
                if(show.getMovie().getMovieId()==movie.getMovieId()){
                    matchedShow.add(show);
                }
            }
            if(!matchedShow.isEmpty()){
                theatreVsShow.put(theatre,matchedShow);
            }
        }
        return theatreVsShow;

    }
}
