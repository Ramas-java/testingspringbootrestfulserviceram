package com.springframeworkrama.Service;

import com.springframeworkrama.Exception.ProductAlreadyExistsException;
import com.springframeworkrama.model.Product;

import java.util.List;

public interface ProductService {

     Product addProduct(Product product) throws ProductAlreadyExistsException;
    List<Product> getAllProducts();
     Product getProductByid(int id);
    Product deleteProductById(int id);



}
