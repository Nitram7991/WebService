package fr.polytech.web.demo9octobre2020.controller;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PorductDaoImpl implements ProductDao{

    public static List<Product> list = new ArrayList<>();
    static{
        list.add((new Product(1,"PC",1200)));
        list.add(new Product(2,"Tabelette",500));
        list.add((new Product(3,"Ordinateur portable",600)));
        list.add(new Product(4,"Ecran",150));
    }


    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public Product findID(int code) {
        return list.get(code);
    }
}
