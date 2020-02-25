package com.biye.springbootweb.bean;

public class Employee {

    private Integer id;
    private String lastname;
    private Integer gender;
    private String email;
    private Integer dId;

    public Employee() {
    }

    public Employee(Integer id, String lastname, Integer gender, String email, Integer dId) {
        this.id = id;
        this.lastname = lastname;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}
