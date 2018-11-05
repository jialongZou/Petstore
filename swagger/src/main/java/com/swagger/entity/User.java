package com.swagger.entity;

public class User {
    private Integer u_id;

    private String u_username;

    private String u_password;

    private String u_firstName;

    private String u_lastName;

    private String u_email;

    private String u_phone;

    private Integer u_status;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username == null ? null : u_username.trim();
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password == null ? null : u_password.trim();
    }

    public String getU_firstName() {
        return u_firstName;
    }

    public void setU_firstName(String u_firstName) {
        this.u_firstName = u_firstName == null ? null : u_firstName.trim();
    }

    public String getU_lastName() {
        return u_lastName;
    }

    public void setU_lastName(String u_lastName) {
        this.u_lastName = u_lastName == null ? null : u_lastName.trim();
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email == null ? null : u_email.trim();
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone == null ? null : u_phone.trim();
    }

    public Integer getU_status() {
        return u_status;
    }

    public void setU_status(Integer u_status) {
        this.u_status = u_status;
    }
}