package domain;

public class BillDomain {
    private Integer idBill;
    private String dateBill;
    private String petshopBill;
    private String customerBill;
    private String productBill;
    private String serviceBill;
    private Double priceBill;
    private Double final_priceBill;


    public Integer getIdBill() {
        return idBill;
    }

    public void setIdBill(Integer idBill) {
        this.idBill = idBill;
    }

    public String getDateBill() {
        return dateBill;
    }

    public void setDateBill(String dateBill) {
        this.dateBill = dateBill;
    }

    public String getPetshopBill() {
        return petshopBill;
    }

    public void setPetshopBill(String petshopBill) {
        this.petshopBill = petshopBill;
    }

    public String getCustomerBill() {
        return customerBill;
    }

    public void setCustomerBill(String customerBill) {
        this.customerBill = customerBill;
    }

    public String getProductBill() {
        return productBill;
    }

    public void setProductBill(String productBill) {
        this.productBill = productBill;
    }

    public String getServiceBill() {
        return serviceBill;
    }

    public void setServiceBill(String serviceBill) {
        this.serviceBill = serviceBill;
    }

    public Double getPriceBill() {
        return priceBill;
    }

    public void setPriceBill(Double priceBill) {
        this.priceBill = priceBill;
    }

    public Double getFinal_priceBill() {
        return final_priceBill;
    }

    public void setFinal_priceBill(Double final_priceBill) {
        this.final_priceBill = final_priceBill;
    }
}
