package ru.anyelectronic.product.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.anyelectronic.product.model.TypeProduct;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class ProductDto {

    private String manufactureName;
    private TypeProduct typeProduct;
    private String model;
    private String description;
    private double price;
}
