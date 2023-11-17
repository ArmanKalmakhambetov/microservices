package ru.anyelectronic.product.converter;

import ru.anyelectronic.product.dto.ProductDto;
import ru.anyelectronic.product.model.Product;

public class Converter {

    public static Product convertProductDtoToProduct(ProductDto productDto) {

        return Product.builder()
                .manufactureName(productDto.getManufactureName())
                .model(productDto.getModel())
                .typeProduct(productDto.getTypeProduct())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .build();
    }

    public static ProductDto convertProductToProductDto(Product product) {

        return ProductDto.builder()
                .manufactureName(product.getManufactureName())
                .model(product.getModel())
                .typeProduct(product.getTypeProduct())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
