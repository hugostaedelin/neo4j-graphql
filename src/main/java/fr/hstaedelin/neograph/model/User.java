package fr.hstaedelin.neograph.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class User {

    @Id
    private Long id;
    private String name;
    private Integer age;

    @Relationship(type = "RATED", direction = Relationship.Direction.INCOMING)
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public User() {

    }

    public User(String name, Integer age, List<Movie> movies) {
        this.name = name;
        this.age = age;
        this.movies = movies;
    }

    public User(Long id, String name, Integer age, List<Movie> movies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
