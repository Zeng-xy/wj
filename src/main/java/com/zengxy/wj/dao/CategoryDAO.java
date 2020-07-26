package com.zengxy.wj.dao;



import com.zengxy.wj.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
