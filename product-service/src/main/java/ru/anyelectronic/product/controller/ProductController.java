package ru.anyelectronic.product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.anyelectronic.product.dto.ProductDto;
import ru.anyelectronic.product.response.ResponseProduct;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    public static final String GET_ALL_PRODUCT = "/products";
    public static final String GET_PRODUCT_BY_ID = "/{id}";
    public static final String ADD_NEW_PRODUCT = "/create";
    public static final String DELETE_PRODUCT_BY_ID = "/{id}";

    @GetMapping(GET_ALL_PRODUCT)
    public ResponseEntity<List<ProductDto>> getAllProduct() {
        // TODO: 18.11.2023
        return null;
    }

    @GetMapping(GET_PRODUCT_BY_ID)
    public ResponseEntity<ProductDto> getProductById(@PathVariable String productId) {
        // TODO: 18.11.2023
        return null;
    }

    @PostMapping(ADD_NEW_PRODUCT)
    public ResponseEntity<ProductDto> addNewProduct(ProductDto productDTO) {
        // TODO: 18.11.2023
        return null;
    }

    @DeleteMapping(DELETE_PRODUCT_BY_ID)
    public ResponseEntity<ResponseProduct> deleteProductById(String productId) {
        // TODO: 18.11.2023
        return null;
    }
}
