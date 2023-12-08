package abhay.dev.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/movies")


public class MovieController {
    // TO DO: 
    // what is autowired --> It injects the dependency of the class/field it's attached to 
    // automatically in the class(MovieController)/field(movieService) that requires it.
    // In this case whenever MovieController class is used/called, an instance of MovieService class will 
    // automatically be injected in in the movieService field and it will be used without any errors.
    // what does @ do --> It denotes Annonation. They provide info of class or methods or fields on how they might operate.
    @Autowired
    private MovieService movieService;
    @GetMapping("/get_movies")
    // what is responseEntity
    public ResponseEntity<List<Movie>> getAllMovies(){     
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    // @PostMapping("/create_movies")
    // public ResponseEntity<>
}
