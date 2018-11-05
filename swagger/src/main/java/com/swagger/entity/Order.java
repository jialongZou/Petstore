package com.swagger.entity;

import java.util.Date;

public class Order {
    private Integer o_id;

    private Integer o_petId;

    private Integer o_quantity;

    private Date o_shipDate;

    private String o_status;

    private String o_complete;

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public Integer getO_petId() {
        return o_petId;
    }

    public void setO_petId(Integer o_petId) {
        this.o_petId = o_petId;
    }

    public Integer getO_quantity() {
        return o_quantity;
    }

    public void setO_quantity(Integer o_quantity) {
        this.o_quantity = o_quantity;
    }

    public Date getO_shipDate() {
        return o_shipDate;
    }

    public void setO_shipDate(Date o_shipDate) {
        this.o_shipDate = o_shipDate;
    }

    public String getO_status() {
        return o_status;
    }

    public void setO_status(String o_status) {
        this.o_status = o_status == null ? null : o_status.trim();
    }

    public String getO_complete() {
        return o_complete;
    }

    public void setO_complete(String o_complete) {
        this.o_complete = o_complete == null ? null : o_complete.trim();
    }
}