package dao;

import model.Product;

import java.util.List;

/**
 * Created by MyPC on 6/4/2017.
 */
public interface ProductDao {
    public void createProduct(Product product);
    public void updateProduct(Product newProduct);
    public void deleteProduct(int id);
    public Product getProduct(int id);
    public List<Product>getAllProduct();
}
