package BookMyShow;

import java.util.*;

public class MovieController {

    Map<City, List<Movie>> cityVsMovies;
    List<Movie>allMovies;

    MovieController(){
        cityVsMovies=new HashMap<>();
        allMovies=new ArrayList<>();
    }

    public MovieController(Map<City, List<Movie>> cityVsMovies, List<Movie> allMovies) {
        this.cityVsMovies = cityVsMovies;
        this.allMovies = allMovies;
    }

    public void addMovies(Movie movie,City city){
        allMovies.add(movie);
        List<Movie>movieByCity=cityVsMovies.getOrDefault(city,new ArrayList<>());
        movieByCity.add(movie);
        cityVsMovies.put(city,movieByCity);
    }

    public List<Movie> getMovieByCity(City city){
        return cityVsMovies.getOrDefault(city,new ArrayList<>());

    }

}
