package com.example.order.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "orders")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numberOfOrder;

    private String description;

    private LocalDateTime dateOfCreate;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(numberOfOrder, order.numberOfOrder) && Objects.equals(description, order.description) && Objects.equals(dateOfCreate, order.dateOfCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfOrder, description, dateOfCreate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", numberOfOrder=" + numberOfOrder +
                ", description='" + description + '\'' +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }
}
