package sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.aop.business.domain.Product;
import sample.aop.business.service.ProductService;

public class ProductSampleRun {

    public static void main(String[] args) {
        ProductSampleRun productSampleRun = new ProductSampleRun();
        productSampleRun.execute();
    }

    @SuppressWarnings("resource")
    public void execute() {
        // BeanFactory는 ApplicationContext에 적어도 괜찮습니다.
        BeanFactory ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ProductService productService = ctx.getBean(ProductService.class);

        productService.addProduct(new Product("공책", 100));

        Product product = productService.findByProductName("공책");
        System.out.println(product);
    }
}