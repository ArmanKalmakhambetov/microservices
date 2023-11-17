package ru.anyelectronic.product.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.anyelectronic.product.converter.Converter;
import ru.anyelectronic.product.dto.ProductDto;
import ru.anyelectronic.product.model.Product;
import ru.anyelectronic.product.repo.ProductRepository;
import ru.anyelectronic.product.service.interfaces.ProductService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    @Transactional(readOnly = true)
    public List<ProductDto> getAllProduct() {
        log.info("ProductServiceImpl Получаем весь список товаров");
        List<Product> products = productRepository.findAll();

        return products.stream()
                .map(Converter::convertProductToProductDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto getProductById(Long productId) {

        log.info("ProductServiceImpl Получаем товар по ID");
        Optional<Product> product = productRepository.findById(productId);

        // TODO: Подумать что вернуть в orElse или написать ControllerAdvice
        return product.map(Converter::convertProductToProductDto).orElse(null);
    }
}
