package sample.customer.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@ComponentScan("sample.customer.biz.service")
public class BizConfig {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource
                = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/META-INF/messages");

        return messageSource;
    }

    //아래는 스프링 MVC의 JavaConfig로 이동함 (WebConfig.java)
    //@EnableWebMvc 어노테이션에서 스프링 MVC 설정을 유효하면 Validator 오브젝트가 Bean으로 자동 등록됨
//    @Bean
//    public Validator globalValidator(MessageSource messageSource) {
//        LocalValidatorFactoryBean validatorBean = new LocalValidatorFactoryBean();
//        validatorBean.setValidationMessageSource(messageSource);
//        return validatorBean;
//    }
}
