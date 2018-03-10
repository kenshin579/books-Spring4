package sample.di.dataaccess;

import sample.di.business.domain.Product;
import sample.di.business.service.ProductDao;

import java.util.HashMap;
import java.util.Map;

public class ProductDaoImpl implements ProductDao {
    // Dao만으로 간단하게 구현하게 위해서 RDB에 접속은 하지 않습니다.
    // Map은 RDB대신으로 사용
    private Map<String, Product> storage = new HashMap<String, Product>();

    public Product findByProductName(String name) {
        return storage.get(name);
    }

    public void addProduct(Product product) {
        storage.put(product.getName(), product);
    }
}
