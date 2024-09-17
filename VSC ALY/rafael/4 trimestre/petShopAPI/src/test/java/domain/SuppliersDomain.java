package domain;

public class SuppliersDomain {
    private Integer idSupplier;
    private String nameSuppliers;
    private String productsSuppliers;


    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNameSuppliers() {
        return nameSuppliers;
    }

    public void setNameSuppliers(String nameSuppliers) {
        this.nameSuppliers = nameSuppliers;
    }

    public String getProductsSuppliers() {
        return productsSuppliers;
    }

    public void setProductsSuppliers(String productsSuppliers) {
        this.productsSuppliers = productsSuppliers;
    }

    public static class Products_Bill {
    }
}
