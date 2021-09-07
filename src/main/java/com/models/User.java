package com.models;

public class User implements Cloneable{
    private String name;
    private String surname;
    private Login login;

    public User(String name, String surname, Login login) {
        this.name = name;
        this.surname = surname;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User newUser = (User) super.clone();
        Login login = (Login) this.getLogin().clone();
        newUser.setLogin(login);
        return newUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login=" + login +
                '}';
    }
}
