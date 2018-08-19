package pl.coderslab.model;

import java.util.Date;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private Date birthday;

    public Customer(){

    }

    public Customer(String name, String surname, Date birthday) {
       this.id=0;
       setName(name).
       setSurname(surname).
       setBirthday(birthday);
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Customer setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Customer setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public int getId() {
        return id;


    }
}
