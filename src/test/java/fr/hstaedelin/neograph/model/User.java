package fr.hstaedelin.neograph.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;

    @Relationship(type = "RATED", direction = Relationship.Direction.INCOMING)
    private Iterable<Movie> movies;

    public User() {
    }

    public Iterable<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Iterable<Movie> movies) {
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
