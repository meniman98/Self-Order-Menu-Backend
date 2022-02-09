package com.cts.SelfOrderMenu.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "drink")
public class Drink extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "size", columnDefinition = "double default 0.0")
    private String size;

    @Column(name = "flavour", columnDefinition = "double default 0.0")
    private String flavour;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return id == drink.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
