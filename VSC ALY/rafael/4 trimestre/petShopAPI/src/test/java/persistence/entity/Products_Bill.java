package persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos_factura")
public class Products_Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_productos_factura")
    private Integer id; // Clave primaria

    @ManyToOne
    @JoinColumn(name = "id_factura", referencedColumnName = "id_factura")
    private Bill bill; // Relación con Bill

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Products product; // Relación con Products


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }
}
