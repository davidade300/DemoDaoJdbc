package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj); //insere no bd o objeto enviado como parametro de entrada

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id); //consulta no bd, a partir do id, se existir retorna, se nao, retorna nulo

    List<Seller> findAll();
}