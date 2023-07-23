package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id); //pega id e consulta objeto no banco
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
