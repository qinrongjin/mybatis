package cn.tiny77;

import cn.tiny77.bean.Blog;
import cn.tiny77.mapper.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

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
