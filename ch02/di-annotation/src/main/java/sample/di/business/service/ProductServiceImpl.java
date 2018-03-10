package sample.di.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import sample.di.business.domain.Product;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public void addProduct(Product product) {
        productDao.addProduct(product);

    }

    public Product findByProductName(String name) {
        return productDao.findByProductName(name);
    }
}