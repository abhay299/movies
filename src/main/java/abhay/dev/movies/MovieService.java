package abhay.dev.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        // System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();
    }
}
