package pl.coderslab.model;

import java.util.Date;

public class Order {
    private  int id;
    private Date registration_date;
    private Date planed_start_date;
    private Date start_date;
    private String problem_desc;
    private String solution_desc;
    private String status;
    private float repair_cost;
    private float items_cost;
    private float cost_per_hour;
    private int hours;
    private int vehicle_id;

    public Order(){

    }

    public Order(Date registration_date, Date planed_start_date, Date start_date, String problem_desc, String solution_desc, String status, float repair_cost, float items_cost, float cost_per_hour, int hours, int vehicle_id) {
        this.id=0;
        setRegistration_date(registration_date).
        setPlaned_start_date(planed_start_date).
        setStart_date(start_date).
        setProblem_desc(problem_desc).
        setSolution_desc(solution_desc).
        setStatus(status).
        setRepair_cost(repair_cost).
        setItems_cost(items_cost).
        setCost_per_hour(cost_per_hour).
        setHours(hours).
        setVehicle_id(vehicle_id);
    }

    public int getId() {
        return id;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public Order setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
        return  this;
    }

    public Date getPlaned_start_date() {
        return planed_start_date;
    }

    public Order setPlaned_start_date(Date planed_start_date) {
        this.planed_start_date = planed_start_date;
        return this;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Order setStart_date(Date start_date) {
        this.start_date = start_date;
        return this;
    }

    public String getProblem_desc() {
        return problem_desc;
    }

    public Order setProblem_desc(String problem_desc) {
        this.problem_desc = problem_desc;
        return this;
    }

    public String getSolution_desc() {
        return solution_desc;
    }

    public Order setSolution_desc(String solution_desc) {
        this.solution_desc = solution_desc;
        return  this;
    }

    public String getStatus() {
        return status;
    }

    public Order setStatus(String status) {
        this.status = status;
        return this;
    }

    public float getRepair_cost() {
        return repair_cost;
    }

    public Order setRepair_cost(float repair_cost) {
        this.repair_cost = repair_cost;
        return this;
    }

    public float getItems_cost() {
        return items_cost;
    }

    public Order setItems_cost(float items_cost) {
        this.items_cost = items_cost;
        return this;
    }

    public float getCost_per_hour() {
        return cost_per_hour;
    }

    public Order setCost_per_hour(float cost_per_hour) {
        this.cost_per_hour = cost_per_hour;
        return this;
    }

    public int getHours() {
        return hours;
    }

    public Order setHours(int hours) {
        this.hours = hours;
        return this;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public Order setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
        return this;
    }
}
