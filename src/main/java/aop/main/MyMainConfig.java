package aop.main;

import aop.dao.Dao;
import com.example.springaop.SpringAopApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyMainConfig {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(SpringAopApplication.class);
        Dao dao = configApplicationContext.getBean("dao", Dao.class);
//        dao.getMsg();
//        dao.updateAccount();
        dao.getArgsMethod("Shagun");    }

}
