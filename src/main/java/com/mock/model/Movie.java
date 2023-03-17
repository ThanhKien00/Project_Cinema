package com.mock.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movie")
@Getter
@Setter
@NoArgsConstructor
public class Movie implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "id")
    private String movieId;

    @Column(name = "name")
    private String movieName;

    @Column(name = "language")
    private String language;


}
