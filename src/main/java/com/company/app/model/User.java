package com.company.app.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class User {

    @Id @GeneratedValue
    @Type(type = "uuid-char")
    private UUID id;

    private String name;
}
