package com.cts.SelfOrderMenu.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column(name = "name", columnDefinition = "varchar(255) default 'Some item'")
    private String name;

    @Column(name = "price", columnDefinition = "double default 0.0")
    private double price;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "description", columnDefinition = "varchar(255) default 'Tasty item'")
    private String description;
}
