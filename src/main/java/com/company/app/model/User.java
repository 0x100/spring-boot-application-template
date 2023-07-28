package com.company.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class User {

    @Id
    private UUID id;

    private String name;
}
