package fr.polytech.web.demo9octobre2020.controller;

import java.util.List;

public interface ProductDao {

    public List<Product> findAll();
    public Product findID(int code);


}
