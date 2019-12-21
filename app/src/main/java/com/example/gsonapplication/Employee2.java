package com.example.gsonapplication;

import com.google.gson.annotations.Expose;

public class Employee2 {
    @Expose // will show
    private String firstName;
    @Expose(serialize = false) // will not show
    private int age;
    @Expose(deserialize = false) // will show
    private String mail;

    private String password; // will not show

    public Employee2(String firstName, int age, String mail, String password) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }
}
