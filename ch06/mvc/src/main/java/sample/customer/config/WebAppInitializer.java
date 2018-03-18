///*
// *
// */
//package sample.customer.config;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
//
//
///**
// * web.xml 없이 사용할 수 있음.
//todo: 잘 안됨.
// */
//public class WebAppInitializer extends AbstractDispatcherServletInitializer {
//
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        XmlWebApplicationContext ctx = new XmlWebApplicationContext();
//        ctx.setConfigLocation("classpath:/META-INF/spring/beans-biz.xml");
//        return ctx;
//    }
//
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        XmlWebApplicationContext ctx = new XmlWebApplicationContext();
//        ctx.setConfigLocation("classpath:/META-INF/spring/beans-webmvc.xml");
//        return ctx;
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    @Override
//    protected Filter[] getServletFilters() {
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setEncoding("UTF-8");
//        characterEncodingFilter.setForceEncoding(true);
//
//        return new Filter[]{characterEncodingFilter};
//    }
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//
//    }
//
//
//}