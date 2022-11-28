package cz.czechitas.java2webapps.ukol7.repository;
import cz.czechitas.java2webapps.ukol7.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository <Post, Long> {
}