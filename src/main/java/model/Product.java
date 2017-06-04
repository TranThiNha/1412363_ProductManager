package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by MyPC on 6/4/2017.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")

    private int id;

    @Column(name = "product_name")
    @NotNull
    private String productName;

    @Column(name = "cost")
    @NotNull
    private Double cost;

    @Column(name = "describe")
    @NotNull
    private String describe;

    public Product(){}

    public Product(int id, String name, Double cost,String describe){
        this.id = id;
        this.productName = name;
        this.cost = cost;
        this.describe = describe;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
