package sample.di.business.service;

import sample.di.business.domain.Product;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void addProduct(Product product) {
        productDao.addProduct(product);

    }

    public Product findByProductName(String name) {
        return productDao.findByProductName(name);
    }
}