package com.mock.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "actor", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class Actor implements Serializable {
    @Id
    private String actorId;
}
