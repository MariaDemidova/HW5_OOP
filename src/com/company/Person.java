package com.company;

public class Person {
    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int pay;
    private int age;

    public Person(String fullName, String post, String email, String phone, int pay, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getPay() {
        return pay;
    }

    public int getAge() {
        return age;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void showInfo() {
        System.out.printf("ФИО: %s, должность: %s, e-mail: %s, телефон: %s, зарплата: %d, возраст: %d%n", fullName, post, email, phone, pay, age);
    }
}
