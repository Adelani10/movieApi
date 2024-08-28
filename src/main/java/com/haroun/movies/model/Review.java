package com.haroun.movies.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "reviews")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {


    @Id
    private int reviewId;
    private List<String> reviews;

}
