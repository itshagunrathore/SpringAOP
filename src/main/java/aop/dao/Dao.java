package aop.dao;

import org.springframework.stereotype.Component;

@Component
public class Dao {

    public void getMsg() {
        System.out.println("This is msg under getmsg    ");

    }
    public void updateAccount() {
        System.out.println("Inside update account method");
    }
}
