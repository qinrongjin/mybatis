package cn.tiny77;

import cn.tiny77.mapper.BlogMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws  Throwable{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        BlogMapper mapper = (BlogMapper) ctx.getBean("blogMapper");
        System.out.println(mapper.selectBlog(1));
    }
}
