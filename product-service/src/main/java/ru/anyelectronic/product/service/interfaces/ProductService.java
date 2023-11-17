package ru.anyelectronic.product.service.interfaces;

import ru.anyelectronic.product.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProduct();

    ProductDto getProductById(Long productId);
}
