package com.mock.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client", schema = "dbo")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @Column(name = "client_id")
    private String clientId;

}
