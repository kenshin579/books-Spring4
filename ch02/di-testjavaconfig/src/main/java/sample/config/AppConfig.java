package sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sample.di.business.service.ProductDao;
import sample.di.business.service.ProductServiceImpl;
import sample.di.dataaccess.ProductDaoImpl;

@Configuration
public class AppConfig {

    /*
    객체(productDao)를 어떤 수단으로 취득할지에 대한 3가지 방법
    1. @Bean 메서드를 인수로부터 취득
    2. @Bean 메서드를 불러들여서 취득
    3. @Autowired 프로퍼티에서 취득
     */
    //1. @Bean 메서드를 인수로부터 취득
//    @Bean
//    public ProductServiceImpl productServices(ProductDao productDao) {
//        return new ProductServiceImpl(productDao);
//    }

    //2. @Bean 메서드를 불러들여서 취득 - 전제는 같은 JavaConfig안에서 @Bean 메서드가 정의된 경우에
//    @Bean
//    public ProductServiceImpl productServices() {
//        return new ProductServiceImpl(productDao());
//    }

    //3. @Autowired 프로퍼티에서 취득
    @Autowired
    private ProductDao productDao;

    @Bean
    public ProductServiceImpl productServices() {
        return new ProductServiceImpl(productDao);
    }

    @Bean
    public ProductDaoImpl productDao() {
        return new ProductDaoImpl();
    }
}