package pl.coderslab.model;

public class Employee {

    private int id;
    private  String name;
    private String surname;
    private String address;
    private  int phone;
    private float cost_per_hour;

    public Employee(){

    }

    public Employee(String name, String surname, String address, int phone, float cost_per_hour) {
        this.id = 0;
        setName(name).
        setSurname(surname).
        setAddress(address).
        setPhone(phone).
        setCost_per_hour(cost_per_hour);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Employee setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getPhone() {
        return phone;
    }

    public Employee setPhone(int phone) {
        this.phone = phone;
        return this;
    }

    public float getCost_per_hour() {
        return cost_per_hour;
    }

    public Employee setCost_per_hour(float cost_per_hour) {
        this.cost_per_hour = cost_per_hour;
        return this;
    }
}
