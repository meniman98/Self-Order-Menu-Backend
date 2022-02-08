package com.cts.SelfOrderMenu.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "food")
public class Food extends Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return id == food.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
