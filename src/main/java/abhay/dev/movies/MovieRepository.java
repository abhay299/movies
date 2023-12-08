package abhay.dev.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// How is MovieRepository interface instantiated in MovieService class if an interface can only be implemented and never instantiated?
// The MongoRepository extends the MovieRepository interface
// behind the scenes, the Spring Data MongoDB implements the repository interface at runtime.
// When the MovieRepository interface instance is created, SpringBoot will actually create 
// an instance of this implementation.
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // List<Movie> findByTitle(String title);    
}
