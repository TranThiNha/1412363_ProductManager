package model;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by MyPC on 6/4/2017.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @Column(name = "id")
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    private int id;

    @Column(name = "product_name")
    @NotNull
    private String productName;

    @Column(name = "cost")
    @NotNull
    private Double cost;

    @Column(name = "description")
    @NotNull
    private String description;

    public Product(){

    }

    public Product(int id, String productName, Double cost,String describe){
        this.id = id;
        this.productName = productName;
        this.cost = cost;
        this.description = describe;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setdescription(String describe) {
        this.description = describe;
    }
}
