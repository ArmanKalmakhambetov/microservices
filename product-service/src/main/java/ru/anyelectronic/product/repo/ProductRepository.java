package ru.anyelectronic.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.anyelectronic.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
