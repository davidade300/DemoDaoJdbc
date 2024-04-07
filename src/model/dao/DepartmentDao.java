package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj); //insere no bd o objeto enviado como parametro de entrada

    void update(Department obj);

    void deleteById(Integer id);

    Department findById(Integer id); //consulta no bd, a partir do id, se existir retorna, se nao, retorna nulo

    List<Department> findAll();
}