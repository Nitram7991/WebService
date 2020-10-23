package fr.polytech.web.demo9octobre2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fr.polytech.web.demo9octobre2020.controller.Product;

import java.util.List;

@RestController

public class ProductController {


    //injection de dépendances
    //c'est une interface
    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String afficher(){
        return "Partie du cours Spring Boot";
    }

    @RequestMapping(value = "/produit", method = RequestMethod.GET)
    public Product product(){
        return new Product(1,"a",10);
    }

    @RequestMapping(value = "/tous", method = RequestMethod.GET)
    public List<Product> listedetouslesproduits(){
        return productDao.findAll();
    }

    @RequestMapping(value = "/un/{code}")
    public Product affiherunproduit(@PathVariable int code){
        return this.productDao.findID(code);
    }

}

