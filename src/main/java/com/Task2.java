package com;

import com.models.Login;
import com.models.User;

/*
 2) аналогично переделай программу из пункта 1 так , чтобы ты стал использовать глубокое клонирование
*/
public class Task2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Ivan", "Sokolov", new Login(15));
        Object newUser = user.clone();
        System.out.println(user);
        System.out.println(newUser);
        user.getLogin().setLength(12);
        System.out.println("<<<<<<After changes>>>>>");
        System.out.println(user);
        System.out.println(newUser);
    }
}
