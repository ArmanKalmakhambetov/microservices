package ru.anyelectronic.product.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.anyelectronic.product.dto.ProductDto;
import ru.anyelectronic.product.response.ResponseProduct;
import ru.anyelectronic.product.service.interfaces.ProductService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    public static final String GET_ALL_PRODUCT = "/products";
    public static final String GET_PRODUCT_BY_ID = "/{productId}";
    public static final String ADD_NEW_PRODUCT = "/create";
    public static final String DELETE_PRODUCT_BY_ID = "/{productId}";

    @GetMapping(GET_ALL_PRODUCT)
    public ResponseEntity<List<ProductDto>> getAllProduct() {
        log.info("ProductController Запрос на получение всех товаров");
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping(GET_PRODUCT_BY_ID)
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long productId) {
        // TODO: 18.11.2023
        return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);
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
