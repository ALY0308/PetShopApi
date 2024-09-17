package domain.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import persistence.entity.Bill;

import java.util.List;

public class BillDTO {
    private Integer id_bill;
    private String date;
    private String petshop;
    private String customer;
    private String product;
    private String service;
    private Double price;
    private Double final_price;

    public Integer getId_bill() {
        return id_bill;
    }

    public void setId_bill(Integer id_bill) {
        this.id_bill = id_bill;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPetshop() {
        return petshop;
    }

    public void setPetshop(String petshop) {
        this.petshop = petshop;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getFinal_price() {
        return final_price;
    }

    public void setFinal_price(Double final_price) {
        this.final_price = final_price;
    }
}
