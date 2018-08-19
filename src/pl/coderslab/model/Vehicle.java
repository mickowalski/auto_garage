package pl.coderslab.model;

import java.util.Date;

public class Vehicle {
    protected int id;
    private String model;
    private String mark;
    private int production_date;
    private String registration_number;
    private Date next_check;
    private int customer_id;

    public Vehicle(){

    }

    public Vehicle(String model, String mark, int production_date, String registration_number, Date next_check, int customer_id) {
        this.id = 0;
        setModel(model).
        setMark(mark).
        setProduction_date(production_date).
        setRegistration_number(registration_number).
        setNext_check(next_check).
        setCustomer_id(customer_id);
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public String getMark() {
        return mark;
    }

    public Vehicle setMark(String mark) {
        this.mark = mark;
        return this;
    }

    public int getProduction_date() {
        return production_date;
    }

    public Vehicle setProduction_date(int production_date) {
        this.production_date = production_date;
        return this;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public Vehicle setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
        return this;
    }

    public Date getNext_check() {
        return next_check;
    }

    public Vehicle setNext_check(Date next_check) {
        this.next_check = next_check;
        return this;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public Vehicle setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
        return this;
    }
}
