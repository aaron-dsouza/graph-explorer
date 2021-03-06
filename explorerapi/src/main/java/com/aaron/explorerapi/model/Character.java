package com.aaron.explorerapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "characters")
@Entity
public class Character implements Node {
    @Id
    private int id;

    private String name;

    private String bio;

    @Override
    public int getId() {
        return id;
    }
}
