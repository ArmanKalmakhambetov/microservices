package com.example.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
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
