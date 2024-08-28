package com.haroun.movies.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "reviews")
@NoArgsConstructor
@Data
public class Review {


    @Id
    private ObjectId reviewId;
    private String body;

    public Review(String reviewBody) {
        this.body = reviewBody;
    }

}
