package com.models;

public class Login implements Cloneable {
    private int length;

    public Login(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Login) super.clone();
    }

    @Override
    public String toString() {
        return "Login{" +
                "length=" + length +
                '}';
    }
}
