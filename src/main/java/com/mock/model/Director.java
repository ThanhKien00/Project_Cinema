package com.mock.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "director", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class Director {
    @Id
    private int id;
}
