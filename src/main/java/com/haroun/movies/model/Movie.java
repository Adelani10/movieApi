package com.haroun.movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="movies")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {

    @Id
    private ObjectId id;
    private String title;
    private String releaseDate;
    private String trailerLinks;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    private List<Review> reviewIds;

    @Override
    public String toString() {
        return "Movie{" +
                "backdrops=" + backdrops +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", trailerLinks='" + trailerLinks + '\'' +
                ", genres=" + genres +
                ", poster='" + poster + '\'' +
                ", reviewIds=" + reviewIds +
                '}';
    }
}
