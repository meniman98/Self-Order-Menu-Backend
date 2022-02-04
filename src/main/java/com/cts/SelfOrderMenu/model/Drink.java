package com.cts.SelfOrderMenu.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "drink")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String drinkName;
    private String size;
    private String flavour;
    private double price;
    private String imageUrl;

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
