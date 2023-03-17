package com.mock.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee", schema = "dbo")
public class Employee {
    @Id
    private String employeeId;
}
