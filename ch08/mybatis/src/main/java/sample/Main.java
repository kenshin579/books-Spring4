package sample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

import sample.config.DataSourceConfig;
import sample.config.MyBatisConfig;
import sample.mybatis.business.domain.Pet;
import sample.mybatis.business.service.PetDao;

public class Main {

    public static void main(String[] args) {
    	//Spring의 컨테이너를 생성        
    	//JavaConfig로 Bean을 정의한 경우
        ApplicationContext ctx = new AnnotationConfigApplicationContext(DataSourceConfig.class, MyBatisConfig.class);

    	//Spring의 컨테이너를 생성  
    	//XML로 Bean을 정의한 경우
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("sample/config/spring-mybatis.xml");
        
        
        PetDao dao = ctx.getBean(PetDao.class);
        
        List<Pet> list = dao.findAll();
        
        System.out.println(list.get(0).getPetName());
                
        Pet p = dao.findById(12);
        System.out.println(p.getPetName());
        
    }
}
