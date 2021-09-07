package com;
/*
 3) помимо использования интерфейса Cloneable перепиши код программы из пункта 2 так чтобы он стал
 использовать одну из сторонних библиотек: либо Kryo, либо Dozer вместо implements Cloneable
 все задачи предоставь отдельными программными файлами в одном проекте
*/

import com.models.Login;
import com.models.User;
import com.rits.cloning.Cloner;

public class Task3 {
    public static void main(String[] args) {
        User user = new User("Anton", "Gorodetsky", new Login(24));
        Cloner cloner = new Cloner();
        Object clonedUser = cloner.deepClone(user);

        System.out.println(user);
        System.out.println(clonedUser);
        user.getLogin().setLength(111);
        System.out.println("<<<After changes>>>");
        System.out.println(user);
        System.out.println(clonedUser);
    }
}
